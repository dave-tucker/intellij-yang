// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.yang.psi.*;

public class YangDeviateReplaceStmtImpl extends ASTWrapperPsiElement implements YangDeviateReplaceStmt {

  public YangDeviateReplaceStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitDeviateReplaceStmt(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangConfigStmt getConfigStmt() {
    return findChildByClass(YangConfigStmt.class);
  }

  @Override
  @Nullable
  public YangDefaultStmt getDefaultStmt() {
    return findChildByClass(YangDefaultStmt.class);
  }

  @Override
  @Nullable
  public YangMandatoryStmt getMandatoryStmt() {
    return findChildByClass(YangMandatoryStmt.class);
  }

  @Override
  @Nullable
  public YangMaxElementsStmt getMaxElementsStmt() {
    return findChildByClass(YangMaxElementsStmt.class);
  }

  @Override
  @Nullable
  public YangMinElementsStmt getMinElementsStmt() {
    return findChildByClass(YangMinElementsStmt.class);
  }

  @Override
  @Nullable
  public YangTypeStmt getTypeStmt() {
    return findChildByClass(YangTypeStmt.class);
  }

  @Override
  @Nullable
  public YangUnitsStmt getUnitsStmt() {
    return findChildByClass(YangUnitsStmt.class);
  }

}
