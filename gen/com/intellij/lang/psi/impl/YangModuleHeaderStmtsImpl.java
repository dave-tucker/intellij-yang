// This is a generated file. Not intended for manual editing.
package com.intellij.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.yang.psi.YangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.psi.*;

public class YangModuleHeaderStmtsImpl extends ASTWrapperPsiElement implements YangModuleHeaderStmts {

  public YangModuleHeaderStmtsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitModuleHeaderStmts(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangNamespaceStmt> getNamespaceStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangNamespaceStmt.class);
  }

  @Override
  @NotNull
  public List<YangPrefixStmt> getPrefixStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangPrefixStmt.class);
  }

  @Override
  @NotNull
  public List<YangYangVersionStmt> getYangVersionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangYangVersionStmt.class);
  }

}
