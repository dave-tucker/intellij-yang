// This is a generated file. Not intended for manual editing.
package com.intellij.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangImportStmt extends PsiElement {

  @NotNull
  YangPrefixStmt getPrefixStmt();

  @Nullable
  YangRevisionDateStmt getRevisionDateStmt();

  @NotNull
  YangString getString();

}
