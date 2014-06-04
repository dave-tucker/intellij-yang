// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.yang.psi.*;

public class YangSubmoduleStmtImpl extends ASTWrapperPsiElement implements YangSubmoduleStmt {

  public YangSubmoduleStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitSubmoduleStmt(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangAnyxmlStmt> getAnyxmlStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangAnyxmlStmt.class);
  }

  @Override
  @NotNull
  public List<YangAugmentStmt> getAugmentStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangAugmentStmt.class);
  }

  @Override
  @NotNull
  public YangBelongsToStmt getBelongsToStmt() {
    return findNotNullChildByClass(YangBelongsToStmt.class);
  }

  @Override
  @NotNull
  public List<YangChoiceStmt> getChoiceStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangChoiceStmt.class);
  }

  @Override
  @Nullable
  public YangContactStmt getContactStmt() {
    return findChildByClass(YangContactStmt.class);
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
  public List<YangDeviationStmt> getDeviationStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDeviationStmt.class);
  }

  @Override
  @NotNull
  public List<YangExtensionStmt> getExtensionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangExtensionStmt.class);
  }

  @Override
  @NotNull
  public List<YangFeatureStmt> getFeatureStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangFeatureStmt.class);
  }

  @Override
  @NotNull
  public List<YangGroupingStmt> getGroupingStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangGroupingStmt.class);
  }

  @Override
  @NotNull
  public List<YangIdentityStmt> getIdentityStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIdentityStmt.class);
  }

  @Override
  @NotNull
  public List<YangImportStmt> getImportStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangImportStmt.class);
  }

  @Override
  @NotNull
  public List<YangIncludeStmt> getIncludeStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIncludeStmt.class);
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
  @NotNull
  public List<YangNotificationStmt> getNotificationStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangNotificationStmt.class);
  }

  @Override
  @Nullable
  public YangOrganizationStmt getOrganizationStmt() {
    return findChildByClass(YangOrganizationStmt.class);
  }

  @Override
  @Nullable
  public YangReferenceStmt getReferenceStmt() {
    return findChildByClass(YangReferenceStmt.class);
  }

  @Override
  @NotNull
  public List<YangRevisionStmt> getRevisionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangRevisionStmt.class);
  }

  @Override
  @NotNull
  public List<YangRpcStmt> getRpcStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangRpcStmt.class);
  }

  @Override
  @NotNull
  public List<YangTypedefStmt> getTypedefStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangTypedefStmt.class);
  }

  @Override
  @NotNull
  public List<YangUsesStmt> getUsesStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangUsesStmt.class);
  }

  @Override
  @Nullable
  public YangYangVersionStmt getYangVersionStmt() {
    return findChildByClass(YangYangVersionStmt.class);
  }

}
