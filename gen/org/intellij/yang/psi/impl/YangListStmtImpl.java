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
  public YangAString getAString() {
    return findNotNullChildByClass(YangAString.class);
  }

  @Override
  @NotNull
  public List<YangConfigStmt> getConfigStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangConfigStmt.class);
  }

  @Override
  @NotNull
  public List<YangDataDefStmt> getDataDefStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDataDefStmt.class);
  }

  @Override
  @NotNull
  public List<YangDescriptionStmt> getDescriptionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDescriptionStmt.class);
  }

  @Override
  @NotNull
  public List<YangGroupingStmt> getGroupingStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangGroupingStmt.class);
  }

  @Override
  @NotNull
  public List<YangIdentifierStmt> getIdentifierStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIdentifierStmt.class);
  }

  @Override
  @NotNull
  public List<YangIfFeatureStmt> getIfFeatureStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIfFeatureStmt.class);
  }

  @Override
  @NotNull
  public List<YangKeyStmt> getKeyStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangKeyStmt.class);
  }

  @Override
  @NotNull
  public List<YangMaxElementsStmt> getMaxElementsStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMaxElementsStmt.class);
  }

  @Override
  @NotNull
  public List<YangMinElementsStmt> getMinElementsStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMinElementsStmt.class);
  }

  @Override
  @NotNull
  public List<YangMustStmt> getMustStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMustStmt.class);
  }

  @Override
  @NotNull
  public List<YangOrderedByStmt> getOrderedByStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangOrderedByStmt.class);
  }

  @Override
  @NotNull
  public List<YangReferenceStmt> getReferenceStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangReferenceStmt.class);
  }

  @Override
  @NotNull
  public List<YangStatusStmt> getStatusStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangStatusStmt.class);
  }

  @Override
  @NotNull
  public List<YangTypedefStmt> getTypedefStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangTypedefStmt.class);
  }

  @Override
  @NotNull
  public List<YangUniqueStmt> getUniqueStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangUniqueStmt.class);
  }

  @Override
  @NotNull
  public List<YangWhenStmt> getWhenStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangWhenStmt.class);
  }

}
