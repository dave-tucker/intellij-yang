// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangModuleHeaderStmts extends PsiElement {

  @NotNull
  List<YangNamespaceStmt> getNamespaceStmtList();

  @NotNull
  List<YangPrefixStmt> getPrefixStmtList();

  @NotNull
  List<YangYangVersionStmt> getYangVersionStmtList();

}
