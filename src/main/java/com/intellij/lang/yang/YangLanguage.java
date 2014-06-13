package com.intellij.lang.yang;

import com.intellij.lang.Language;

/**
 * This class creates the Language instance for the Yang plugin
 */
public class YangLanguage extends Language {
    public static final YangLanguage INSTANCE = new YangLanguage();

    private YangLanguage() {
        super("Yang");
    }
}
