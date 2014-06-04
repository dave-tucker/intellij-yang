// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.yang.psi.*;

public class YangImportStmtImpl extends ASTWrapperPsiElement implements YangImportStmt {

  public YangImportStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitImportStmt(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangPrefixStmt getPrefixStmt() {
    return findNotNullChildByClass(YangPrefixStmt.class);
  }

  @Override
  @Nullable
  public YangRevisionDateStmt getRevisionDateStmt() {
    return findChildByClass(YangRevisionDateStmt.class);
  }

}
