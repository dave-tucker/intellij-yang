// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangNotificationStmt extends PsiElement {

  @NotNull
  List<YangAnyxmlStmt> getAnyxmlStmtList();

  @NotNull
  List<YangChoiceStmt> getChoiceStmtList();

  @NotNull
  List<YangContainerStmt> getContainerStmtList();

  @Nullable
  YangDescriptionStmt getDescriptionStmt();

  @NotNull
  List<YangGroupingStmt> getGroupingStmtList();

  @NotNull
  List<YangIfFeatureStmt> getIfFeatureStmtList();

  @NotNull
  List<YangLeafListStmt> getLeafListStmtList();

  @NotNull
  List<YangLeafStmt> getLeafStmtList();

  @NotNull
  List<YangListStmt> getListStmtList();

  @Nullable
  YangReferenceStmt getReferenceStmt();

  @Nullable
  YangStatusStmt getStatusStmt();

  @NotNull
  YangStringStmt getStringStmt();

  @NotNull
  List<YangTypedefStmt> getTypedefStmtList();

  @NotNull
  List<YangUsesStmt> getUsesStmtList();

}
