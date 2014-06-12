// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangUsesStmt extends PsiElement {

  @NotNull
  YangAString getAString();

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangIfFeatureStmt> getIfFeatureStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  List<YangRefineStmt> getRefineStmtList();

  @NotNull
  List<YangStatusStmt> getStatusStmtList();

  @NotNull
  List<YangUsesAugmentStmt> getUsesAugmentStmtList();

  @NotNull
  List<YangWhenStmt> getWhenStmtList();

}
