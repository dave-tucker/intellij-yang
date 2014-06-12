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

public class YangMustStmtImpl extends ASTWrapperPsiElement implements YangMustStmt {

  public YangMustStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitMustStmt(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangAString getAString() {
    return findNotNullChildByClass(YangAString.class);
  }

  @Override
  @NotNull
  public List<YangDescriptionStmt> getDescriptionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDescriptionStmt.class);
  }

  @Override
  @NotNull
  public List<YangErrorAppTagStmt> getErrorAppTagStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangErrorAppTagStmt.class);
  }

  @Override
  @NotNull
  public List<YangErrorMessageStmt> getErrorMessageStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangErrorMessageStmt.class);
  }

  @Override
  @NotNull
  public List<YangIdentifierStmt> getIdentifierStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIdentifierStmt.class);
  }

  @Override
  @NotNull
  public List<YangReferenceStmt> getReferenceStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangReferenceStmt.class);
  }

}
