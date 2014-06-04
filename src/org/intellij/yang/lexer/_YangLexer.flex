package org.intellij.yang.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.intellij.yang.psi.YangTypes.*;
import static org.intellij.yang.psi.YangTokenTypeSets.*;

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

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
InputCharacter = [^\r\n]
WHITE_SPACE=({LINE_WS}|{EOL})+
IDENTIFIER=[/.a-zA-Z_0-9\-][a-zA-Z0-9_\-.:]*
ESC = "\\"([\"\\/bfnrt]|{UNICODE})
UNICODE ='u'{HEX}{HEX}{HEX}{HEX}
HEX = [0-9a-fA-F]
SUB_STRING = (\"({ESC}|~[\"])*\")|(\'({ESC}|~[\'])*')
STRING = ({SUB_STRING}|(~(\r|\n|\ |;|\{)+))

YANG_COMMENT = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {EOL}
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

%%
<YYINITIAL> {
  {YANG_COMMENT}          { return COMMENT; }
  {WHITE_SPACE}           { return com.intellij.psi.TokenType.WHITE_SPACE; }
  \{                      { return YANG_LEFT_BRACE; }
  \}                      { return YANG_RIGHT_BRACE; }

  "anyxml"                { return YANG_ANYXML; }
  "argument"              { return YANG_ARGUMENT; }
  "augment"               { return YANG_AUGMENT; }
  "base"                  { return YANG_BASE; }
  "belongs-to"            { return YANG_BELONGS_TO; }
  "bit"                   { return YANG_BIT; }
  "case"                  { return YANG_CASE; }
  "choice"                { return YANG_CHOICE; }
  "config"                { return YANG_CONFIG; }
  "contact"               { return YANG_CONTACT; }
  "container"             { return YANG_CONTAINER; }
  "default"               { return YANG_DEFAULT; }
  "description"           { return YANG_DESCRIPTION; }
  "enum"                  { return YANG_ENUM; }
  "error-app_tag"         { return YANG_ERROR_APP_TAG; }
  "error-message"         { return YANG_ERROR_MESSAGE; }
  "extension"             { return YANG_EXTENSION; }
  "deviation"             { return YANG_DEVIATION; }
  "deviate"               { return YANG_DEVIATE; }
  "feature"               { return YANG_FEATURE; }
  "fraction-digits"       { return YANG_FRACTION_DIGITS; }
  "grouping"              { return YANG_GROUPING; }
  "identity"              { return YANG_IDENTITY; }
  "if-feature"            { return YANG_IF_FEATURE; }
  "import"                { return YANG_IMPORT; }
  "include"               { return YANG_INCLUDE; }
  "input"                 { return YANG_INPUT; }
  "key"                   { return YANG_KEY; }
  "leaf"                  { return YANG_LEAF; }
  "leaf-list"             { return YANG_LEAF_LIST; }
  "length"                { return YANG_LENGTH; }
  "list"                  { return YANG_LIST; }
  "mandatory"             { return YANG_MANDATORY; }
  "max-elements"          { return YANG_MAX_ELEMENTS; }
  "min-elements"          { return YANG_MIN_ELEMENTS; }
  "module"                { return YANG_MODULE; }
  "must"                  { return YANG_MUST; }
  "namespace"             { return YANG_NAMESPACE; }
  "notification"          { return YANG_NOTIFICATION; }
  "ordered-by"            { return YANG_ORDERED_BY; }
  "organization"          { return YANG_ORGANIZATION; }
  "output"                { return YANG_OUTPUT; }
  "path"                  { return YANG_PATH; }
  "pattern"               { return YANG_PATTERN; }
  "position"              { return YANG_POSITION; }
  "prefix"                { return YANG_PREFIX; }
  "presence"              { return YANG_PRESENCE; }
  "range"                 { return YANG_RANGE; }
  "reference"             { return YANG_REFERENCE; }
  "refine"                { return YANG_REFINE; }
  "require-instance"      { return YANG_REQUIRE_INSTANCE; }
  "revision"              { return YANG_REVISION; }
  "revision-date"         { return YANG_REVISION_DATE; }
  "rpc"                   { return YANG_RPC; }
  "status"                { return YANG_STATUS; }
  "submodule"             { return YANG_SUBMODULE; }
  "type"                  { return YANG_TYPE; }
  "typedef"               { return YANG_TYPEDEF; }
  "unique"                { return YANG_UNIQUE; }
  "units"                 { return YANG_UNITS; }
  "uses"                  { return YANG_USES; }
  "value"                 { return YANG_VALUE; }
  "when"                  { return YANG_WHEN; }
  "yang-version"          { return YANG_YANG_VERSION; }
  "yin-element"           { return YANG_YIN_ELEMENT; }
  "add"                   { return YANG_ADD; }
  "current"               { return YANG_CURRENT; }
  "delete"                { return YANG_DELETE; }
  "deprecated"            { return YANG_DEPRECATED; }
  "false"                 { return YANG_FALSE; }
  "max"                   { return YANG_MAX; }
  "min"                   { return YANG_MIN; }
  "not_supported"         { return YANG_NOT_SUPPORTED; }
  "obsolete"              { return YANG_OBSOLETE; }
  "replace"               { return YANG_REPLACE; }
  "system"                { return YANG_SYSTEM; }
  "true"                  { return YANG_TRUE; }
  "unbounded"             { return YANG_UNBOUNDED; }
  "user"                  { return YANG_USER; }

  "+"                     { return YANG_PLUS; }
  ";"                     { return YANG_SEMICOLON; }
  {IDENTIFIER}            { return YANG_IDENTIFIER; }
  (\"|\'){STRING}(\"\')   { return YANG_STRING; }


  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
