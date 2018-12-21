// This is a generated file. Not intended for manual editing.
package com.hand.ide.plugin.aurora.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.hand.ide.plugin.aurora.psi.impl.*;

public interface AuroraTypes {

  IElementType PROPERTY = new AuroraElementType("PROPERTY");

  IElementType COMMENT = new AuroraTokenType("COMMENT");
  IElementType CRLF = new AuroraTokenType("CRLF");
  IElementType KEY = new AuroraTokenType("KEY");
  IElementType SEPARATOR = new AuroraTokenType("SEPARATOR");
  IElementType VALUE = new AuroraTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new AuroraPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
