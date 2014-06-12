// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangRpcStmt extends PsiElement {

  @Nullable
  YangDescriptionStmt getDescriptionStmt();

  @NotNull
  List<YangGroupingStmt> getGroupingStmtList();

  @NotNull
  List<YangIfFeatureStmt> getIfFeatureStmtList();

  @Nullable
  YangInputStmt getInputStmt();

  @Nullable
  YangOutputStmt getOutputStmt();

  @Nullable
  YangReferenceStmt getReferenceStmt();

  @Nullable
  YangStatusStmt getStatusStmt();

  @NotNull
  YangStringStmt getStringStmt();

  @NotNull
  List<YangTypedefStmt> getTypedefStmtList();

}
