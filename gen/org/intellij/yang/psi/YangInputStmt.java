// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangInputStmt extends PsiElement {

  @NotNull
  List<YangAnyxmlStmt> getAnyxmlStmtList();

  @NotNull
  List<YangChoiceStmt> getChoiceStmtList();

  @NotNull
  List<YangContainerStmt> getContainerStmtList();

  @NotNull
  List<YangGroupingStmt> getGroupingStmtList();

  @NotNull
  List<YangLeafListStmt> getLeafListStmtList();

  @NotNull
  List<YangLeafStmt> getLeafStmtList();

  @NotNull
  List<YangListStmt> getListStmtList();

  @NotNull
  List<YangTypedefStmt> getTypedefStmtList();

  @NotNull
  List<YangUsesStmt> getUsesStmtList();

}
