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

public class YangDeviationStmtImpl extends ASTWrapperPsiElement implements YangDeviationStmt {

  public YangDeviationStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitDeviationStmt(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangDescriptionStmt> getDescriptionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDescriptionStmt.class);
  }

  @Override
  @NotNull
  public List<YangDeviateAddStmt> getDeviateAddStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDeviateAddStmt.class);
  }

  @Override
  @NotNull
  public List<YangDeviateDeleteStmt> getDeviateDeleteStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDeviateDeleteStmt.class);
  }

  @Override
  @NotNull
  public List<YangDeviateNotSupportedStmt> getDeviateNotSupportedStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDeviateNotSupportedStmt.class);
  }

  @Override
  @NotNull
  public List<YangDeviateReplaceStmt> getDeviateReplaceStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDeviateReplaceStmt.class);
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

  @Override
  @NotNull
  public YangString getString() {
    return findNotNullChildByClass(YangString.class);
  }

}
