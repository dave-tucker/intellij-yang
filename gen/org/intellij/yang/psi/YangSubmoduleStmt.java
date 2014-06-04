// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangSubmoduleStmt extends PsiElement {

  @NotNull
  List<YangAnyxmlStmt> getAnyxmlStmtList();

  @NotNull
  List<YangAugmentStmt> getAugmentStmtList();

  @NotNull
  YangBelongsToStmt getBelongsToStmt();

  @NotNull
  List<YangChoiceStmt> getChoiceStmtList();

  @Nullable
  YangContactStmt getContactStmt();

  @NotNull
  List<YangContainerStmt> getContainerStmtList();

  @Nullable
  YangDescriptionStmt getDescriptionStmt();

  @NotNull
  List<YangDeviationStmt> getDeviationStmtList();

  @NotNull
  List<YangExtensionStmt> getExtensionStmtList();

  @NotNull
  List<YangFeatureStmt> getFeatureStmtList();

  @NotNull
  List<YangGroupingStmt> getGroupingStmtList();

  @NotNull
  List<YangIdentityStmt> getIdentityStmtList();

  @NotNull
  List<YangImportStmt> getImportStmtList();

  @NotNull
  List<YangIncludeStmt> getIncludeStmtList();

  @NotNull
  List<YangLeafListStmt> getLeafListStmtList();

  @NotNull
  List<YangLeafStmt> getLeafStmtList();

  @NotNull
  List<YangListStmt> getListStmtList();

  @NotNull
  List<YangNotificationStmt> getNotificationStmtList();

  @Nullable
  YangOrganizationStmt getOrganizationStmt();

  @Nullable
  YangReferenceStmt getReferenceStmt();

  @NotNull
  List<YangRevisionStmt> getRevisionStmtList();

  @NotNull
  List<YangRpcStmt> getRpcStmtList();

  @NotNull
  List<YangTypedefStmt> getTypedefStmtList();

  @NotNull
  List<YangUsesStmt> getUsesStmtList();

  @Nullable
  YangYangVersionStmt getYangVersionStmt();

}
