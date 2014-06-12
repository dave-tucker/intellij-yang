// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangExtensionStmt extends PsiElement {

  @NotNull
  YangAString getAString();

  @NotNull
  List<YangArgumentStmt> getArgumentStmtList();

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  List<YangStatusStmt> getStatusStmtList();

  @NotNull
  List<YangUnknownStatement> getUnknownStatementList();

}
