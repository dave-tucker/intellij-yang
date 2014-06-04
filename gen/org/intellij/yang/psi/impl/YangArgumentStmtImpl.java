// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.yang.psi.*;

public class YangArgumentStmtImpl extends ASTWrapperPsiElement implements YangArgumentStmt {

  public YangArgumentStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitArgumentStmt(this);
    else super.accept(visitor);
  }

}
