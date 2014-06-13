// This is a generated file. Not intended for manual editing.
package com.intellij.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangDeviateDeleteStmt extends PsiElement {

  @NotNull
  List<YangDefaultStmt> getDefaultStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangMustStmt> getMustStmtList();

  @NotNull
  YangString getString();

  @NotNull
  List<YangUniqueStmt> getUniqueStmtList();

  @NotNull
  List<YangUnitsStmt> getUnitsStmtList();

}
