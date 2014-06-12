// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.yang.psi.YangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.yang.psi.*;

public class YangStringRestrictionsImpl extends ASTWrapperPsiElement implements YangStringRestrictions {

  public YangStringRestrictionsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitStringRestrictions(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangLengthStmt> getLengthStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangLengthStmt.class);
  }

  @Override
  @NotNull
  public List<YangPatternStmt> getPatternStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangPatternStmt.class);
  }

}
