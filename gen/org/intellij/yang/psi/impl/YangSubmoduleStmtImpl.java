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

public class YangSubmoduleStmtImpl extends ASTWrapperPsiElement implements YangSubmoduleStmt {

  public YangSubmoduleStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitSubmoduleStmt(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangAString getAString() {
    return findNotNullChildByClass(YangAString.class);
  }

  @Override
  @NotNull
  public YangBodyStmts getBodyStmts() {
    return findNotNullChildByClass(YangBodyStmts.class);
  }

  @Override
  @NotNull
  public YangLinkageStmts getLinkageStmts() {
    return findNotNullChildByClass(YangLinkageStmts.class);
  }

  @Override
  @NotNull
  public YangMetaStmts getMetaStmts() {
    return findNotNullChildByClass(YangMetaStmts.class);
  }

  @Override
  @NotNull
  public YangRevisionStmts getRevisionStmts() {
    return findNotNullChildByClass(YangRevisionStmts.class);
  }

  @Override
  @NotNull
  public YangSubmoduleHeaderStmts getSubmoduleHeaderStmts() {
    return findNotNullChildByClass(YangSubmoduleHeaderStmts.class);
  }

}
