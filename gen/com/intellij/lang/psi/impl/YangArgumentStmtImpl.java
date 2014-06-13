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

public class YangArgumentStmtImpl extends ASTWrapperPsiElement implements YangArgumentStmt {

  public YangArgumentStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitArgumentStmt(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangString getString() {
    return findNotNullChildByClass(YangString.class);
  }

  @Override
  @Nullable
  public YangUnknownStatement2 getUnknownStatement2() {
    return findChildByClass(YangUnknownStatement2.class);
  }

  @Override
  @Nullable
  public YangYinElementStmt getYinElementStmt() {
    return findChildByClass(YangYinElementStmt.class);
  }

}
