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

public class YangUnknownStatementImpl extends ASTWrapperPsiElement implements YangUnknownStatement {

  public YangUnknownStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitUnknownStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangAString getAString() {
    return findChildByClass(YangAString.class);
  }

  @Override
  @NotNull
  public List<YangUnknownStatement2> getUnknownStatement2List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangUnknownStatement2.class);
  }

}
