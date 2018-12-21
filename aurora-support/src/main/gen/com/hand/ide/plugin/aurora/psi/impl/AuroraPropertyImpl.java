// This is a generated file. Not intended for manual editing.
package com.hand.ide.plugin.aurora.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.hand.ide.plugin.aurora.psi.AuroraTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.hand.ide.plugin.aurora.psi.*;

public class AuroraPropertyImpl extends ASTWrapperPsiElement implements AuroraProperty {

  public AuroraPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AuroraVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AuroraVisitor) accept((AuroraVisitor)visitor);
    else super.accept(visitor);
  }

}
