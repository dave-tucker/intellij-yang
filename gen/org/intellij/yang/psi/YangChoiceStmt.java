// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangChoiceStmt extends PsiElement {

  @NotNull
  List<YangAnyxmlStmt> getAnyxmlStmtList();

  @NotNull
  List<YangCaseStmt> getCaseStmtList();

  @Nullable
  YangConfigStmt getConfigStmt();

  @NotNull
  List<YangContainerStmt> getContainerStmtList();

  @Nullable
  YangDefaultStmt getDefaultStmt();

  @Nullable
  YangDescriptionStmt getDescriptionStmt();

  @NotNull
  List<YangIfFeatureStmt> getIfFeatureStmtList();

  @NotNull
  List<YangLeafListStmt> getLeafListStmtList();

  @NotNull
  List<YangLeafStmt> getLeafStmtList();

  @NotNull
  List<YangListStmt> getListStmtList();

  @Nullable
  YangMandatoryStmt getMandatoryStmt();

  @Nullable
  YangReferenceStmt getReferenceStmt();

  @Nullable
  YangStatusStmt getStatusStmt();

  @NotNull
  YangStringStmt getStringStmt();

  @Nullable
  YangWhenStmt getWhenStmt();

}
