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

public class YangRpcStmtImpl extends ASTWrapperPsiElement implements YangRpcStmt {

  public YangRpcStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitRpcStmt(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangDescriptionStmt getDescriptionStmt() {
    return findChildByClass(YangDescriptionStmt.class);
  }

  @Override
  @NotNull
  public List<YangGroupingStmt> getGroupingStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangGroupingStmt.class);
  }

  @Override
  @NotNull
  public List<YangIfFeatureStmt> getIfFeatureStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIfFeatureStmt.class);
  }

  @Override
  @Nullable
  public YangInputStmt getInputStmt() {
    return findChildByClass(YangInputStmt.class);
  }

  @Override
  @Nullable
  public YangOutputStmt getOutputStmt() {
    return findChildByClass(YangOutputStmt.class);
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

  @Override
  @NotNull
  public List<YangTypedefStmt> getTypedefStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangTypedefStmt.class);
  }

}
