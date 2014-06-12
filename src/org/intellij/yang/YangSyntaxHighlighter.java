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
                YANG_ANYXML_KEYWORD == type ||
                YANG_ARGUMENT_KEYWORD == type ||
                YANG_AUGMENT_KEYWORD == type ||
                YANG_BASE_KEYWORD == type ||
                YANG_BELONGS_TO_KEYWORD == type ||
                YANG_BIT_KEYWORD == type ||
                YANG_CASE_KEYWORD == type ||
                YANG_CHOICE_KEYWORD == type ||
                YANG_CONFIG_KEYWORD == type ||
                YANG_CONTACT_KEYWORD == type ||
                YANG_CONTAINER_KEYWORD == type ||
                YANG_DEFAULT_KEYWORD == type ||
                YANG_DESCRIPTION_KEYWORD == type ||
                YANG_ENUM_KEYWORD == type ||
                YANG_ERROR_APP_TAG_KEYWORD == type ||
                YANG_ERROR_MESSAGE_KEYWORD == type ||
                YANG_EXTENSION_KEYWORD == type ||
                YANG_DEVIATION_KEYWORD == type ||
                YANG_DEVIATE_KEYWORD == type ||
                YANG_FEATURE_KEYWORD == type ||
                YANG_FRACTION_DIGITS_KEYWORD == type ||
                YANG_GROUPING_KEYWORD == type ||
                YANG_IDENTITY_KEYWORD == type ||
                YANG_IF_FEATURE_KEYWORD == type ||
                YANG_IMPORT_KEYWORD == type ||
                YANG_INCLUDE_KEYWORD == type ||
                YANG_INPUT_KEYWORD == type ||
                YANG_KEY_KEYWORD == type ||
                YANG_LEAF_KEYWORD == type ||
                YANG_LEAF_LIST_KEYWORD == type ||
                YANG_LENGTH_KEYWORD == type ||
                YANG_LIST_KEYWORD == type ||
                YANG_MANDATORY_KEYWORD == type ||
                YANG_MAX_ELEMENTS_KEYWORD == type ||
                YANG_MIN_ELEMENTS_KEYWORD == type ||
                YANG_MODULE_KEYWORD == type ||
                YANG_MUST_KEYWORD == type ||
                YANG_NAMESPACE_KEYWORD == type ||
                YANG_NOTIFICATION_KEYWORD == type ||
                YANG_ORDERED_BY_KEYWORD == type ||
                YANG_ORGANIZATION_KEYWORD == type ||
                YANG_OUTPUT_KEYWORD == type ||
                YANG_PATH_KEYWORD == type ||
                YANG_PATTERN_KEYWORD == type ||
                YANG_POSITION_KEYWORD == type ||
                YANG_PREFIX_KEYWORD == type ||
                YANG_PRESENCE_KEYWORD == type ||
                YANG_RANGE_KEYWORD == type ||
                YANG_REFERENCE_KEYWORD == type ||
                YANG_REFINE_KEYWORD == type ||
                YANG_REQUIRE_INSTANCE_KEYWORD == type ||
                YANG_REVISION_KEYWORD == type ||
                YANG_REVISION_DATE_KEYWORD == type ||
                YANG_RPC_KEYWORD == type ||
                YANG_STATUS_KEYWORD == type ||
                YANG_SUBMODULE_KEYWORD == type ||
                YANG_TYPE_KEYWORD == type ||
                YANG_TYPEDEF_KEYWORD == type ||
                YANG_UNIQUE_KEYWORD == type ||
                YANG_UNITS_KEYWORD == type ||
                YANG_USES_KEYWORD == type ||
                YANG_VALUE_KEYWORD == type ||
                YANG_WHEN_KEYWORD == type ||
                YANG_YANG_VERSION_KEYWORD == type ||
                YANG_YIN_ELEMENT_KEYWORD == type
                ){
            return pack(KEYWORD);
        }
    return EMPTY;
    }
}