// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangUsesStmt extends PsiElement {

  @Nullable
  YangDescriptionStmt getDescriptionStmt();

  @NotNull
  List<YangIfFeatureStmt> getIfFeatureStmtList();

  @Nullable
  YangReferenceStmt getReferenceStmt();

  @NotNull
  List<YangRefineStmt> getRefineStmtList();

  @Nullable
  YangStatusStmt getStatusStmt();

  @NotNull
  List<YangUsesAugmentStmt> getUsesAugmentStmtList();

  @Nullable
  YangWhenStmt getWhenStmt();

}
