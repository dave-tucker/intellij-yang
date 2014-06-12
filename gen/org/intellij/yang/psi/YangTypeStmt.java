// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangTypeStmt extends PsiElement {

  @Nullable
  YangBaseStmt getBaseStmt();

  @NotNull
  List<YangBitStmt> getBitStmtList();

  @NotNull
  List<YangEnumStmt> getEnumStmtList();

  @Nullable
  YangFractionDigitsStmt getFractionDigitsStmt();

  @Nullable
  YangLengthStmt getLengthStmt();

  @Nullable
  YangPathStmt getPathStmt();

  @NotNull
  List<YangPatternStmt> getPatternStmtList();

  @Nullable
  YangRangeStmt getRangeStmt();

  @Nullable
  YangRequireInstanceStmt getRequireInstanceStmt();

  @NotNull
  YangStringStmt getStringStmt();

  @NotNull
  List<YangTypeStmt> getTypeStmtList();

}
