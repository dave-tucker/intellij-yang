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

public class YangEnumStmtImpl extends ASTWrapperPsiElement implements YangEnumStmt {

  public YangEnumStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitEnumStmt(this);
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
  public List<YangStatusStmt> getStatusStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangStatusStmt.class);
  }

  @Override
  @NotNull
  public List<YangValueStmt> getValueStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangValueStmt.class);
  }

}
