// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangIdentityStmt extends PsiElement {

  @Nullable
  YangBaseStmt getBaseStmt();

  @Nullable
  YangDescriptionStmt getDescriptionStmt();

  @Nullable
  YangReferenceStmt getReferenceStmt();

  @Nullable
  YangStatusStmt getStatusStmt();

  @NotNull
  YangStringStmt getStringStmt();

}
