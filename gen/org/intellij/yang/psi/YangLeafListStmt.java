// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangLeafListStmt extends PsiElement {

  @Nullable
  YangConfigStmt getConfigStmt();

  @Nullable
  YangDescriptionStmt getDescriptionStmt();

  @NotNull
  List<YangIfFeatureStmt> getIfFeatureStmtList();

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

  @Nullable
  YangUnitsStmt getUnitsStmt();

  @Nullable
  YangWhenStmt getWhenStmt();

}
