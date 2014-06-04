// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangListStmt extends PsiElement {

  @NotNull
  List<YangAnyxmlStmt> getAnyxmlStmtList();

  @NotNull
  List<YangChoiceStmt> getChoiceStmtList();

  @Nullable
  YangConfigStmt getConfigStmt();

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
  YangMaxElementsStmt getMaxElementsStmt();

  @Nullable
  YangMinElementsStmt getMinElementsStmt();

  @NotNull
  List<YangMustStmt> getMustStmtList();

  @Nullable
  YangOrderedByStmt getOrderedByStmt();

  @Nullable
  YangReferenceStmt getReferenceStmt();

  @Nullable
  YangStatusStmt getStatusStmt();

  @NotNull
  YangTypeStmt getTypeStmt();

  @NotNull
  List<YangTypedefStmt> getTypedefStmtList();

  @Nullable
  YangUnitsStmt getUnitsStmt();

  @NotNull
  List<YangUsesStmt> getUsesStmtList();

  @Nullable
  YangWhenStmt getWhenStmt();

}
