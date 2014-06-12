// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangTypeBodyStmts extends PsiElement {

  @Nullable
  YangBitsSpecification getBitsSpecification();

  @Nullable
  YangDecimal64Specification getDecimal64Specification();

  @Nullable
  YangEnumSpecification getEnumSpecification();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @Nullable
  YangIdentityrefSpecification getIdentityrefSpecification();

  @Nullable
  YangInstanceIdentifierSpecification getInstanceIdentifierSpecification();

  @Nullable
  YangLeafrefSpecification getLeafrefSpecification();

  @Nullable
  YangNumericalRestrictions getNumericalRestrictions();

  @Nullable
  YangStringRestrictions getStringRestrictions();

  @Nullable
  YangUnionSpecification getUnionSpecification();

}
