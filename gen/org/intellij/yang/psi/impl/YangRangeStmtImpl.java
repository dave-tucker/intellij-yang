// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.yang.psi.*;

public class YangRangeStmtImpl extends ASTWrapperPsiElement implements YangRangeStmt {

  public YangRangeStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitRangeStmt(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangDescriptionStmt getDescriptionStmt() {
    return findChildByClass(YangDescriptionStmt.class);
  }

  @Override
  @Nullable
  public YangErrorAppTagStmt getErrorAppTagStmt() {
    return findChildByClass(YangErrorAppTagStmt.class);
  }

  @Override
  @Nullable
  public YangErrorMessageStmt getErrorMessageStmt() {
    return findChildByClass(YangErrorMessageStmt.class);
  }

  @Override
  @Nullable
  public YangReferenceStmt getReferenceStmt() {
    return findChildByClass(YangReferenceStmt.class);
  }

}
