// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangDeviationStmt extends PsiElement {

  @Nullable
  YangDescriptionStmt getDescriptionStmt();

  @NotNull
  List<YangDeviateAddStmt> getDeviateAddStmtList();

  @NotNull
  List<YangDeviateDeleteStmt> getDeviateDeleteStmtList();

  @NotNull
  List<YangDeviateNotSupportedStmt> getDeviateNotSupportedStmtList();

  @NotNull
  List<YangDeviateReplaceStmt> getDeviateReplaceStmtList();

  @Nullable
  YangReferenceStmt getReferenceStmt();

  @NotNull
  YangStringStmt getStringStmt();

}
