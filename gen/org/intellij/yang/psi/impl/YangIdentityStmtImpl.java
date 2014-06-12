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

public class YangIdentityStmtImpl extends ASTWrapperPsiElement implements YangIdentityStmt {

  public YangIdentityStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitIdentityStmt(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangBaseStmt getBaseStmt() {
    return findChildByClass(YangBaseStmt.class);
  }

  @Override
  @Nullable
  public YangDescriptionStmt getDescriptionStmt() {
    return findChildByClass(YangDescriptionStmt.class);
  }

  @Override
  @Nullable
  public YangReferenceStmt getReferenceStmt() {
    return findChildByClass(YangReferenceStmt.class);
  }

  @Override
  @Nullable
  public YangStatusStmt getStatusStmt() {
    return findChildByClass(YangStatusStmt.class);
  }

  @Override
  @NotNull
  public YangStringStmt getStringStmt() {
    return findNotNullChildByClass(YangStringStmt.class);
  }

}
