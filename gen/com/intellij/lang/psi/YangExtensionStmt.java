// This is a generated file. Not intended for manual editing.
package com.intellij.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangExtensionStmt extends PsiElement {

  @NotNull
  List<YangArgumentStmt> getArgumentStmtList();

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  List<YangStatusStmt> getStatusStmtList();

  @NotNull
  YangString getString();

  @NotNull
  List<YangUnknownStatement> getUnknownStatementList();

}
