// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangDeviateDeleteStmt extends PsiElement {

  @Nullable
  YangDefaultStmt getDefaultStmt();

  @NotNull
  List<YangMustStmt> getMustStmtList();

  @NotNull
  List<YangUniqueStmt> getUniqueStmtList();

  @Nullable
  YangUnitsStmt getUnitsStmt();

}
