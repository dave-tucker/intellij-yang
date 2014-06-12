package org.intellij.yang;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.intellij.yang.lexer.YangLexer;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;
import static org.intellij.yang.psi.YangTypes.*;

public class YangSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey ILLEGAL = createTextAttributesKey("YANG_ILLEGAL", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("YANG_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey STRING = createTextAttributesKey("YANG_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("YANG_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey BRACES = createTextAttributesKey("YANG_BRACES", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey OP_SIGN = createTextAttributesKey("YANG_OP_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey SEMICOLON = createTextAttributesKey("YANG_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new YangLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType type) {
        if (type == TokenType.BAD_CHARACTER) {
            return pack(ILLEGAL);
        }
        if (YangParserDefinition.COMMENTS.contains(type)) {
            return pack(COMMENT);
        }
        if (type == YANG_STRING) {
            return pack(STRING);
        }
        if (type == YANG_PLUS) {
            return pack(OP_SIGN);
        }
        if (type == YANG_LEFT_BRACE || type == YANG_RIGHT_BRACE) {
            return pack(BRACES);
        }
        if (type == YANG_SEMICOLON) {
            return pack(SEMICOLON);
        }
        if (
                YANG_ANYXML == type ||
                        YANG_ARGUMENT == type ||
                        YANG_AUGMENT == type ||
                        YANG_BASE == type ||
                        YANG_BELONGS_TO == type ||
                        YANG_BIT == type ||
                        YANG_CASE == type ||
                        YANG_CHOICE == type ||
                        YANG_CONFIG == type ||
                        YANG_CONTACT == type ||
                        YANG_CONTAINER == type ||
                        YANG_DEFAULT == type ||
                        YANG_DESCRIPTION == type ||
                        YANG_ENUM == type ||
                        YANG_ERROR_APP_TAG == type ||
                        YANG_ERROR_MESSAGE == type ||
                        YANG_EXTENSION == type ||
                        YANG_DEVIATION == type ||
                        YANG_DEVIATE == type ||
                        YANG_FEATURE == type ||
                        YANG_FRACTION_DIGITS == type ||
                        YANG_GROUPING == type ||
                        YANG_IDENTITY == type ||
                        YANG_IF_FEATURE == type ||
                        YANG_IMPORT == type ||
                        YANG_INCLUDE == type ||
                        YANG_INPUT == type ||
                        YANG_KEY == type ||
                        YANG_LEAF == type ||
                        YANG_LEAF_LIST == type ||
                        YANG_LENGTH == type ||
                        YANG_LIST == type ||
                        YANG_MANDATORY == type ||
                        YANG_MAX_ELEMENTS == type ||
                        YANG_MIN_ELEMENTS == type ||
                        YANG_MODULE == type ||
                        YANG_MUST == type ||
                        YANG_NAMESPACE == type ||
                        YANG_NOTIFICATION == type ||
                        YANG_ORDERED_BY == type ||
                        YANG_ORGANIZATION == type ||
                        YANG_OUTPUT == type ||
                        YANG_PATH == type ||
                        YANG_PATTERN == type ||
                        YANG_POSITION == type ||
                        YANG_PREFIX == type ||
                        YANG_PRESENCE == type ||
                        YANG_RANGE == type ||
                        YANG_REFERENCE == type ||
                        YANG_REFINE == type ||
                        YANG_REQUIRE_INSTANCE == type ||
                        YANG_REVISION == type ||
                        YANG_REVISION_DATE == type ||
                        YANG_RPC == type ||
                        YANG_STATUS == type ||
                        YANG_SUBMODULE == type ||
                        YANG_TYPE == type ||
                        YANG_TYPEDEF == type ||
                        YANG_UNIQUE == type ||
                        YANG_UNITS == type ||
                        YANG_USES == type ||
                        YANG_VALUE == type ||
                        YANG_WHEN == type ||
                        YANG_YANG_VERSION == type ||
                        YANG_YIN_ELEMENT == type ||
                        YANG_ADD == type ||
                        YANG_DELETE == type ||
                        YANG_REPLACE == type
                ){
            return pack(KEYWORD);
        }
    return EMPTY;
    }
}