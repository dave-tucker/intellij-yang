package com.intellij.lang.yang.lexer;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.intellij.lang.yang.psi.YangTypes.*;
import static com.intellij.lang.yang.psi.YangTokenTypeSets.*;

%%

%{
  public _YangLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _YangLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode


LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*


ESC = "\\"[^ ]
CHAR = {ESC} | [^\'\"\\]
STRING_BAD1 = \" ({CHAR} | \') *
StringLiteral = {STRING_BAD1} \" | {Identifier}

Identifier = [/.a-zA-Z_0-9\-][a-zA-Z0-9_\-.:]*

%state VALUE_MODE

%%
<YYINITIAL> {
  ";"                     { return YANG_SEMICOLON; }
  "+"                     { return YANG_PLUS; }
  "{"                     { return YANG_LEFT_BRACE; }
  "}"                     { return YANG_RIGHT_BRACE; }
  "anyxml"                { yybegin(VALUE_MODE); return YANG_ANYXML_KEYWORD; }
  "argument"              { yybegin(VALUE_MODE); return YANG_ARGUMENT_KEYWORD; }
  "augment"               { yybegin(VALUE_MODE); return YANG_AUGMENT_KEYWORD; }
  "base"                  { yybegin(VALUE_MODE); return YANG_BASE_KEYWORD; }
  "belongs-to"            { yybegin(VALUE_MODE); return YANG_BELONGS_TO_KEYWORD; }
  "bit"                   { yybegin(VALUE_MODE); return YANG_BIT_KEYWORD; }
  "case"                  { yybegin(VALUE_MODE); return YANG_CASE_KEYWORD; }
  "choice"                { yybegin(VALUE_MODE); return YANG_CHOICE_KEYWORD; }
  "config"                { yybegin(VALUE_MODE); return YANG_CONFIG_KEYWORD; }
  "contact"               { yybegin(VALUE_MODE); return YANG_CONTACT_KEYWORD; }
  "container"             { yybegin(VALUE_MODE); return YANG_CONTAINER_KEYWORD; }
  "default"               { yybegin(VALUE_MODE); return YANG_DEFAULT_KEYWORD; }
  "description"           { yybegin(VALUE_MODE); return YANG_DESCRIPTION_KEYWORD; }
  "enum"                  { yybegin(VALUE_MODE); return YANG_ENUM_KEYWORD; }
  "error-app_tag"         { yybegin(VALUE_MODE); return YANG_ERROR_APP_TAG_KEYWORD; }
  "error-message"         { yybegin(VALUE_MODE); return YANG_ERROR_MESSAGE_KEYWORD; }
  "extension"             { yybegin(VALUE_MODE); return YANG_EXTENSION_KEYWORD; }
  "deviation"             { yybegin(VALUE_MODE); return YANG_DEVIATION_KEYWORD; }
  "deviate"               { yybegin(VALUE_MODE); return YANG_DEVIATE_KEYWORD; }
  "feature"               { yybegin(VALUE_MODE); return YANG_FEATURE_KEYWORD; }
  "fraction-digits"       { yybegin(VALUE_MODE); return YANG_FRACTION_DIGITS_KEYWORD; }
  "grouping"              { yybegin(VALUE_MODE); return YANG_GROUPING_KEYWORD; }
  "identity"              { yybegin(VALUE_MODE); return YANG_IDENTITY_KEYWORD; }
  "if-feature"            { yybegin(VALUE_MODE); return YANG_IF_FEATURE_KEYWORD; }
  "import"                { yybegin(VALUE_MODE); return YANG_IMPORT_KEYWORD; }
  "include"               { yybegin(VALUE_MODE); return YANG_INCLUDE_KEYWORD; }
  "input"                 { yybegin(VALUE_MODE); return YANG_INPUT_KEYWORD; }
  "key"                   { yybegin(VALUE_MODE); return YANG_KEY_KEYWORD; }
  "leaf"                  { yybegin(VALUE_MODE); return YANG_LEAF_KEYWORD; }
  "leaf-list"             { yybegin(VALUE_MODE); return YANG_LEAF_LIST_KEYWORD; }
  "length"                { yybegin(VALUE_MODE); return YANG_LENGTH_KEYWORD; }
  "list"                  { yybegin(VALUE_MODE); return YANG_LIST_KEYWORD; }
  "mandatory"             { yybegin(VALUE_MODE); return YANG_MANDATORY_KEYWORD; }
  "max-elements"          { yybegin(VALUE_MODE); return YANG_MAX_ELEMENTS_KEYWORD; }
  "min-elements"          { yybegin(VALUE_MODE); return YANG_MIN_ELEMENTS_KEYWORD; }
  "module"                { yybegin(VALUE_MODE); return YANG_MODULE_KEYWORD; }
  "must"                  { yybegin(VALUE_MODE); return YANG_MUST_KEYWORD; }
  "namespace"             { yybegin(VALUE_MODE); return YANG_NAMESPACE_KEYWORD; }
  "notification"          { yybegin(VALUE_MODE); return YANG_NOTIFICATION_KEYWORD; }
  "ordered-by"            { yybegin(VALUE_MODE); return YANG_ORDERED_BY_KEYWORD; }
  "organization"          { yybegin(VALUE_MODE); return YANG_ORGANIZATION_KEYWORD; }
  "output"                { yybegin(VALUE_MODE); return YANG_OUTPUT_KEYWORD; }
  "path"                  { yybegin(VALUE_MODE); return YANG_PATH_KEYWORD; }
  "pattern"               { yybegin(VALUE_MODE); return YANG_PATTERN_KEYWORD; }
  "position"              { yybegin(VALUE_MODE); return YANG_POSITION_KEYWORD; }
  "prefix"                { yybegin(VALUE_MODE); return YANG_PREFIX_KEYWORD; }
  "presence"              { yybegin(VALUE_MODE); return YANG_PRESENCE_KEYWORD; }
  "range"                 { yybegin(VALUE_MODE); return YANG_RANGE_KEYWORD; }
  "reference"             { yybegin(VALUE_MODE); return YANG_REFERENCE_KEYWORD; }
  "refine"                { yybegin(VALUE_MODE); return YANG_REFINE_KEYWORD; }
  "require-instance"      { yybegin(VALUE_MODE); return YANG_REQUIRE_INSTANCE_KEYWORD; }
  "revision"              { yybegin(VALUE_MODE); return YANG_REVISION_KEYWORD; }
  "revision-date"         { yybegin(VALUE_MODE); return YANG_REVISION_DATE_KEYWORD; }
  "rpc"                   { yybegin(VALUE_MODE); return YANG_RPC_KEYWORD; }
  "status"                { yybegin(VALUE_MODE); return YANG_STATUS_KEYWORD; }
  "submodule"             { yybegin(VALUE_MODE); return YANG_SUBMODULE_KEYWORD; }
  "type"                  { yybegin(VALUE_MODE); return YANG_TYPE_KEYWORD; }
  "typedef"               { yybegin(VALUE_MODE); return YANG_TYPEDEF_KEYWORD; }
  "unique"                { yybegin(VALUE_MODE); return YANG_UNIQUE_KEYWORD; }
  "units"                 { yybegin(VALUE_MODE); return YANG_UNITS_KEYWORD; }
  "uses"                  { yybegin(VALUE_MODE); return YANG_USES_KEYWORD; }
  "value"                 { yybegin(VALUE_MODE); return YANG_VALUE_KEYWORD; }
  "when"                  { yybegin(VALUE_MODE); return YANG_WHEN_KEYWORD; }
  "yang-version"          { yybegin(VALUE_MODE); return YANG_YANG_VERSION_KEYWORD; }
  "yin-element"           { yybegin(VALUE_MODE); return YANG_YIN_ELEMENT_KEYWORD; }
  //"add"                   { yybegin(VALUE_MODE); return YANG_ADD_KEYWORD; }
  //"current"               { yybegin(VALUE_MODE); return YANG_CURRENT_KEYWORD; }
  //"delete"                { yybegin(VALUE_MODE); return YANG_DELETE_KEYWORD; }
  //"deprecated"            { yybegin(VALUE_MODE); return YANG_DEPRECATED_KEYWORD; }
  //"false"                 { yybegin(VALUE_MODE); return YANG_FALSE_KEYWORD; }
  //"max"                   { yybegin(VALUE_MODE); return YANG_MAX_KEYWORD; }
  //"min"                   { yybegin(VALUE_MODE); return YANG_MIN_KEYWORD; }
  //"not_supported"         { yybegin(VALUE_MODE); return YANG_NOT_SUPPORTED_KEYWORD; }
  //"obsolete"              { yybegin(VALUE_MODE); return YANG_OBSOLETE_KEYWORD; }
  //"replace"               { yybegin(VALUE_MODE); return YANG_REPLACE_KEYWORD; }
  //"system"                { yybegin(VALUE_MODE); return YANG_SYSTEM_KEYWORD; }
  //"true"                  { yybegin(VALUE_MODE); return YANG_TRUE_KEYWORD; }
  //"unbounded"             { yybegin(VALUE_MODE); return YANG_UNBOUNDED_KEYWORD; }
  //"user"                  { yybegin(VALUE_MODE); return YANG_USER_KEYWORD; }

  {Identifier}            { yybegin(VALUE_MODE); return YANG_IDENTIFIER; }

  // Treat comments as White Space
  {Comment}               { return com.intellij.psi.TokenType.WHITE_SPACE; }
  {WhiteSpace}+           { return com.intellij.psi.TokenType.WHITE_SPACE; }

}

<VALUE_MODE> {

  /* string literal */
  {StringLiteral}         { return YANG_STRING_LITERAL; }

  // Treat comments as White Space
  {Comment}               { return com.intellij.psi.TokenType.WHITE_SPACE; }
  {WhiteSpace}+           { return com.intellij.psi.TokenType.WHITE_SPACE; }

  ";"                     { yybegin(YYINITIAL); return YANG_SEMICOLON; }
  "{"                     { yybegin(YYINITIAL); return YANG_LEFT_BRACE; }

}

[^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
