// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangDecimal64Specification extends PsiElement {

  @NotNull
  YangFractionDigitsStmt getFractionDigitsStmt();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @Nullable
  YangNumericalRestrictions getNumericalRestrictions();

}
