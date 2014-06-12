// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.yang.psi.YangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.yang.psi.*;

public class YangTypeStmtImpl extends ASTWrapperPsiElement implements YangTypeStmt {

  public YangTypeStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitTypeStmt(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangBaseStmt getBaseStmt() {
    return findChildByClass(YangBaseStmt.class);
  }

  @Override
  @NotNull
  public List<YangBitStmt> getBitStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangBitStmt.class);
  }

  @Override
  @NotNull
  public List<YangEnumStmt> getEnumStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangEnumStmt.class);
  }

  @Override
  @Nullable
  public YangFractionDigitsStmt getFractionDigitsStmt() {
    return findChildByClass(YangFractionDigitsStmt.class);
  }

  @Override
  @Nullable
  public YangLengthStmt getLengthStmt() {
    return findChildByClass(YangLengthStmt.class);
  }

  @Override
  @Nullable
  public YangPathStmt getPathStmt() {
    return findChildByClass(YangPathStmt.class);
  }

  @Override
  @NotNull
  public List<YangPatternStmt> getPatternStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangPatternStmt.class);
  }

  @Override
  @Nullable
  public YangRangeStmt getRangeStmt() {
    return findChildByClass(YangRangeStmt.class);
  }

  @Override
  @Nullable
  public YangRequireInstanceStmt getRequireInstanceStmt() {
    return findChildByClass(YangRequireInstanceStmt.class);
  }

  @Override
  @NotNull
  public YangStringStmt getStringStmt() {
    return findNotNullChildByClass(YangStringStmt.class);
  }

  @Override
  @NotNull
  public List<YangTypeStmt> getTypeStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangTypeStmt.class);
  }

}
