// This is a generated file. Not intended for manual editing.
package com.intellij.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangDeviationStmt extends PsiElement {

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangDeviateAddStmt> getDeviateAddStmtList();

  @NotNull
  List<YangDeviateDeleteStmt> getDeviateDeleteStmtList();

  @NotNull
  List<YangDeviateNotSupportedStmt> getDeviateNotSupportedStmtList();

  @NotNull
  List<YangDeviateReplaceStmt> getDeviateReplaceStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  YangString getString();

}
