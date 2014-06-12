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

public class YangLeafListStmtImpl extends ASTWrapperPsiElement implements YangLeafListStmt {

  public YangLeafListStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitLeafListStmt(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangConfigStmt getConfigStmt() {
    return findChildByClass(YangConfigStmt.class);
  }

  @Override
  @Nullable
  public YangDescriptionStmt getDescriptionStmt() {
    return findChildByClass(YangDescriptionStmt.class);
  }

  @Override
  @NotNull
  public List<YangIfFeatureStmt> getIfFeatureStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIfFeatureStmt.class);
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
  @NotNull
  public List<YangMustStmt> getMustStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMustStmt.class);
  }

  @Override
  @Nullable
  public YangOrderedByStmt getOrderedByStmt() {
    return findChildByClass(YangOrderedByStmt.class);
  }

  @Override
  @Nullable
  public YangReferenceStmt getReferenceStmt() {
    return findChildByClass(YangReferenceStmt.class);
  }

  @Override
  @Nullable
  public YangStatusStmt getStatusStmt() {
    return findChildByClass(YangStatusStmt.class);
  }

  @Override
  @NotNull
  public YangStringStmt getStringStmt() {
    return findNotNullChildByClass(YangStringStmt.class);
  }

  @Override
  @NotNull
  public YangTypeStmt getTypeStmt() {
    return findNotNullChildByClass(YangTypeStmt.class);
  }

  @Override
  @Nullable
  public YangUnitsStmt getUnitsStmt() {
    return findChildByClass(YangUnitsStmt.class);
  }

  @Override
  @Nullable
  public YangWhenStmt getWhenStmt() {
    return findChildByClass(YangWhenStmt.class);
  }

}
