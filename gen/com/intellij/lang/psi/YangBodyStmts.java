// This is a generated file. Not intended for manual editing.
package com.intellij.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangBodyStmts extends PsiElement {

  @NotNull
  List<YangAugmentStmt> getAugmentStmtList();

  @NotNull
  List<YangDataDefStmt> getDataDefStmtList();

  @NotNull
  List<YangDeviationStmt> getDeviationStmtList();

  @NotNull
  List<YangExtensionStmt> getExtensionStmtList();

  @NotNull
  List<YangFeatureStmt> getFeatureStmtList();

  @NotNull
  List<YangGroupingStmt> getGroupingStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangIdentityStmt> getIdentityStmtList();

  @NotNull
  List<YangNotificationStmt> getNotificationStmtList();

  @NotNull
  List<YangRpcStmt> getRpcStmtList();

  @NotNull
  List<YangTypedefStmt> getTypedefStmtList();

}
