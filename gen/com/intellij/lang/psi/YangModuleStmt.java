// This is a generated file. Not intended for manual editing.
package com.intellij.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangModuleStmt extends PsiElement {

  @NotNull
  YangBodyStmts getBodyStmts();

  @NotNull
  YangLinkageStmts getLinkageStmts();

  @NotNull
  YangMetaStmts getMetaStmts();

  @NotNull
  YangModuleHeaderStmts getModuleHeaderStmts();

  @NotNull
  YangRevisionStmts getRevisionStmts();

  @NotNull
  YangString getString();

}
