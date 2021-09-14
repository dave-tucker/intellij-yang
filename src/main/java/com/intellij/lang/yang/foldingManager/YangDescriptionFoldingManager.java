package com.intellij.lang.yang.foldingManager;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.lang.psi.YangString;
import com.intellij.lang.psi.impl.YangDescriptionStmtImpl;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.project.DumbAware;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class YangDescriptionFoldingManager extends FoldingBuilderEx implements DumbAware {

    private FoldingDescriptor[] descriptors;

    public YangDescriptionFoldingManager() {
        this.descriptors = new FoldingDescriptor[0];
    }

    @NotNull
    @Override
    public FoldingDescriptor[] buildFoldRegions(@NotNull final PsiElement root, @NotNull final Document document, final boolean b) {
        if (YangFoldingManagerUtil.isFileValid(root)) {
            // Initialize the list of folding regions
            final List<FoldingDescriptor> descriptors = new ArrayList<>();
            // Get a collection of the all Description elements in the document below root
            final var allElementsInFile =
                    new ArrayList<>(PsiTreeUtil.findChildrenOfType(root, YangDescriptionStmtImpl.class));

            allElementsInFile
                    .stream()
                    .forEach(e -> YangFoldingManagerUtil.addElementToDescriptors(
                            descriptors, root, e, this.getDescriptionStartOffset(e)));
            this.descriptors = descriptors.toArray(new FoldingDescriptor[descriptors.size()]);
            return this.descriptors;
        }
        return this.descriptors;
    }

    @Override
    public @Nullable
    String getPlaceholderText(@NotNull final ASTNode astNode) {
        return "\"...\";";
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull final ASTNode astNode) {
        return false;
    }

    private int getDescriptionStartOffset(final @NotNull YangDescriptionStmtImpl element) {
        final var child = PsiTreeUtil.findChildOfType(element, YangString.class);
        return child != null ? child.getTextOffset() : -1;
    }
}
