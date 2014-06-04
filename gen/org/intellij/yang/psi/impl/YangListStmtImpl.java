// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.yang.psi.*;

public class YangListStmtImpl extends ASTWrapperPsiElement implements YangListStmt {

  public YangListStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitListStmt(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangAnyxmlStmt> getAnyxmlStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangAnyxmlStmt.class);
  }

  @Override
  @NotNull
  public List<YangChoiceStmt> getChoiceStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangChoiceStmt.class);
  }

  @Override
  @Nullable
  public YangConfigStmt getConfigStmt() {
    return findChildByClass(YangConfigStmt.class);
  }

  @Override
  @NotNull
  public List<YangContainerStmt> getContainerStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangContainerStmt.class);
  }

  @Override
  @Nullable
  public YangDescriptionStmt getDescriptionStmt() {
    return findChildByClass(YangDescriptionStmt.class);
  }

  @Override
  @NotNull
  public List<YangGroupingStmt> getGroupingStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangGroupingStmt.class);
  }

  @Override
  @NotNull
  public List<YangIfFeatureStmt> getIfFeatureStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIfFeatureStmt.class);
  }

  @Override
  @NotNull
  public List<YangLeafListStmt> getLeafListStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangLeafListStmt.class);
  }

  @Override
  @NotNull
  public List<YangLeafStmt> getLeafStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangLeafStmt.class);
  }

  @Override
  @NotNull
  public List<YangListStmt> getListStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangListStmt.class);
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
  public YangTypeStmt getTypeStmt() {
    return findNotNullChildByClass(YangTypeStmt.class);
  }

  @Override
  @NotNull
  public List<YangTypedefStmt> getTypedefStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangTypedefStmt.class);
  }

  @Override
  @Nullable
  public YangUnitsStmt getUnitsStmt() {
    return findChildByClass(YangUnitsStmt.class);
  }

  @Override
  @NotNull
  public List<YangUsesStmt> getUsesStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangUsesStmt.class);
  }

  @Override
  @Nullable
  public YangWhenStmt getWhenStmt() {
    return findChildByClass(YangWhenStmt.class);
  }

}
