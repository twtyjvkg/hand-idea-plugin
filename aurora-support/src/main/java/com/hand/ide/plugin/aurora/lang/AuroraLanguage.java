package com.hand.ide.plugin.aurora.lang;

import com.intellij.lang.Language;

/**
 * @author xuzhao
 * @email mailto:xuzhao@feline.net
 * @description 定义Aurora语言类型
 * @time 2018/12/21 12:47
 */
public class AuroraLanguage extends Language {

    public static final AuroraLanguage INSTANCE = new AuroraLanguage();

    private AuroraLanguage() {
        super("Aurora");
    }
}
