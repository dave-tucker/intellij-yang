package com.intellij.lang.yang.lexer;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by dave on 23/05/2014.
 */
public class YangLexer extends FlexAdapter {
    public YangLexer() {
        super(new _YangLexer());
    }
}
