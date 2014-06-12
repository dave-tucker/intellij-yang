// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangChoiceStmt extends PsiElement {

  @NotNull
  YangAString getAString();

  @NotNull
  List<YangCaseStmt> getCaseStmtList();

  @NotNull
  List<YangConfigStmt> getConfigStmtList();

  @NotNull
  List<YangDefaultStmt> getDefaultStmtList();

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangIfFeatureStmt> getIfFeatureStmtList();

  @NotNull
  List<YangMandatoryStmt> getMandatoryStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  List<YangShortCaseStmt> getShortCaseStmtList();

  @NotNull
  List<YangStatusStmt> getStatusStmtList();

  @NotNull
  List<YangWhenStmt> getWhenStmtList();

}
