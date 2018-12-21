package com.hand.ide.plugin.aurora.psi;

import com.hand.ide.plugin.aurora.lang.AuroraLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author xuzhao
 * @email mailto:xuzhao@feline.net
 * @description 定义aurora token类型
 * @time 2018/12/21 13:36
 */
public class AuroraTokenType extends IElementType {

    public AuroraTokenType(@NotNull @NonNls String debugName) {
        super(debugName, AuroraLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SimpleTokenType." + super.toString();
    }
}
