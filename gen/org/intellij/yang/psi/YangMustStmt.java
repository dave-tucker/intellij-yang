// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangMustStmt extends PsiElement {

  @NotNull
  YangAString getAString();

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangErrorAppTagStmt> getErrorAppTagStmtList();

  @NotNull
  List<YangErrorMessageStmt> getErrorMessageStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

}
