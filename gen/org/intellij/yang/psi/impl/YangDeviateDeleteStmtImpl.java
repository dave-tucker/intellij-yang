// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.yang.psi.*;

public class YangDeviateDeleteStmtImpl extends ASTWrapperPsiElement implements YangDeviateDeleteStmt {

  public YangDeviateDeleteStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitDeviateDeleteStmt(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangDefaultStmt getDefaultStmt() {
    return findChildByClass(YangDefaultStmt.class);
  }

  @Override
  @NotNull
  public List<YangMustStmt> getMustStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMustStmt.class);
  }

  @Override
  @NotNull
  public List<YangUniqueStmt> getUniqueStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangUniqueStmt.class);
  }

  @Override
  @Nullable
  public YangUnitsStmt getUnitsStmt() {
    return findChildByClass(YangUnitsStmt.class);
  }

}
