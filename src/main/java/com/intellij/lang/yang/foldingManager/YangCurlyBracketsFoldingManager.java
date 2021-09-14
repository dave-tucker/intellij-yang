package com.intellij.lang.yang.foldingManager;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.lang.yang.psi.YangTypes;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.project.DumbAware;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class YangCurlyBracketsFoldingManager extends FoldingBuilderEx implements DumbAware {

    private FoldingDescriptor[] descriptors;

    public YangCurlyBracketsFoldingManager() {
        this.descriptors = new FoldingDescriptor[0];
    }

    @NotNull
    @Override
    public FoldingDescriptor[] buildFoldRegions(
            @NotNull final PsiElement root, @NotNull final Document document, final boolean q) {
        if (YangFoldingManagerUtil.isFileValid(root)) {
            // Initialize the list of folding regions
            final List<FoldingDescriptor> descriptors = new ArrayList<>();
            // Get a collection of the literal expressions in the document below root
            final var allElementsInFile =
                    new ArrayList<>(PsiTreeUtil.findChildrenOfType(root, ASTWrapperPsiElement.class));

            allElementsInFile.stream()
                    .filter(this::endsWithRightBrace)
                    .forEach(e -> YangFoldingManagerUtil.addElementToDescriptors(
                            descriptors, root, e, this.getOffsetOfCurlyBracesElement(e)));
            this.descriptors = descriptors.toArray(new FoldingDescriptor[descriptors.size()]);
            return this.descriptors;
        }
        return this.descriptors;
    }

    @Nullable
    @Override
    public String getPlaceholderText(@NotNull final ASTNode astNode) {
        return "{ ... }";
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull final ASTNode astNode) {
        return false;
    }

    private boolean endsWithRightBrace(final ASTWrapperPsiElement element) {
        return element.getNode().getLastChildNode() != null &&
                element.getNode().getLastChildNode().getElementType()
                        .equals(YangTypes.YANG_RIGHT_BRACE);
    }

    private int getOffsetOfCurlyBracesElement(final @NotNull ASTWrapperPsiElement element) {
        var child = element.getFirstChild();
        while (child != null) {
            if (child.getNode().getElementType().equals(YangTypes.YANG_LEFT_BRACE)) {
                return child.getTextOffset();
            }
            child = PsiTreeUtil.nextLeaf(child);
        }
        // element does not contain curly braces
        return -1;
    }
}
