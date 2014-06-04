// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangTypedefStmt extends PsiElement {

  @Nullable
  YangDefaultStmt getDefaultStmt();

  @Nullable
  YangDescriptionStmt getDescriptionStmt();

  @Nullable
  YangReferenceStmt getReferenceStmt();

  @Nullable
  YangStatusStmt getStatusStmt();

  @NotNull
  YangTypeStmt getTypeStmt();

  @Nullable
  YangUnitsStmt getUnitsStmt();

}
