package com.intellij.lang.yang.psi;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.*;
import com.intellij.lang.yang.YangLanguage;

public interface YangTokenTypeSets {
    IFileElementType YANG_FILE = new IFileElementType("YANGFILE", YangLanguage.INSTANCE);

    IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
    IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;

    static IElementType COMMENT = new YangElementType("COMMENT");
 }