// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangRefineStmt extends PsiElement {

  @Nullable
  YangConfigStmt getConfigStmt();

  @Nullable
  YangDefaultStmt getDefaultStmt();

  @Nullable
  YangDescriptionStmt getDescriptionStmt();

  @Nullable
  YangMandatoryStmt getMandatoryStmt();

  @Nullable
  YangMaxElementsStmt getMaxElementsStmt();

  @Nullable
  YangMinElementsStmt getMinElementsStmt();

  @NotNull
  List<YangMustStmt> getMustStmtList();

  @Nullable
  YangPresenceStmt getPresenceStmt();

  @Nullable
  YangReferenceStmt getReferenceStmt();

}
