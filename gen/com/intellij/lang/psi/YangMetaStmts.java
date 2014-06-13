// This is a generated file. Not intended for manual editing.
package com.intellij.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangMetaStmts extends PsiElement {

  @NotNull
  List<YangContactStmt> getContactStmtList();

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangOrganizationStmt> getOrganizationStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

}
