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

public class YangSubmoduleHeaderStmtsImpl extends ASTWrapperPsiElement implements YangSubmoduleHeaderStmts {

  public YangSubmoduleHeaderStmtsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitSubmoduleHeaderStmts(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangBelongsToStmt> getBelongsToStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangBelongsToStmt.class);
  }

  @Override
  @NotNull
  public List<YangYangVersionStmt> getYangVersionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangYangVersionStmt.class);
  }

}
