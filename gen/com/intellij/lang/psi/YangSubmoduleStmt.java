// This is a generated file. Not intended for manual editing.
package com.intellij.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangSubmoduleStmt extends PsiElement {

  @NotNull
  YangBodyStmts getBodyStmts();

  @NotNull
  YangLinkageStmts getLinkageStmts();

  @NotNull
  YangMetaStmts getMetaStmts();

  @NotNull
  YangRevisionStmts getRevisionStmts();

  @NotNull
  YangString getString();

  @NotNull
  YangSubmoduleHeaderStmts getSubmoduleHeaderStmts();

}
