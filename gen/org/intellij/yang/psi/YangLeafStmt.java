// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangLeafStmt extends PsiElement {

  @NotNull
  YangAString getAString();

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
  List<YangMustStmt> getMustStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  List<YangStatusStmt> getStatusStmtList();

  @NotNull
  List<YangTypeStmt> getTypeStmtList();

  @NotNull
  List<YangUnitsStmt> getUnitsStmtList();

  @NotNull
  List<YangWhenStmt> getWhenStmtList();

}
