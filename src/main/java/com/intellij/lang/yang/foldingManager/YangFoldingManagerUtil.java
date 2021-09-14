package com.intellij.lang.yang.foldingManager;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.PsiErrorElementImpl;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YangFoldingManagerUtil {

    private YangFoldingManagerUtil() {
    }

    public static boolean isFileValid(@NotNull final PsiElement root) {
        return PsiTreeUtil.findChildrenOfType(root, PsiErrorElementImpl.class).size() == 0;
    }

    public static void addElementToDescriptors(
            final List<FoldingDescriptor> descriptors,
            final PsiElement root,
            final ASTWrapperPsiElement element,
            final int startOffset) {
        descriptors.add(
                /* set to root in case of short term element error while writing code when element
                 does not exist but his body in root still does*/
                new FoldingDescriptor(root.getNode(),
                        new TextRange(startOffset,
                                element.getTextRange().getEndOffset() - 1)));
    }
}
