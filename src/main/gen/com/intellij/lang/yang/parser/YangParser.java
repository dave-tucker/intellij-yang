/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.intellij.lang.yang.psi.YangTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class YangParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.intellij.lang.yang.parser.YangParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == YANG_ANYXML_STMT) {
      result_ = anyxml_stmt(builder_, 0);
    }
    else if (root_ == YANG_ARGUMENT_STMT) {
      result_ = argument_stmt(builder_, 0);
    }
    else if (root_ == YANG_AUGMENT_STMT) {
      result_ = augment_stmt(builder_, 0);
    }
    else if (root_ == YANG_BASE_STMT) {
      result_ = base_stmt(builder_, 0);
    }
    else if (root_ == YANG_BELONGS_TO_STMT) {
      result_ = belongs_to_stmt(builder_, 0);
    }
    else if (root_ == YANG_BIT_STMT) {
      result_ = bit_stmt(builder_, 0);
    }
    else if (root_ == YANG_BITS_SPECIFICATION) {
      result_ = bits_specification(builder_, 0);
    }
    else if (root_ == YANG_BODY_STMTS) {
      result_ = body_stmts(builder_, 0);
    }
    else if (root_ == YANG_CASE_STMT) {
      result_ = case_stmt(builder_, 0);
    }
    else if (root_ == YANG_CHOICE_STMT) {
      result_ = choice_stmt(builder_, 0);
    }
    else if (root_ == YANG_CONFIG_ARG) {
      result_ = config_arg(builder_, 0);
    }
    else if (root_ == YANG_CONFIG_STMT) {
      result_ = config_stmt(builder_, 0);
    }
    else if (root_ == YANG_CONTACT_STMT) {
      result_ = contact_stmt(builder_, 0);
    }
    else if (root_ == YANG_CONTAINER_STMT) {
      result_ = container_stmt(builder_, 0);
    }
    else if (root_ == YANG_DATA_DEF_STMT) {
      result_ = data_def_stmt(builder_, 0);
    }
    else if (root_ == YANG_DECIMAL_64_SPECIFICATION) {
      result_ = decimal64_specification(builder_, 0);
    }
    else if (root_ == YANG_DEFAULT_STMT) {
      result_ = default_stmt(builder_, 0);
    }
    else if (root_ == YANG_DESCRIPTION_STMT) {
      result_ = description_stmt(builder_, 0);
    }
    else if (root_ == YANG_DEVIATE_ADD_STMT) {
      result_ = deviate_add_stmt(builder_, 0);
    }
    else if (root_ == YANG_DEVIATE_DELETE_STMT) {
      result_ = deviate_delete_stmt(builder_, 0);
    }
    else if (root_ == YANG_DEVIATE_NOT_SUPPORTED_STMT) {
      result_ = deviate_not_supported_stmt(builder_, 0);
    }
    else if (root_ == YANG_DEVIATE_REPLACE_STMT) {
      result_ = deviate_replace_stmt(builder_, 0);
    }
    else if (root_ == YANG_DEVIATION_STMT) {
      result_ = deviation_stmt(builder_, 0);
    }
    else if (root_ == YANG_ENUM_SPECIFICATION) {
      result_ = enum_specification(builder_, 0);
    }
    else if (root_ == YANG_ENUM_STMT) {
      result_ = enum_stmt(builder_, 0);
    }
    else if (root_ == YANG_ERROR_APP_TAG_STMT) {
      result_ = error_app_tag_stmt(builder_, 0);
    }
    else if (root_ == YANG_ERROR_MESSAGE_STMT) {
      result_ = error_message_stmt(builder_, 0);
    }
    else if (root_ == YANG_EXTENSION_STMT) {
      result_ = extension_stmt(builder_, 0);
    }
    else if (root_ == YANG_FEATURE_STMT) {
      result_ = feature_stmt(builder_, 0);
    }
    else if (root_ == YANG_FRACTION_DIGITS_STMT) {
      result_ = fraction_digits_stmt(builder_, 0);
    }
    else if (root_ == YANG_GROUPING_STMT) {
      result_ = grouping_stmt(builder_, 0);
    }
    else if (root_ == YANG_IDENTIFIER_STMT) {
      result_ = identifier_stmt(builder_, 0);
    }
    else if (root_ == YANG_IDENTITY_STMT) {
      result_ = identity_stmt(builder_, 0);
    }
    else if (root_ == YANG_IDENTITYREF_SPECIFICATION) {
      result_ = identityref_specification(builder_, 0);
    }
    else if (root_ == YANG_IF_FEATURE_STMT) {
      result_ = if_feature_stmt(builder_, 0);
    }
    else if (root_ == YANG_IMPORT_STMT) {
      result_ = import_stmt(builder_, 0);
    }
    else if (root_ == YANG_INCLUDE_STMT) {
      result_ = include_stmt(builder_, 0);
    }
    else if (root_ == YANG_INPUT_STMT) {
      result_ = input_stmt(builder_, 0);
    }
    else if (root_ == YANG_INSTANCE_IDENTIFIER_SPECIFICATION) {
      result_ = instance_identifier_specification(builder_, 0);
    }
    else if (root_ == YANG_KEY_STMT) {
      result_ = key_stmt(builder_, 0);
    }
    else if (root_ == YANG_LEAF_LIST_STMT) {
      result_ = leaf_list_stmt(builder_, 0);
    }
    else if (root_ == YANG_LEAF_STMT) {
      result_ = leaf_stmt(builder_, 0);
    }
    else if (root_ == YANG_LEAFREF_SPECIFICATION) {
      result_ = leafref_specification(builder_, 0);
    }
    else if (root_ == YANG_LENGTH_STMT) {
      result_ = length_stmt(builder_, 0);
    }
    else if (root_ == YANG_LINKAGE_STMTS) {
      result_ = linkage_stmts(builder_, 0);
    }
    else if (root_ == YANG_LIST_STMT) {
      result_ = list_stmt(builder_, 0);
    }
    else if (root_ == YANG_MANDATORY_ARG) {
      result_ = mandatory_arg(builder_, 0);
    }
    else if (root_ == YANG_MANDATORY_STMT) {
      result_ = mandatory_stmt(builder_, 0);
    }
    else if (root_ == YANG_MAX_ELEMENTS_STMT) {
      result_ = max_elements_stmt(builder_, 0);
    }
    else if (root_ == YANG_MAX_VALUE_ARG) {
      result_ = max_value_arg(builder_, 0);
    }
    else if (root_ == YANG_META_STMTS) {
      result_ = meta_stmts(builder_, 0);
    }
    else if (root_ == YANG_MIN_ELEMENTS_STMT) {
      result_ = min_elements_stmt(builder_, 0);
    }
    else if (root_ == YANG_MIN_VALUE_ARG) {
      result_ = min_value_arg(builder_, 0);
    }
    else if (root_ == YANG_MODULE_HEADER_STMTS) {
      result_ = module_header_stmts(builder_, 0);
    }
    else if (root_ == YANG_MODULE_STMT) {
      result_ = module_stmt(builder_, 0);
    }
    else if (root_ == YANG_MUST_STMT) {
      result_ = must_stmt(builder_, 0);
    }
    else if (root_ == YANG_NAMESPACE_STMT) {
      result_ = namespace_stmt(builder_, 0);
    }
    else if (root_ == YANG_NOTIFICATION_STMT) {
      result_ = notification_stmt(builder_, 0);
    }
    else if (root_ == YANG_NUMERICAL_RESTRICTIONS) {
      result_ = numerical_restrictions(builder_, 0);
    }
    else if (root_ == YANG_ORDERED_BY_ARG) {
      result_ = ordered_by_arg(builder_, 0);
    }
    else if (root_ == YANG_ORDERED_BY_STMT) {
      result_ = ordered_by_stmt(builder_, 0);
    }
    else if (root_ == YANG_ORGANIZATION_STMT) {
      result_ = organization_stmt(builder_, 0);
    }
    else if (root_ == YANG_OUTPUT_STMT) {
      result_ = output_stmt(builder_, 0);
    }
    else if (root_ == YANG_PATH_STMT) {
      result_ = path_stmt(builder_, 0);
    }
    else if (root_ == YANG_PATTERN_STMT) {
      result_ = pattern_stmt(builder_, 0);
    }
    else if (root_ == YANG_POSITION_STMT) {
      result_ = position_stmt(builder_, 0);
    }
    else if (root_ == YANG_PREFIX_STMT) {
      result_ = prefix_stmt(builder_, 0);
    }
    else if (root_ == YANG_PRESENCE_STMT) {
      result_ = presence_stmt(builder_, 0);
    }
    else if (root_ == YANG_RANGE_STMT) {
      result_ = range_stmt(builder_, 0);
    }
    else if (root_ == YANG_REFERENCE_STMT) {
      result_ = reference_stmt(builder_, 0);
    }
    else if (root_ == YANG_REFINE_ANYXML_STMTS) {
      result_ = refine_anyxml_stmts(builder_, 0);
    }
    else if (root_ == YANG_REFINE_CASE_STMTS) {
      result_ = refine_case_stmts(builder_, 0);
    }
    else if (root_ == YANG_REFINE_CHOICE_STMTS) {
      result_ = refine_choice_stmts(builder_, 0);
    }
    else if (root_ == YANG_REFINE_CONTAINER_STMTS) {
      result_ = refine_container_stmts(builder_, 0);
    }
    else if (root_ == YANG_REFINE_LEAF_LIST_STMTS) {
      result_ = refine_leaf_list_stmts(builder_, 0);
    }
    else if (root_ == YANG_REFINE_LEAF_STMTS) {
      result_ = refine_leaf_stmts(builder_, 0);
    }
    else if (root_ == YANG_REFINE_LIST_STMTS) {
      result_ = refine_list_stmts(builder_, 0);
    }
    else if (root_ == YANG_REFINE_POM) {
      result_ = refine_pom(builder_, 0);
    }
    else if (root_ == YANG_REFINE_STMT) {
      result_ = refine_stmt(builder_, 0);
    }
    else if (root_ == YANG_REQUIRE_INSTANCE_ARG) {
      result_ = require_instance_arg(builder_, 0);
    }
    else if (root_ == YANG_REQUIRE_INSTANCE_STMT) {
      result_ = require_instance_stmt(builder_, 0);
    }
    else if (root_ == YANG_REVISION_DATE_STMT) {
      result_ = revision_date_stmt(builder_, 0);
    }
    else if (root_ == YANG_REVISION_STMT) {
      result_ = revision_stmt(builder_, 0);
    }
    else if (root_ == YANG_REVISION_STMTS) {
      result_ = revision_stmts(builder_, 0);
    }
    else if (root_ == YANG_RPC_STMT) {
      result_ = rpc_stmt(builder_, 0);
    }
    else if (root_ == YANG_SHORT_CASE_STMT) {
      result_ = short_case_stmt(builder_, 0);
    }
    else if (root_ == YANG_STATUS_ARG) {
      result_ = status_arg(builder_, 0);
    }
    else if (root_ == YANG_STATUS_STMT) {
      result_ = status_stmt(builder_, 0);
    }
    else if (root_ == YANG_STMTEND) {
      result_ = stmtend(builder_, 0);
    }
    else if (root_ == YANG_STRING) {
      result_ = string(builder_, 0);
    }
    else if (root_ == YANG_STRING_RESTRICTIONS) {
      result_ = string_restrictions(builder_, 0);
    }
    else if (root_ == YANG_SUBMODULE_HEADER_STMTS) {
      result_ = submodule_header_stmts(builder_, 0);
    }
    else if (root_ == YANG_SUBMODULE_STMT) {
      result_ = submodule_stmt(builder_, 0);
    }
    else if (root_ == YANG_TYPE_BODY_STMTS) {
      result_ = type_body_stmts(builder_, 0);
    }
    else if (root_ == YANG_TYPE_STMT) {
      result_ = type_stmt(builder_, 0);
    }
    else if (root_ == YANG_TYPEDEF_STMT) {
      result_ = typedef_stmt(builder_, 0);
    }
    else if (root_ == YANG_UNION_SPECIFICATION) {
      result_ = union_specification(builder_, 0);
    }
    else if (root_ == YANG_UNIQUE_STMT) {
      result_ = unique_stmt(builder_, 0);
    }
    else if (root_ == YANG_UNITS_STMT) {
      result_ = units_stmt(builder_, 0);
    }
    else if (root_ == YANG_UNKNOWN_STATEMENT) {
      result_ = unknown_statement(builder_, 0);
    }
    else if (root_ == YANG_UNKNOWN_STATEMENT_2) {
      result_ = unknown_statement2(builder_, 0);
    }
    else if (root_ == YANG_UNKNOWN_STATEMENT_3) {
      result_ = unknown_statement3(builder_, 0);
    }
    else if (root_ == YANG_USES_AUGMENT_STMT) {
      result_ = uses_augment_stmt(builder_, 0);
    }
    else if (root_ == YANG_USES_STMT) {
      result_ = uses_stmt(builder_, 0);
    }
    else if (root_ == YANG_VALUE_STMT) {
      result_ = value_stmt(builder_, 0);
    }
    else if (root_ == YANG_WHEN_STMT) {
      result_ = when_stmt(builder_, 0);
    }
    else if (root_ == YANG_YANG_VERSION_STMT) {
      result_ = yang_version_stmt(builder_, 0);
    }
    else if (root_ == YANG_YIN_ELEMENT_ARG) {
      result_ = yin_element_arg(builder_, 0);
    }
    else if (root_ == YANG_YIN_ELEMENT_STMT) {
      result_ = yin_element_stmt(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return yang(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // ANYXML_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | must_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE))
  public static boolean anyxml_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ANYXML_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_ANYXML_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && anyxml_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ANYXML_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | must_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE)
  private static boolean anyxml_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = anyxml_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | must_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE
  private static boolean anyxml_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && anyxml_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |when_stmt | if_feature_stmt | must_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean anyxml_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!anyxml_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "anyxml_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |when_stmt | if_feature_stmt | must_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean anyxml_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = when_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = must_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = mandatory_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ARGUMENT_KEYWORD string (SEMICOLON | (LEFT_BRACE  (unknown_statement2)? (yin_element_stmt)? RIGHT_BRACE))
  public static boolean argument_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ARGUMENT_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_ARGUMENT_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && argument_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ARGUMENT_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (unknown_statement2)? (yin_element_stmt)? RIGHT_BRACE)
  private static boolean argument_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = argument_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (unknown_statement2)? (yin_element_stmt)? RIGHT_BRACE
  private static boolean argument_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && argument_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && argument_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (unknown_statement2)?
  private static boolean argument_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_stmt_2_1_1")) return false;
    argument_stmt_2_1_1_0(builder_, level_ + 1);
    return true;
  }

  // (unknown_statement2)
  private static boolean argument_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = unknown_statement2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (yin_element_stmt)?
  private static boolean argument_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_stmt_2_1_2")) return false;
    argument_stmt_2_1_2_0(builder_, level_ + 1);
    return true;
  }

  // (yin_element_stmt)
  private static boolean argument_stmt_2_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_stmt_2_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = yin_element_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // AUGMENT_KEYWORD string LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmt | case_stmt)+ RIGHT_BRACE
  public static boolean augment_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_AUGMENT_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_AUGMENT_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && augment_stmt_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_AUGMENT_STMT, result_);
    return result_;
  }

  // (identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmt | case_stmt)+
  private static boolean augment_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = augment_stmt_3_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!augment_stmt_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "augment_stmt_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmt | case_stmt
  private static boolean augment_stmt_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = when_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    if (!result_) result_ = data_def_stmt(builder_, level_ + 1);
    if (!result_) result_ = case_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // BASE_KEYWORD string stmtend
  public static boolean base_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "base_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_BASE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_BASE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_BASE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // BELONGS_TO_KEYWORD string LEFT_BRACE  prefix_stmt  RIGHT_BRACE
  public static boolean belongs_to_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "belongs_to_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_BELONGS_TO_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_BELONGS_TO_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && prefix_stmt(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_BELONGS_TO_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // BIT_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt |position_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE))
  public static boolean bit_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_BIT_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_BIT_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && bit_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_BIT_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt |position_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE)
  private static boolean bit_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = bit_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt |position_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE
  private static boolean bit_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && bit_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |position_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean bit_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!bit_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "bit_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |position_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean bit_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = position_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // bit_stmt (bit_stmt | identifier_stmt)*
  public static boolean bits_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bits_specification")) return false;
    if (!nextTokenIs(builder_, YANG_BIT_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = bit_stmt(builder_, level_ + 1);
    result_ = result_ && bits_specification_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_BITS_SPECIFICATION, result_);
    return result_;
  }

  // (bit_stmt | identifier_stmt)*
  private static boolean bits_specification_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bits_specification_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!bits_specification_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "bits_specification_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // bit_stmt | identifier_stmt
  private static boolean bits_specification_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bits_specification_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = bit_stmt(builder_, level_ + 1);
    if (!result_) result_ = identifier_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (( identifier_stmt| extension_stmt | feature_stmt | identity_stmt | typedef_stmt | grouping_stmt | data_def_stmt | augment_stmt | rpc_stmt | notification_stmt | deviation_stmt) )*
  public static boolean body_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_stmts")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<body stmts>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!body_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "body_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_BODY_STMTS, true, false, null);
    return true;
  }

  // identifier_stmt| extension_stmt | feature_stmt | identity_stmt | typedef_stmt | grouping_stmt | data_def_stmt | augment_stmt | rpc_stmt | notification_stmt | deviation_stmt
  private static boolean body_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = extension_stmt(builder_, level_ + 1);
    if (!result_) result_ = feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = identity_stmt(builder_, level_ + 1);
    if (!result_) result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    if (!result_) result_ = data_def_stmt(builder_, level_ + 1);
    if (!result_) result_ = augment_stmt(builder_, level_ + 1);
    if (!result_) result_ = rpc_stmt(builder_, level_ + 1);
    if (!result_) result_ = notification_stmt(builder_, level_ + 1);
    if (!result_) result_ = deviation_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CASE_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmt )* RIGHT_BRACE))
  public static boolean case_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_CASE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_CASE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && case_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_CASE_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmt )* RIGHT_BRACE)
  private static boolean case_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = case_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmt )* RIGHT_BRACE
  private static boolean case_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && case_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmt )*
  private static boolean case_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!case_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "case_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmt
  private static boolean case_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = when_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    if (!result_) result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CHOICE_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt)* RIGHT_BRACE))
  public static boolean choice_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_CHOICE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_CHOICE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && choice_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_CHOICE_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt)* RIGHT_BRACE)
  private static boolean choice_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = choice_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt)* RIGHT_BRACE
  private static boolean choice_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && choice_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |when_stmt | if_feature_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt)*
  private static boolean choice_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!choice_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "choice_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |when_stmt | if_feature_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt
  private static boolean choice_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = when_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = default_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = mandatory_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    if (!result_) result_ = short_case_stmt(builder_, level_ + 1);
    if (!result_) result_ = case_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // string
  public static boolean config_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "config_arg")) return false;
    if (!nextTokenIs(builder_, YANG_STRING_LITERAL)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = string(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_CONFIG_ARG, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONFIG_KEYWORD config_arg stmtend
  public static boolean config_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "config_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_CONFIG_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_CONFIG_KEYWORD);
    result_ = result_ && config_arg(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_CONFIG_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONTACT_KEYWORD string stmtend
  public static boolean contact_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "contact_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_CONTACT_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_CONTACT_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_CONTACT_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONTAINER_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | presence_stmt | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )* RIGHT_BRACE))
  public static boolean container_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_CONTAINER_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_CONTAINER_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && container_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_CONTAINER_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | presence_stmt | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )* RIGHT_BRACE)
  private static boolean container_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = container_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | presence_stmt | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )* RIGHT_BRACE
  private static boolean container_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && container_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | presence_stmt | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )*
  private static boolean container_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!container_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "container_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt | when_stmt | if_feature_stmt | must_stmt | presence_stmt | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt
  private static boolean container_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = when_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = must_stmt(builder_, level_ + 1);
    if (!result_) result_ = presence_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    if (!result_) result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    if (!result_) result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // container_stmt | leaf_stmt | leaf_list_stmt | list_stmt | choice_stmt | anyxml_stmt | uses_stmt
  public static boolean data_def_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "data_def_stmt")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<data def stmt>");
    result_ = container_stmt(builder_, level_ + 1);
    if (!result_) result_ = leaf_stmt(builder_, level_ + 1);
    if (!result_) result_ = leaf_list_stmt(builder_, level_ + 1);
    if (!result_) result_ = list_stmt(builder_, level_ + 1);
    if (!result_) result_ = choice_stmt(builder_, level_ + 1);
    if (!result_) result_ = anyxml_stmt(builder_, level_ + 1);
    if (!result_) result_ = uses_stmt(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YANG_DATA_DEF_STMT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // numerical_restrictions? (identifier_stmt)* fraction_digits_stmt | fraction_digits_stmt (identifier_stmt)* numerical_restrictions?
  public static boolean decimal64_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "decimal64_specification")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<decimal 64 specification>");
    result_ = decimal64_specification_0(builder_, level_ + 1);
    if (!result_) result_ = decimal64_specification_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YANG_DECIMAL_64_SPECIFICATION, result_, false, null);
    return result_;
  }

  // numerical_restrictions? (identifier_stmt)* fraction_digits_stmt
  private static boolean decimal64_specification_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "decimal64_specification_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = decimal64_specification_0_0(builder_, level_ + 1);
    result_ = result_ && decimal64_specification_0_1(builder_, level_ + 1);
    result_ = result_ && fraction_digits_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // numerical_restrictions?
  private static boolean decimal64_specification_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "decimal64_specification_0_0")) return false;
    numerical_restrictions(builder_, level_ + 1);
    return true;
  }

  // (identifier_stmt)*
  private static boolean decimal64_specification_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "decimal64_specification_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!decimal64_specification_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "decimal64_specification_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (identifier_stmt)
  private static boolean decimal64_specification_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "decimal64_specification_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // fraction_digits_stmt (identifier_stmt)* numerical_restrictions?
  private static boolean decimal64_specification_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "decimal64_specification_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = fraction_digits_stmt(builder_, level_ + 1);
    result_ = result_ && decimal64_specification_1_1(builder_, level_ + 1);
    result_ = result_ && decimal64_specification_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt)*
  private static boolean decimal64_specification_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "decimal64_specification_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!decimal64_specification_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "decimal64_specification_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (identifier_stmt)
  private static boolean decimal64_specification_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "decimal64_specification_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // numerical_restrictions?
  private static boolean decimal64_specification_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "decimal64_specification_1_2")) return false;
    numerical_restrictions(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // DEFAULT_KEYWORD string stmtend
  public static boolean default_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "default_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DEFAULT_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_DEFAULT_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_DEFAULT_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // DESCRIPTION_KEYWORD string stmtend
  public static boolean description_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "description_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DESCRIPTION_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_DESCRIPTION_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_DESCRIPTION_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // DEVIATE_KEYWORD string (SEMICOLON | (LEFT_BRACE (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt | mandatory_stmt  | min_elements_stmt  | max_elements_stmt )* RIGHT_BRACE))
  public static boolean deviate_add_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DEVIATE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_DEVIATE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && deviate_add_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_DEVIATE_ADD_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt | mandatory_stmt  | min_elements_stmt  | max_elements_stmt )* RIGHT_BRACE)
  private static boolean deviate_add_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = deviate_add_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt | mandatory_stmt  | min_elements_stmt  | max_elements_stmt )* RIGHT_BRACE
  private static boolean deviate_add_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && deviate_add_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt | mandatory_stmt  | min_elements_stmt  | max_elements_stmt )*
  private static boolean deviate_add_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!deviate_add_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "deviate_add_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt | mandatory_stmt  | min_elements_stmt  | max_elements_stmt
  private static boolean deviate_add_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = units_stmt(builder_, level_ + 1);
    if (!result_) result_ = must_stmt(builder_, level_ + 1);
    if (!result_) result_ = unique_stmt(builder_, level_ + 1);
    if (!result_) result_ = default_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = mandatory_stmt(builder_, level_ + 1);
    if (!result_) result_ = min_elements_stmt(builder_, level_ + 1);
    if (!result_) result_ = max_elements_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DEVIATE_KEYWORD string (SEMICOLON | (LEFT_BRACE (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt )* RIGHT_BRACE))
  public static boolean deviate_delete_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DEVIATE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_DEVIATE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && deviate_delete_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_DEVIATE_DELETE_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt )* RIGHT_BRACE)
  private static boolean deviate_delete_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = deviate_delete_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt )* RIGHT_BRACE
  private static boolean deviate_delete_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && deviate_delete_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt )*
  private static boolean deviate_delete_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!deviate_delete_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "deviate_delete_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt
  private static boolean deviate_delete_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = units_stmt(builder_, level_ + 1);
    if (!result_) result_ = must_stmt(builder_, level_ + 1);
    if (!result_) result_ = unique_stmt(builder_, level_ + 1);
    if (!result_) result_ = default_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DEVIATE_KEYWORD string (SEMICOLON | (LEFT_BRACE identifier_stmt? RIGHT_BRACE))
  public static boolean deviate_not_supported_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_not_supported_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DEVIATE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_DEVIATE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && deviate_not_supported_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_DEVIATE_NOT_SUPPORTED_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE identifier_stmt? RIGHT_BRACE)
  private static boolean deviate_not_supported_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_not_supported_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = deviate_not_supported_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE identifier_stmt? RIGHT_BRACE
  private static boolean deviate_not_supported_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_not_supported_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && deviate_not_supported_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier_stmt?
  private static boolean deviate_not_supported_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_not_supported_stmt_2_1_1")) return false;
    identifier_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // DEVIATE_KEYWORD string (SEMICOLON | (LEFT_BRACE (identifier_stmt |type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt | min_elements_stmt | max_elements_stmt )* RIGHT_BRACE))
  public static boolean deviate_replace_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DEVIATE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_DEVIATE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && deviate_replace_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_DEVIATE_REPLACE_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE (identifier_stmt |type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt | min_elements_stmt | max_elements_stmt )* RIGHT_BRACE)
  private static boolean deviate_replace_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = deviate_replace_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE (identifier_stmt |type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt | min_elements_stmt | max_elements_stmt )* RIGHT_BRACE
  private static boolean deviate_replace_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && deviate_replace_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt | min_elements_stmt | max_elements_stmt )*
  private static boolean deviate_replace_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!deviate_replace_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "deviate_replace_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt | min_elements_stmt | max_elements_stmt
  private static boolean deviate_replace_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = type_stmt(builder_, level_ + 1);
    if (!result_) result_ = units_stmt(builder_, level_ + 1);
    if (!result_) result_ = default_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = mandatory_stmt(builder_, level_ + 1);
    if (!result_) result_ = min_elements_stmt(builder_, level_ + 1);
    if (!result_) result_ = max_elements_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DEVIATION_KEYWORD string LEFT_BRACE (identifier_stmt |description_stmt | reference_stmt | deviate_not_supported_stmt | deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt)+ RIGHT_BRACE
  public static boolean deviation_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviation_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DEVIATION_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_DEVIATION_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && deviation_stmt_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_DEVIATION_STMT, result_);
    return result_;
  }

  // (identifier_stmt |description_stmt | reference_stmt | deviate_not_supported_stmt | deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt)+
  private static boolean deviation_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviation_stmt_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = deviation_stmt_3_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!deviation_stmt_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "deviation_stmt_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier_stmt |description_stmt | reference_stmt | deviate_not_supported_stmt | deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt
  private static boolean deviation_stmt_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviation_stmt_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    if (!result_) result_ = deviate_not_supported_stmt(builder_, level_ + 1);
    if (!result_) result_ = deviate_add_stmt(builder_, level_ + 1);
    if (!result_) result_ = deviate_replace_stmt(builder_, level_ + 1);
    if (!result_) result_ = deviate_delete_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // enum_stmt (identifier_stmt | enum_stmt )*
  public static boolean enum_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_specification")) return false;
    if (!nextTokenIs(builder_, YANG_ENUM_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = enum_stmt(builder_, level_ + 1);
    result_ = result_ && enum_specification_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ENUM_SPECIFICATION, result_);
    return result_;
  }

  // (identifier_stmt | enum_stmt )*
  private static boolean enum_specification_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_specification_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!enum_specification_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_specification_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt | enum_stmt
  private static boolean enum_specification_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_specification_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = enum_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ENUM_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt |value_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE))
  public static boolean enum_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ENUM_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_ENUM_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && enum_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ENUM_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt |value_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE)
  private static boolean enum_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = enum_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt |value_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE
  private static boolean enum_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && enum_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |value_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean enum_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!enum_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |value_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean enum_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = value_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ERROR_APP_TAG_KEYWORD string stmtend
  public static boolean error_app_tag_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "error_app_tag_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ERROR_APP_TAG_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_ERROR_APP_TAG_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ERROR_APP_TAG_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ERROR_MESSAGE_KEYWORD string stmtend
  public static boolean error_message_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "error_message_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ERROR_MESSAGE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_ERROR_MESSAGE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ERROR_MESSAGE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // EXTENSION_KEYWORD string (SEMICOLON | (LEFT_BRACE  (unknown_statement | argument_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE))
  public static boolean extension_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extension_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_EXTENSION_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_EXTENSION_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && extension_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_EXTENSION_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (unknown_statement | argument_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE)
  private static boolean extension_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extension_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = extension_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (unknown_statement | argument_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE
  private static boolean extension_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extension_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && extension_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (unknown_statement | argument_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean extension_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extension_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!extension_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "extension_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // unknown_statement | argument_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean extension_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extension_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = unknown_statement(builder_, level_ + 1);
    if (!result_) result_ = argument_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // FEATURE_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE))
  public static boolean feature_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "feature_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_FEATURE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_FEATURE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && feature_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_FEATURE_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE)
  private static boolean feature_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "feature_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = feature_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE
  private static boolean feature_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "feature_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && feature_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean feature_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "feature_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!feature_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "feature_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean feature_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "feature_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // FRACTION_DIGITS_KEYWORD string stmtend
  public static boolean fraction_digits_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fraction_digits_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_FRACTION_DIGITS_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_FRACTION_DIGITS_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_FRACTION_DIGITS_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // GROUPING_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt |status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )* RIGHT_BRACE))
  public static boolean grouping_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_GROUPING_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_GROUPING_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && grouping_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_GROUPING_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt |status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )* RIGHT_BRACE)
  private static boolean grouping_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = grouping_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt |status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )* RIGHT_BRACE
  private static boolean grouping_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && grouping_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )*
  private static boolean grouping_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!grouping_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "grouping_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt
  private static boolean grouping_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    if (!result_) result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    if (!result_) result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER string? (stmtend | (LEFT_BRACE unknown_statement* RIGHT_BRACE))
  public static boolean identifier_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_IDENTIFIER);
    result_ = result_ && identifier_stmt_1(builder_, level_ + 1);
    result_ = result_ && identifier_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_IDENTIFIER_STMT, result_);
    return result_;
  }

  // string?
  private static boolean identifier_stmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_stmt_1")) return false;
    string(builder_, level_ + 1);
    return true;
  }

  // stmtend | (LEFT_BRACE unknown_statement* RIGHT_BRACE)
  private static boolean identifier_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = stmtend(builder_, level_ + 1);
    if (!result_) result_ = identifier_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE unknown_statement* RIGHT_BRACE
  private static boolean identifier_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && identifier_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // unknown_statement*
  private static boolean identifier_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!unknown_statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "identifier_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTITY_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt | base_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE))
  public static boolean identity_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identity_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_IDENTITY_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_IDENTITY_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && identity_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_IDENTITY_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt | base_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE)
  private static boolean identity_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identity_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = identity_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt | base_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE
  private static boolean identity_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identity_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && identity_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt | base_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean identity_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identity_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!identity_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "identity_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt | base_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean identity_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identity_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = base_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // base_stmt
  public static boolean identityref_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identityref_specification")) return false;
    if (!nextTokenIs(builder_, YANG_BASE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = base_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_IDENTITYREF_SPECIFICATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IF_FEATURE_KEYWORD string stmtend
  public static boolean if_feature_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_feature_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_IF_FEATURE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_IF_FEATURE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_IF_FEATURE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // IMPORT_KEYWORD string LEFT_BRACE  prefix_stmt  (revision_date_stmt )? RIGHT_BRACE
  public static boolean import_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_IMPORT_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_IMPORT_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && prefix_stmt(builder_, level_ + 1);
    result_ = result_ && import_stmt_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_IMPORT_STMT, result_);
    return result_;
  }

  // (revision_date_stmt )?
  private static boolean import_stmt_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_stmt_4")) return false;
    import_stmt_4_0(builder_, level_ + 1);
    return true;
  }

  // (revision_date_stmt )
  private static boolean import_stmt_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_stmt_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = revision_date_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // INCLUDE_KEYWORD string (SEMICOLON | (LEFT_BRACE  (revision_date_stmt )? RIGHT_BRACE))
  public static boolean include_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_INCLUDE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_INCLUDE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && include_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_INCLUDE_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (revision_date_stmt )? RIGHT_BRACE)
  private static boolean include_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = include_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (revision_date_stmt )? RIGHT_BRACE
  private static boolean include_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && include_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (revision_date_stmt )?
  private static boolean include_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_stmt_2_1_1")) return false;
    include_stmt_2_1_1_0(builder_, level_ + 1);
    return true;
  }

  // (revision_date_stmt )
  private static boolean include_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = revision_date_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // INPUT_KEYWORD LEFT_BRACE (identifier_stmt |typedef_stmt | grouping_stmt | data_def_stmt )* RIGHT_BRACE
  public static boolean input_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_INPUT_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_INPUT_KEYWORD, YANG_LEFT_BRACE);
    result_ = result_ && input_stmt_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_INPUT_STMT, result_);
    return result_;
  }

  // (identifier_stmt |typedef_stmt | grouping_stmt | data_def_stmt )*
  private static boolean input_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_stmt_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!input_stmt_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "input_stmt_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |typedef_stmt | grouping_stmt | data_def_stmt
  private static boolean input_stmt_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_stmt_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    if (!result_) result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (require_instance_stmt )?
  public static boolean instance_identifier_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instance_identifier_specification")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<instance identifier specification>");
    instance_identifier_specification_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YANG_INSTANCE_IDENTIFIER_SPECIFICATION, true, false, null);
    return true;
  }

  // (require_instance_stmt )
  private static boolean instance_identifier_specification_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instance_identifier_specification_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = require_instance_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KEY_KEYWORD string stmtend
  public static boolean key_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "key_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_KEY_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_KEY_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_KEY_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // LEAF_LIST_KEYWORD string LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE
  public static boolean leaf_list_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_LEAF_LIST_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEAF_LIST_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && leaf_list_stmt_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_LEAF_LIST_STMT, result_);
    return result_;
  }

  // (identifier_stmt |when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean leaf_list_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!leaf_list_stmt_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "leaf_list_stmt_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean leaf_list_stmt_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = when_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = type_stmt(builder_, level_ + 1);
    if (!result_) result_ = units_stmt(builder_, level_ + 1);
    if (!result_) result_ = must_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = min_elements_stmt(builder_, level_ + 1);
    if (!result_) result_ = max_elements_stmt(builder_, level_ + 1);
    if (!result_) result_ = ordered_by_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LEAF_KEYWORD string LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt )* RIGHT_BRACE
  public static boolean leaf_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_LEAF_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEAF_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && leaf_stmt_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_LEAF_STMT, result_);
    return result_;
  }

  // (identifier_stmt |when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean leaf_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!leaf_stmt_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "leaf_stmt_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean leaf_stmt_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = when_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = type_stmt(builder_, level_ + 1);
    if (!result_) result_ = units_stmt(builder_, level_ + 1);
    if (!result_) result_ = must_stmt(builder_, level_ + 1);
    if (!result_) result_ = default_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = mandatory_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // path_stmt
  public static boolean leafref_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leafref_specification")) return false;
    if (!nextTokenIs(builder_, YANG_PATH_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = path_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_LEAFREF_SPECIFICATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // LENGTH_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* RIGHT_BRACE))
  public static boolean length_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "length_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_LENGTH_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LENGTH_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && length_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_LENGTH_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* RIGHT_BRACE)
  private static boolean length_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "length_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = length_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* RIGHT_BRACE
  private static boolean length_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "length_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && length_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )*
  private static boolean length_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "length_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!length_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "length_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt
  private static boolean length_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "length_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = error_message_stmt(builder_, level_ + 1);
    if (!result_) result_ = error_app_tag_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (import_stmt | include_stmt )*
  public static boolean linkage_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "linkage_stmts")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<linkage stmts>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!linkage_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "linkage_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_LINKAGE_STMTS, true, false, null);
    return true;
  }

  // import_stmt | include_stmt
  private static boolean linkage_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "linkage_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = import_stmt(builder_, level_ + 1);
    if (!result_) result_ = include_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LIST_KEYWORD string LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | must_stmt | key_stmt | unique_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )* RIGHT_BRACE
  public static boolean list_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_LIST_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LIST_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && list_stmt_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_LIST_STMT, result_);
    return result_;
  }

  // (identifier_stmt |when_stmt | if_feature_stmt | must_stmt | key_stmt | unique_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )*
  private static boolean list_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!list_stmt_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "list_stmt_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |when_stmt | if_feature_stmt | must_stmt | key_stmt | unique_stmt | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt
  private static boolean list_stmt_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = when_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = must_stmt(builder_, level_ + 1);
    if (!result_) result_ = key_stmt(builder_, level_ + 1);
    if (!result_) result_ = unique_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = min_elements_stmt(builder_, level_ + 1);
    if (!result_) result_ = max_elements_stmt(builder_, level_ + 1);
    if (!result_) result_ = ordered_by_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    if (!result_) result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    if (!result_) result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // string
  public static boolean mandatory_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mandatory_arg")) return false;
    if (!nextTokenIs(builder_, YANG_STRING_LITERAL)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = string(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_MANDATORY_ARG, result_);
    return result_;
  }

  /* ********************************************************** */
  // MANDATORY_KEYWORD mandatory_arg stmtend
  public static boolean mandatory_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mandatory_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_MANDATORY_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_MANDATORY_KEYWORD);
    result_ = result_ && mandatory_arg(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_MANDATORY_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // MAX_ELEMENTS_KEYWORD max_value_arg stmtend
  public static boolean max_elements_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "max_elements_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_MAX_ELEMENTS_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_MAX_ELEMENTS_KEYWORD);
    result_ = result_ && max_value_arg(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_MAX_ELEMENTS_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // string
  public static boolean max_value_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "max_value_arg")) return false;
    if (!nextTokenIs(builder_, YANG_STRING_LITERAL)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = string(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_MAX_VALUE_ARG, result_);
    return result_;
  }

  /* ********************************************************** */
  // (organization_stmt | contact_stmt | description_stmt | reference_stmt )*
  public static boolean meta_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "meta_stmts")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<meta stmts>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!meta_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "meta_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_META_STMTS, true, false, null);
    return true;
  }

  // organization_stmt | contact_stmt | description_stmt | reference_stmt
  private static boolean meta_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "meta_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = organization_stmt(builder_, level_ + 1);
    if (!result_) result_ = contact_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // MIN_ELEMENTS_KEYWORD min_value_arg stmtend
  public static boolean min_elements_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "min_elements_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_MIN_ELEMENTS_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_MIN_ELEMENTS_KEYWORD);
    result_ = result_ && min_value_arg(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_MIN_ELEMENTS_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // string
  public static boolean min_value_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "min_value_arg")) return false;
    if (!nextTokenIs(builder_, YANG_STRING_LITERAL)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = string(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_MIN_VALUE_ARG, result_);
    return result_;
  }

  /* ********************************************************** */
  // (yang_version_stmt | namespace_stmt | prefix_stmt)+
  public static boolean module_header_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_header_stmts")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<module header stmts>");
    result_ = module_header_stmts_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!module_header_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "module_header_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_MODULE_HEADER_STMTS, result_, false, null);
    return result_;
  }

  // yang_version_stmt | namespace_stmt | prefix_stmt
  private static boolean module_header_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_header_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = yang_version_stmt(builder_, level_ + 1);
    if (!result_) result_ = namespace_stmt(builder_, level_ + 1);
    if (!result_) result_ = prefix_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // MODULE_KEYWORD string LEFT_BRACE  module_header_stmts linkage_stmts meta_stmts revision_stmts body_stmts RIGHT_BRACE
  public static boolean module_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_MODULE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_MODULE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && module_header_stmts(builder_, level_ + 1);
    result_ = result_ && linkage_stmts(builder_, level_ + 1);
    result_ = result_ && meta_stmts(builder_, level_ + 1);
    result_ = result_ && revision_stmts(builder_, level_ + 1);
    result_ = result_ && body_stmts(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_MODULE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // MUST_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* RIGHT_BRACE))
  public static boolean must_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "must_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_MUST_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_MUST_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && must_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_MUST_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* RIGHT_BRACE)
  private static boolean must_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "must_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = must_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* RIGHT_BRACE
  private static boolean must_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "must_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && must_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )*
  private static boolean must_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "must_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!must_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "must_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt
  private static boolean must_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "must_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = error_message_stmt(builder_, level_ + 1);
    if (!result_) result_ = error_app_tag_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // NAMESPACE_KEYWORD string stmtend
  public static boolean namespace_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_NAMESPACE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_NAMESPACE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_NAMESPACE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // NOTIFICATION_KEYWORD string (SEMICOLON | (LEFT_BRACE (identifier_stmt |if_feature_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )* RIGHT_BRACE))
  public static boolean notification_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_NOTIFICATION_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_NOTIFICATION_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && notification_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_NOTIFICATION_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE (identifier_stmt |if_feature_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )* RIGHT_BRACE)
  private static boolean notification_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = notification_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE (identifier_stmt |if_feature_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )* RIGHT_BRACE
  private static boolean notification_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && notification_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |if_feature_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )*
  private static boolean notification_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!notification_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "notification_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |if_feature_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt
  private static boolean notification_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    if (!result_) result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    if (!result_) result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // range_stmt
  public static boolean numerical_restrictions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "numerical_restrictions")) return false;
    if (!nextTokenIs(builder_, YANG_RANGE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = range_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_NUMERICAL_RESTRICTIONS, result_);
    return result_;
  }

  /* ********************************************************** */
  // string
  public static boolean ordered_by_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ordered_by_arg")) return false;
    if (!nextTokenIs(builder_, YANG_STRING_LITERAL)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = string(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ORDERED_BY_ARG, result_);
    return result_;
  }

  /* ********************************************************** */
  // ORDERED_BY_KEYWORD ordered_by_arg stmtend
  public static boolean ordered_by_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ordered_by_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ORDERED_BY_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_ORDERED_BY_KEYWORD);
    result_ = result_ && ordered_by_arg(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ORDERED_BY_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ORGANIZATION_KEYWORD string stmtend
  public static boolean organization_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "organization_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ORGANIZATION_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_ORGANIZATION_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ORGANIZATION_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // OUTPUT_KEYWORD LEFT_BRACE (identifier_stmt |typedef_stmt | grouping_stmt | data_def_stmt )* RIGHT_BRACE
  public static boolean output_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "output_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_OUTPUT_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_OUTPUT_KEYWORD, YANG_LEFT_BRACE);
    result_ = result_ && output_stmt_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_OUTPUT_STMT, result_);
    return result_;
  }

  // (identifier_stmt |typedef_stmt | grouping_stmt | data_def_stmt )*
  private static boolean output_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "output_stmt_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!output_stmt_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "output_stmt_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |typedef_stmt | grouping_stmt | data_def_stmt
  private static boolean output_stmt_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "output_stmt_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    if (!result_) result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PATH_KEYWORD string stmtend
  public static boolean path_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "path_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_PATH_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_PATH_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_PATH_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // PATTERN_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* RIGHT_BRACE))
  public static boolean pattern_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_PATTERN_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_PATTERN_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && pattern_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_PATTERN_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* RIGHT_BRACE)
  private static boolean pattern_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = pattern_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* RIGHT_BRACE
  private static boolean pattern_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && pattern_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )*
  private static boolean pattern_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!pattern_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "pattern_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt
  private static boolean pattern_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = error_message_stmt(builder_, level_ + 1);
    if (!result_) result_ = error_app_tag_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // POSITION_KEYWORD string stmtend
  public static boolean position_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "position_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_POSITION_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_POSITION_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_POSITION_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // PREFIX_KEYWORD string stmtend
  public static boolean prefix_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefix_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_PREFIX_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_PREFIX_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_PREFIX_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // PRESENCE_KEYWORD string stmtend
  public static boolean presence_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "presence_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_PRESENCE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_PRESENCE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_PRESENCE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // RANGE_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* RIGHT_BRACE))
  public static boolean range_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_RANGE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_RANGE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && range_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_RANGE_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* RIGHT_BRACE)
  private static boolean range_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = range_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* RIGHT_BRACE
  private static boolean range_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && range_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )*
  private static boolean range_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!range_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "range_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt
  private static boolean range_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = error_message_stmt(builder_, level_ + 1);
    if (!result_) result_ = error_app_tag_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // REFERENCE_KEYWORD string stmtend
  public static boolean reference_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reference_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_REFERENCE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_REFERENCE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_REFERENCE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // (identifier_stmt |must_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt )*
  public static boolean refine_anyxml_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_anyxml_stmts")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<refine anyxml stmts>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!refine_anyxml_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "refine_anyxml_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_REFINE_ANYXML_STMTS, true, false, null);
    return true;
  }

  // identifier_stmt |must_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt
  private static boolean refine_anyxml_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_anyxml_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = must_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = mandatory_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (identifier_stmt |description_stmt | reference_stmt )*
  public static boolean refine_case_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_case_stmts")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<refine case stmts>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!refine_case_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "refine_case_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_REFINE_CASE_STMTS, true, false, null);
    return true;
  }

  // identifier_stmt |description_stmt | reference_stmt
  private static boolean refine_case_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_case_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (identifier_stmt |default_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt )*
  public static boolean refine_choice_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_choice_stmts")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<refine choice stmts>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!refine_choice_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "refine_choice_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_REFINE_CHOICE_STMTS, true, false, null);
    return true;
  }

  // identifier_stmt |default_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt
  private static boolean refine_choice_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_choice_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = default_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = mandatory_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (identifier_stmt |must_stmt | presence_stmt | config_stmt | description_stmt | reference_stmt )*
  public static boolean refine_container_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_container_stmts")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<refine container stmts>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!refine_container_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "refine_container_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_REFINE_CONTAINER_STMTS, true, false, null);
    return true;
  }

  // identifier_stmt |must_stmt | presence_stmt | config_stmt | description_stmt | reference_stmt
  private static boolean refine_container_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_container_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = must_stmt(builder_, level_ + 1);
    if (!result_) result_ = presence_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (identifier_stmt |must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | description_stmt | reference_stmt )*
  public static boolean refine_leaf_list_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_list_stmts")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<refine leaf list stmts>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!refine_leaf_list_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "refine_leaf_list_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_REFINE_LEAF_LIST_STMTS, true, false, null);
    return true;
  }

  // identifier_stmt |must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | description_stmt | reference_stmt
  private static boolean refine_leaf_list_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_list_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = must_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = min_elements_stmt(builder_, level_ + 1);
    if (!result_) result_ = max_elements_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (identifier_stmt |must_stmt | default_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt )*
  public static boolean refine_leaf_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_stmts")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<refine leaf stmts>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!refine_leaf_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "refine_leaf_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_REFINE_LEAF_STMTS, true, false, null);
    return true;
  }

  // identifier_stmt |must_stmt | default_stmt | config_stmt | mandatory_stmt | description_stmt | reference_stmt
  private static boolean refine_leaf_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = must_stmt(builder_, level_ + 1);
    if (!result_) result_ = default_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = mandatory_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (identifier_stmt |must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | description_stmt | reference_stmt )*
  public static boolean refine_list_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_list_stmts")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<refine list stmts>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!refine_list_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "refine_list_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_REFINE_LIST_STMTS, true, false, null);
    return true;
  }

  // identifier_stmt |must_stmt | config_stmt | min_elements_stmt | max_elements_stmt | description_stmt | reference_stmt
  private static boolean refine_list_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_list_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = must_stmt(builder_, level_ + 1);
    if (!result_) result_ = config_stmt(builder_, level_ + 1);
    if (!result_) result_ = min_elements_stmt(builder_, level_ + 1);
    if (!result_) result_ = max_elements_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // refine_container_stmts | refine_leaf_stmts | refine_leaf_list_stmts | refine_list_stmts | refine_choice_stmts | refine_case_stmts | refine_anyxml_stmts
  public static boolean refine_pom(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_pom")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<refine pom>");
    result_ = refine_container_stmts(builder_, level_ + 1);
    if (!result_) result_ = refine_leaf_stmts(builder_, level_ + 1);
    if (!result_) result_ = refine_leaf_list_stmts(builder_, level_ + 1);
    if (!result_) result_ = refine_list_stmts(builder_, level_ + 1);
    if (!result_) result_ = refine_choice_stmts(builder_, level_ + 1);
    if (!result_) result_ = refine_case_stmts(builder_, level_ + 1);
    if (!result_) result_ = refine_anyxml_stmts(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YANG_REFINE_POM, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // REFINE_KEYWORD string (SEMICOLON | (LEFT_BRACE  (refine_pom) RIGHT_BRACE))
  public static boolean refine_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_REFINE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_REFINE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && refine_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_REFINE_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (refine_pom) RIGHT_BRACE)
  private static boolean refine_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = refine_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (refine_pom) RIGHT_BRACE
  private static boolean refine_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && refine_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (refine_pom)
  private static boolean refine_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_stmt_2_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_pom(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // string
  public static boolean require_instance_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "require_instance_arg")) return false;
    if (!nextTokenIs(builder_, YANG_STRING_LITERAL)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = string(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_REQUIRE_INSTANCE_ARG, result_);
    return result_;
  }

  /* ********************************************************** */
  // REQUIRE_INSTANCE_KEYWORD require_instance_arg stmtend
  public static boolean require_instance_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "require_instance_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_REQUIRE_INSTANCE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_REQUIRE_INSTANCE_KEYWORD);
    result_ = result_ && require_instance_arg(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_REQUIRE_INSTANCE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // REVISION_DATE_KEYWORD string stmtend
  public static boolean revision_date_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_date_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_REVISION_DATE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_REVISION_DATE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_REVISION_DATE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // REVISION_KEYWORD string (SEMICOLON | (LEFT_BRACE  (description_stmt )? (reference_stmt )? RIGHT_BRACE))
  public static boolean revision_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_REVISION_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_REVISION_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && revision_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_REVISION_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (description_stmt )? (reference_stmt )? RIGHT_BRACE)
  private static boolean revision_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = revision_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (description_stmt )? (reference_stmt )? RIGHT_BRACE
  private static boolean revision_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && revision_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && revision_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (description_stmt )?
  private static boolean revision_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmt_2_1_1")) return false;
    revision_stmt_2_1_1_0(builder_, level_ + 1);
    return true;
  }

  // (description_stmt )
  private static boolean revision_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = description_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (reference_stmt )?
  private static boolean revision_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmt_2_1_2")) return false;
    revision_stmt_2_1_2_0(builder_, level_ + 1);
    return true;
  }

  // (reference_stmt )
  private static boolean revision_stmt_2_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmt_2_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (revision_stmt )*
  public static boolean revision_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmts")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<revision stmts>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!revision_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "revision_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_REVISION_STMTS, true, false, null);
    return true;
  }

  // (revision_stmt )
  private static boolean revision_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = revision_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // RPC_KEYWORD string (SEMICOLON | (LEFT_BRACE (identifier_stmt |if_feature_stmt  | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | input_stmt | output_stmt )* RIGHT_BRACE))
  public static boolean rpc_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_RPC_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_RPC_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && rpc_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_RPC_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE (identifier_stmt |if_feature_stmt  | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | input_stmt | output_stmt )* RIGHT_BRACE)
  private static boolean rpc_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = rpc_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE (identifier_stmt |if_feature_stmt  | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | input_stmt | output_stmt )* RIGHT_BRACE
  private static boolean rpc_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && rpc_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |if_feature_stmt  | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | input_stmt | output_stmt )*
  private static boolean rpc_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!rpc_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "rpc_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |if_feature_stmt  | status_stmt | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | input_stmt | output_stmt
  private static boolean rpc_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    if (!result_) result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    if (!result_) result_ = input_stmt(builder_, level_ + 1);
    if (!result_) result_ = output_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // container_stmt | leaf_stmt | leaf_list_stmt | list_stmt | anyxml_stmt
  public static boolean short_case_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "short_case_stmt")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<short case stmt>");
    result_ = container_stmt(builder_, level_ + 1);
    if (!result_) result_ = leaf_stmt(builder_, level_ + 1);
    if (!result_) result_ = leaf_list_stmt(builder_, level_ + 1);
    if (!result_) result_ = list_stmt(builder_, level_ + 1);
    if (!result_) result_ = anyxml_stmt(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YANG_SHORT_CASE_STMT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // string
  public static boolean status_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "status_arg")) return false;
    if (!nextTokenIs(builder_, YANG_STRING_LITERAL)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = string(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_STATUS_ARG, result_);
    return result_;
  }

  /* ********************************************************** */
  // STATUS_KEYWORD status_arg stmtend
  public static boolean status_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "status_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_STATUS_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_STATUS_KEYWORD);
    result_ = result_ && status_arg(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_STATUS_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // (SEMICOLON) | (LEFT_BRACE identifier_stmt? RIGHT_BRACE)
  public static boolean stmtend(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stmtend")) return false;
    if (!nextTokenIs(builder_, "<stmtend>", YANG_LEFT_BRACE, YANG_SEMICOLON)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<stmtend>");
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = stmtend_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YANG_STMTEND, result_, false, null);
    return result_;
  }

  // LEFT_BRACE identifier_stmt? RIGHT_BRACE
  private static boolean stmtend_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stmtend_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && stmtend_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier_stmt?
  private static boolean stmtend_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stmtend_1_1")) return false;
    identifier_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // STRING_LITERAL (PLUS STRING_LITERAL)*
  public static boolean string(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string")) return false;
    if (!nextTokenIs(builder_, YANG_STRING_LITERAL)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_STRING_LITERAL);
    result_ = result_ && string_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_STRING, result_);
    return result_;
  }

  // (PLUS STRING_LITERAL)*
  private static boolean string_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!string_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "string_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // PLUS STRING_LITERAL
  private static boolean string_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_PLUS, YANG_STRING_LITERAL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (length_stmt | pattern_stmt )*
  public static boolean string_restrictions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_restrictions")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<string restrictions>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!string_restrictions_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "string_restrictions", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_STRING_RESTRICTIONS, true, false, null);
    return true;
  }

  // length_stmt | pattern_stmt
  private static boolean string_restrictions_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_restrictions_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = length_stmt(builder_, level_ + 1);
    if (!result_) result_ = pattern_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (yang_version_stmt | belongs_to_stmt)+
  public static boolean submodule_header_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "submodule_header_stmts")) return false;
    if (!nextTokenIs(builder_, "<submodule header stmts>", YANG_BELONGS_TO_KEYWORD, YANG_YANG_VERSION_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<submodule header stmts>");
    result_ = submodule_header_stmts_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!submodule_header_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "submodule_header_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, YANG_SUBMODULE_HEADER_STMTS, result_, false, null);
    return result_;
  }

  // yang_version_stmt | belongs_to_stmt
  private static boolean submodule_header_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "submodule_header_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = yang_version_stmt(builder_, level_ + 1);
    if (!result_) result_ = belongs_to_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // SUBMODULE_KEYWORD string LEFT_BRACE  submodule_header_stmts linkage_stmts meta_stmts revision_stmts body_stmts RIGHT_BRACE
  public static boolean submodule_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "submodule_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_SUBMODULE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SUBMODULE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && submodule_header_stmts(builder_, level_ + 1);
    result_ = result_ && linkage_stmts(builder_, level_ + 1);
    result_ = result_ && meta_stmts(builder_, level_ + 1);
    result_ = result_ && revision_stmts(builder_, level_ + 1);
    result_ = result_ && body_stmts(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_SUBMODULE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // (identifier_stmt)* (numerical_restrictions | decimal64_specification | string_restrictions | enum_specification | leafref_specification | identityref_specification | instance_identifier_specification | bits_specification | union_specification) (identifier_stmt)*
  public static boolean type_body_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_body_stmts")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type body stmts>");
    result_ = type_body_stmts_0(builder_, level_ + 1);
    result_ = result_ && type_body_stmts_1(builder_, level_ + 1);
    result_ = result_ && type_body_stmts_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YANG_TYPE_BODY_STMTS, result_, false, null);
    return result_;
  }

  // (identifier_stmt)*
  private static boolean type_body_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_body_stmts_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!type_body_stmts_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_body_stmts_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (identifier_stmt)
  private static boolean type_body_stmts_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_body_stmts_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // numerical_restrictions | decimal64_specification | string_restrictions | enum_specification | leafref_specification | identityref_specification | instance_identifier_specification | bits_specification | union_specification
  private static boolean type_body_stmts_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_body_stmts_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = numerical_restrictions(builder_, level_ + 1);
    if (!result_) result_ = decimal64_specification(builder_, level_ + 1);
    if (!result_) result_ = string_restrictions(builder_, level_ + 1);
    if (!result_) result_ = enum_specification(builder_, level_ + 1);
    if (!result_) result_ = leafref_specification(builder_, level_ + 1);
    if (!result_) result_ = identityref_specification(builder_, level_ + 1);
    if (!result_) result_ = instance_identifier_specification(builder_, level_ + 1);
    if (!result_) result_ = bits_specification(builder_, level_ + 1);
    if (!result_) result_ = union_specification(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt)*
  private static boolean type_body_stmts_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_body_stmts_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!type_body_stmts_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_body_stmts_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (identifier_stmt)
  private static boolean type_body_stmts_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_body_stmts_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TYPE_KEYWORD string (SEMICOLON | (LEFT_BRACE  type_body_stmts RIGHT_BRACE))
  public static boolean type_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_TYPE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_TYPE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && type_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_TYPE_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  type_body_stmts RIGHT_BRACE)
  private static boolean type_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = type_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  type_body_stmts RIGHT_BRACE
  private static boolean type_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && type_body_stmts(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TYPEDEF_KEYWORD string LEFT_BRACE  (identifier_stmt | type_stmt | units_stmt | default_stmt | status_stmt | description_stmt | reference_stmt )+ RIGHT_BRACE
  public static boolean typedef_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedef_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_TYPEDEF_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_TYPEDEF_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && typedef_stmt_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_TYPEDEF_STMT, result_);
    return result_;
  }

  // (identifier_stmt | type_stmt | units_stmt | default_stmt | status_stmt | description_stmt | reference_stmt )+
  private static boolean typedef_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedef_stmt_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = typedef_stmt_3_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!typedef_stmt_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "typedef_stmt_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier_stmt | type_stmt | units_stmt | default_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean typedef_stmt_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedef_stmt_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = type_stmt(builder_, level_ + 1);
    if (!result_) result_ = units_stmt(builder_, level_ + 1);
    if (!result_) result_ = default_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // type_stmt (identifier_stmt | type_stmt )+
  public static boolean union_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "union_specification")) return false;
    if (!nextTokenIs(builder_, YANG_TYPE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = type_stmt(builder_, level_ + 1);
    result_ = result_ && union_specification_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_UNION_SPECIFICATION, result_);
    return result_;
  }

  // (identifier_stmt | type_stmt )+
  private static boolean union_specification_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "union_specification_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = union_specification_1_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!union_specification_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "union_specification_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier_stmt | type_stmt
  private static boolean union_specification_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "union_specification_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = type_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // UNIQUE_KEYWORD string stmtend
  public static boolean unique_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unique_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_UNIQUE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_UNIQUE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_UNIQUE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // UNITS_KEYWORD string stmtend
  public static boolean units_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "units_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_UNITS_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_UNITS_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_UNITS_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // (YIN_ELEMENT_KEYWORD | YANG_VERSION_KEYWORD | WHEN_KEYWORD | VALUE_KEYWORD | USES_KEYWORD | UNITS_KEYWORD | UNIQUE_KEYWORD |
  //                     TYPEDEF_KEYWORD | TYPE_KEYWORD | SUBMODULE_KEYWORD | RPC_KEYWORD | REVISION_DATE_KEYWORD | REVISION_KEYWORD |
  //                     REQUIRE_INSTANCE_KEYWORD | REFINE_KEYWORD | RANGE_KEYWORD | PRESENCE_KEYWORD | PREFIX_KEYWORD |
  //                     POSITION_KEYWORD | PATTERN_KEYWORD | PATH_KEYWORD | OUTPUT_KEYWORD | ORGANIZATION_KEYWORD|  ORDERED_BY_KEYWORD | NOTIFICATION_KEYWORD|
  //                     NAMESPACE_KEYWORD | MUST_KEYWORD | MODULE_KEYWORD | MIN_ELEMENTS_KEYWORD | MAX_ELEMENTS_KEYWORD | MANDATORY_KEYWORD | LIST_KEYWORD |
  //                     LENGTH_KEYWORD | LEAF_LIST_KEYWORD | LEAF_KEYWORD | KEY_KEYWORD | INPUT_KEYWORD | INCLUDE_KEYWORD | IMPORT_KEYWORD | IF_FEATURE_KEYWORD |
  //                     IDENTITY_KEYWORD | GROUPING_KEYWORD | FRACTION_DIGITS_KEYWORD | FEATURE_KEYWORD | DEVIATE_KEYWORD | DEVIATION_KEYWORD | EXTENSION_KEYWORD |
  //                     ERROR_MESSAGE_KEYWORD | ERROR_APP_TAG_KEYWORD | ENUM_KEYWORD | DEFAULT_KEYWORD | CONTAINER_KEYWORD | CONTACT_KEYWORD |
  //                     CONFIG_KEYWORD | CHOICE_KEYWORD |  CASE_KEYWORD | BIT_KEYWORD | BELONGS_TO_KEYWORD | BASE_KEYWORD | AUGMENT_KEYWORD |
  //                     ANYXML_KEYWORD | IDENTIFIER) string? (SEMICOLON | (LEFT_BRACE unknown_statement2* RIGHT_BRACE))
  public static boolean unknown_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<unknown statement>");
    result_ = unknown_statement_0(builder_, level_ + 1);
    result_ = result_ && unknown_statement_1(builder_, level_ + 1);
    result_ = result_ && unknown_statement_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YANG_UNKNOWN_STATEMENT, result_, false, null);
    return result_;
  }

  // YIN_ELEMENT_KEYWORD | YANG_VERSION_KEYWORD | WHEN_KEYWORD | VALUE_KEYWORD | USES_KEYWORD | UNITS_KEYWORD | UNIQUE_KEYWORD |
  //                     TYPEDEF_KEYWORD | TYPE_KEYWORD | SUBMODULE_KEYWORD | RPC_KEYWORD | REVISION_DATE_KEYWORD | REVISION_KEYWORD |
  //                     REQUIRE_INSTANCE_KEYWORD | REFINE_KEYWORD | RANGE_KEYWORD | PRESENCE_KEYWORD | PREFIX_KEYWORD |
  //                     POSITION_KEYWORD | PATTERN_KEYWORD | PATH_KEYWORD | OUTPUT_KEYWORD | ORGANIZATION_KEYWORD|  ORDERED_BY_KEYWORD | NOTIFICATION_KEYWORD|
  //                     NAMESPACE_KEYWORD | MUST_KEYWORD | MODULE_KEYWORD | MIN_ELEMENTS_KEYWORD | MAX_ELEMENTS_KEYWORD | MANDATORY_KEYWORD | LIST_KEYWORD |
  //                     LENGTH_KEYWORD | LEAF_LIST_KEYWORD | LEAF_KEYWORD | KEY_KEYWORD | INPUT_KEYWORD | INCLUDE_KEYWORD | IMPORT_KEYWORD | IF_FEATURE_KEYWORD |
  //                     IDENTITY_KEYWORD | GROUPING_KEYWORD | FRACTION_DIGITS_KEYWORD | FEATURE_KEYWORD | DEVIATE_KEYWORD | DEVIATION_KEYWORD | EXTENSION_KEYWORD |
  //                     ERROR_MESSAGE_KEYWORD | ERROR_APP_TAG_KEYWORD | ENUM_KEYWORD | DEFAULT_KEYWORD | CONTAINER_KEYWORD | CONTACT_KEYWORD |
  //                     CONFIG_KEYWORD | CHOICE_KEYWORD |  CASE_KEYWORD | BIT_KEYWORD | BELONGS_TO_KEYWORD | BASE_KEYWORD | AUGMENT_KEYWORD |
  //                     ANYXML_KEYWORD | IDENTIFIER
  private static boolean unknown_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_YIN_ELEMENT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_YANG_VERSION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_WHEN_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_VALUE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_USES_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_UNITS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_UNIQUE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_TYPEDEF_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_TYPE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_SUBMODULE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_RPC_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REVISION_DATE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REVISION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REQUIRE_INSTANCE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REFINE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_RANGE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_PRESENCE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_PREFIX_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_POSITION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_PATTERN_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_PATH_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_OUTPUT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ORGANIZATION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ORDERED_BY_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_NOTIFICATION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_NAMESPACE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MUST_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MODULE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MIN_ELEMENTS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MAX_ELEMENTS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MANDATORY_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_LIST_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_LENGTH_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_LEAF_LIST_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_LEAF_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_KEY_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_INPUT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_INCLUDE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_IMPORT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_IF_FEATURE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_IDENTITY_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_GROUPING_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_FRACTION_DIGITS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_FEATURE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_DEVIATE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_DEVIATION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_EXTENSION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ERROR_MESSAGE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ERROR_APP_TAG_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ENUM_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_DEFAULT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CONTAINER_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CONTACT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CONFIG_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CHOICE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CASE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_BIT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_BELONGS_TO_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_BASE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_AUGMENT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ANYXML_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // string?
  private static boolean unknown_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement_1")) return false;
    string(builder_, level_ + 1);
    return true;
  }

  // SEMICOLON | (LEFT_BRACE unknown_statement2* RIGHT_BRACE)
  private static boolean unknown_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = unknown_statement_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE unknown_statement2* RIGHT_BRACE
  private static boolean unknown_statement_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && unknown_statement_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // unknown_statement2*
  private static boolean unknown_statement_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!unknown_statement2(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "unknown_statement_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // (YANG_VERSION_KEYWORD | WHEN_KEYWORD | VALUE_KEYWORD | USES_KEYWORD | UNITS_KEYWORD | UNIQUE_KEYWORD |
  //                     TYPEDEF_KEYWORD | TYPE_KEYWORD | SUBMODULE_KEYWORD | STATUS_KEYWORD | RPC_KEYWORD | REVISION_DATE_KEYWORD | REVISION_KEYWORD |
  //                     REQUIRE_INSTANCE_KEYWORD | REFINE_KEYWORD | REFERENCE_KEYWORD | RANGE_KEYWORD | PRESENCE_KEYWORD | PREFIX_KEYWORD |
  //                     POSITION_KEYWORD | PATTERN_KEYWORD | PATH_KEYWORD | OUTPUT_KEYWORD | ORGANIZATION_KEYWORD|  ORDERED_BY_KEYWORD | NOTIFICATION_KEYWORD|
  //                     NAMESPACE_KEYWORD | MUST_KEYWORD | MODULE_KEYWORD | MIN_ELEMENTS_KEYWORD | MAX_ELEMENTS_KEYWORD | MANDATORY_KEYWORD | LIST_KEYWORD |
  //                     LENGTH_KEYWORD | LEAF_LIST_KEYWORD | LEAF_KEYWORD | KEY_KEYWORD | INPUT_KEYWORD | INCLUDE_KEYWORD | IMPORT_KEYWORD | IF_FEATURE_KEYWORD |
  //                     IDENTITY_KEYWORD | GROUPING_KEYWORD | FRACTION_DIGITS_KEYWORD | FEATURE_KEYWORD | DEVIATE_KEYWORD | DEVIATION_KEYWORD | EXTENSION_KEYWORD |
  //                     ERROR_MESSAGE_KEYWORD | ERROR_APP_TAG_KEYWORD | ENUM_KEYWORD | DESCRIPTION_KEYWORD | DEFAULT_KEYWORD | CONTAINER_KEYWORD | CONTACT_KEYWORD |
  //                     CONFIG_KEYWORD | CHOICE_KEYWORD |  CASE_KEYWORD | BIT_KEYWORD | BELONGS_TO_KEYWORD | BASE_KEYWORD | AUGMENT_KEYWORD | ARGUMENT_KEYWORD |
  //                     ANYXML_KEYWORD | IDENTIFIER) string? (SEMICOLON | (LEFT_BRACE unknown_statement3* RIGHT_BRACE))
  public static boolean unknown_statement2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<unknown statement 2>");
    result_ = unknown_statement2_0(builder_, level_ + 1);
    result_ = result_ && unknown_statement2_1(builder_, level_ + 1);
    result_ = result_ && unknown_statement2_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YANG_UNKNOWN_STATEMENT_2, result_, false, null);
    return result_;
  }

  // YANG_VERSION_KEYWORD | WHEN_KEYWORD | VALUE_KEYWORD | USES_KEYWORD | UNITS_KEYWORD | UNIQUE_KEYWORD |
  //                     TYPEDEF_KEYWORD | TYPE_KEYWORD | SUBMODULE_KEYWORD | STATUS_KEYWORD | RPC_KEYWORD | REVISION_DATE_KEYWORD | REVISION_KEYWORD |
  //                     REQUIRE_INSTANCE_KEYWORD | REFINE_KEYWORD | REFERENCE_KEYWORD | RANGE_KEYWORD | PRESENCE_KEYWORD | PREFIX_KEYWORD |
  //                     POSITION_KEYWORD | PATTERN_KEYWORD | PATH_KEYWORD | OUTPUT_KEYWORD | ORGANIZATION_KEYWORD|  ORDERED_BY_KEYWORD | NOTIFICATION_KEYWORD|
  //                     NAMESPACE_KEYWORD | MUST_KEYWORD | MODULE_KEYWORD | MIN_ELEMENTS_KEYWORD | MAX_ELEMENTS_KEYWORD | MANDATORY_KEYWORD | LIST_KEYWORD |
  //                     LENGTH_KEYWORD | LEAF_LIST_KEYWORD | LEAF_KEYWORD | KEY_KEYWORD | INPUT_KEYWORD | INCLUDE_KEYWORD | IMPORT_KEYWORD | IF_FEATURE_KEYWORD |
  //                     IDENTITY_KEYWORD | GROUPING_KEYWORD | FRACTION_DIGITS_KEYWORD | FEATURE_KEYWORD | DEVIATE_KEYWORD | DEVIATION_KEYWORD | EXTENSION_KEYWORD |
  //                     ERROR_MESSAGE_KEYWORD | ERROR_APP_TAG_KEYWORD | ENUM_KEYWORD | DESCRIPTION_KEYWORD | DEFAULT_KEYWORD | CONTAINER_KEYWORD | CONTACT_KEYWORD |
  //                     CONFIG_KEYWORD | CHOICE_KEYWORD |  CASE_KEYWORD | BIT_KEYWORD | BELONGS_TO_KEYWORD | BASE_KEYWORD | AUGMENT_KEYWORD | ARGUMENT_KEYWORD |
  //                     ANYXML_KEYWORD | IDENTIFIER
  private static boolean unknown_statement2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_YANG_VERSION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_WHEN_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_VALUE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_USES_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_UNITS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_UNIQUE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_TYPEDEF_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_TYPE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_SUBMODULE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_STATUS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_RPC_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REVISION_DATE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REVISION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REQUIRE_INSTANCE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REFINE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REFERENCE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_RANGE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_PRESENCE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_PREFIX_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_POSITION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_PATTERN_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_PATH_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_OUTPUT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ORGANIZATION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ORDERED_BY_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_NOTIFICATION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_NAMESPACE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MUST_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MODULE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MIN_ELEMENTS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MAX_ELEMENTS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MANDATORY_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_LIST_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_LENGTH_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_LEAF_LIST_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_LEAF_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_KEY_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_INPUT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_INCLUDE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_IMPORT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_IF_FEATURE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_IDENTITY_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_GROUPING_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_FRACTION_DIGITS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_FEATURE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_DEVIATE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_DEVIATION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_EXTENSION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ERROR_MESSAGE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ERROR_APP_TAG_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ENUM_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_DESCRIPTION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_DEFAULT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CONTAINER_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CONTACT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CONFIG_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CHOICE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CASE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_BIT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_BELONGS_TO_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_BASE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_AUGMENT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ARGUMENT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ANYXML_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // string?
  private static boolean unknown_statement2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement2_1")) return false;
    string(builder_, level_ + 1);
    return true;
  }

  // SEMICOLON | (LEFT_BRACE unknown_statement3* RIGHT_BRACE)
  private static boolean unknown_statement2_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement2_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = unknown_statement2_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE unknown_statement3* RIGHT_BRACE
  private static boolean unknown_statement2_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement2_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && unknown_statement2_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // unknown_statement3*
  private static boolean unknown_statement2_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement2_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!unknown_statement3(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "unknown_statement2_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // (YIN_ELEMENT_KEYWORD | YANG_VERSION_KEYWORD | WHEN_KEYWORD | VALUE_KEYWORD | USES_KEYWORD | UNITS_KEYWORD | UNIQUE_KEYWORD |
  //                     TYPEDEF_KEYWORD | TYPE_KEYWORD | SUBMODULE_KEYWORD | STATUS_KEYWORD | RPC_KEYWORD | REVISION_DATE_KEYWORD | REVISION_KEYWORD |
  //                     REQUIRE_INSTANCE_KEYWORD | REFINE_KEYWORD | REFERENCE_KEYWORD | RANGE_KEYWORD | PRESENCE_KEYWORD | PREFIX_KEYWORD |
  //                     POSITION_KEYWORD | PATTERN_KEYWORD | PATH_KEYWORD | OUTPUT_KEYWORD | ORGANIZATION_KEYWORD|  ORDERED_BY_KEYWORD | NOTIFICATION_KEYWORD|
  //                     NAMESPACE_KEYWORD | MUST_KEYWORD | MODULE_KEYWORD | MIN_ELEMENTS_KEYWORD | MAX_ELEMENTS_KEYWORD | MANDATORY_KEYWORD | LIST_KEYWORD |
  //                     LENGTH_KEYWORD | LEAF_LIST_KEYWORD | LEAF_KEYWORD | KEY_KEYWORD | INPUT_KEYWORD | INCLUDE_KEYWORD | IMPORT_KEYWORD | IF_FEATURE_KEYWORD |
  //                     IDENTITY_KEYWORD | GROUPING_KEYWORD | FRACTION_DIGITS_KEYWORD | FEATURE_KEYWORD | DEVIATE_KEYWORD | DEVIATION_KEYWORD | EXTENSION_KEYWORD |
  //                     ERROR_MESSAGE_KEYWORD | ERROR_APP_TAG_KEYWORD | ENUM_KEYWORD | DESCRIPTION_KEYWORD | DEFAULT_KEYWORD | CONTAINER_KEYWORD | CONTACT_KEYWORD |
  //                     CONFIG_KEYWORD | CHOICE_KEYWORD |  CASE_KEYWORD | BIT_KEYWORD | BELONGS_TO_KEYWORD | BASE_KEYWORD | AUGMENT_KEYWORD | ARGUMENT_KEYWORD |
  //                     ANYXML_KEYWORD | IDENTIFIER) string? (SEMICOLON | (LEFT_BRACE unknown_statement3* RIGHT_BRACE))
  public static boolean unknown_statement3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<unknown statement 3>");
    result_ = unknown_statement3_0(builder_, level_ + 1);
    result_ = result_ && unknown_statement3_1(builder_, level_ + 1);
    result_ = result_ && unknown_statement3_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YANG_UNKNOWN_STATEMENT_3, result_, false, null);
    return result_;
  }

  // YIN_ELEMENT_KEYWORD | YANG_VERSION_KEYWORD | WHEN_KEYWORD | VALUE_KEYWORD | USES_KEYWORD | UNITS_KEYWORD | UNIQUE_KEYWORD |
  //                     TYPEDEF_KEYWORD | TYPE_KEYWORD | SUBMODULE_KEYWORD | STATUS_KEYWORD | RPC_KEYWORD | REVISION_DATE_KEYWORD | REVISION_KEYWORD |
  //                     REQUIRE_INSTANCE_KEYWORD | REFINE_KEYWORD | REFERENCE_KEYWORD | RANGE_KEYWORD | PRESENCE_KEYWORD | PREFIX_KEYWORD |
  //                     POSITION_KEYWORD | PATTERN_KEYWORD | PATH_KEYWORD | OUTPUT_KEYWORD | ORGANIZATION_KEYWORD|  ORDERED_BY_KEYWORD | NOTIFICATION_KEYWORD|
  //                     NAMESPACE_KEYWORD | MUST_KEYWORD | MODULE_KEYWORD | MIN_ELEMENTS_KEYWORD | MAX_ELEMENTS_KEYWORD | MANDATORY_KEYWORD | LIST_KEYWORD |
  //                     LENGTH_KEYWORD | LEAF_LIST_KEYWORD | LEAF_KEYWORD | KEY_KEYWORD | INPUT_KEYWORD | INCLUDE_KEYWORD | IMPORT_KEYWORD | IF_FEATURE_KEYWORD |
  //                     IDENTITY_KEYWORD | GROUPING_KEYWORD | FRACTION_DIGITS_KEYWORD | FEATURE_KEYWORD | DEVIATE_KEYWORD | DEVIATION_KEYWORD | EXTENSION_KEYWORD |
  //                     ERROR_MESSAGE_KEYWORD | ERROR_APP_TAG_KEYWORD | ENUM_KEYWORD | DESCRIPTION_KEYWORD | DEFAULT_KEYWORD | CONTAINER_KEYWORD | CONTACT_KEYWORD |
  //                     CONFIG_KEYWORD | CHOICE_KEYWORD |  CASE_KEYWORD | BIT_KEYWORD | BELONGS_TO_KEYWORD | BASE_KEYWORD | AUGMENT_KEYWORD | ARGUMENT_KEYWORD |
  //                     ANYXML_KEYWORD | IDENTIFIER
  private static boolean unknown_statement3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_YIN_ELEMENT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_YANG_VERSION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_WHEN_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_VALUE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_USES_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_UNITS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_UNIQUE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_TYPEDEF_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_TYPE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_SUBMODULE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_STATUS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_RPC_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REVISION_DATE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REVISION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REQUIRE_INSTANCE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REFINE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_REFERENCE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_RANGE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_PRESENCE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_PREFIX_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_POSITION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_PATTERN_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_PATH_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_OUTPUT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ORGANIZATION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ORDERED_BY_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_NOTIFICATION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_NAMESPACE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MUST_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MODULE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MIN_ELEMENTS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MAX_ELEMENTS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_MANDATORY_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_LIST_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_LENGTH_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_LEAF_LIST_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_LEAF_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_KEY_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_INPUT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_INCLUDE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_IMPORT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_IF_FEATURE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_IDENTITY_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_GROUPING_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_FRACTION_DIGITS_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_FEATURE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_DEVIATE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_DEVIATION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_EXTENSION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ERROR_MESSAGE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ERROR_APP_TAG_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ENUM_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_DESCRIPTION_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_DEFAULT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CONTAINER_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CONTACT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CONFIG_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CHOICE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_CASE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_BIT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_BELONGS_TO_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_BASE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_AUGMENT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ARGUMENT_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_ANYXML_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, YANG_IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // string?
  private static boolean unknown_statement3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement3_1")) return false;
    string(builder_, level_ + 1);
    return true;
  }

  // SEMICOLON | (LEFT_BRACE unknown_statement3* RIGHT_BRACE)
  private static boolean unknown_statement3_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement3_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = unknown_statement3_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE unknown_statement3* RIGHT_BRACE
  private static boolean unknown_statement3_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement3_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && unknown_statement3_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // unknown_statement3*
  private static boolean unknown_statement3_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unknown_statement3_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!unknown_statement3(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "unknown_statement3_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // AUGMENT_KEYWORD string LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmt | case_stmt)+ RIGHT_BRACE
  public static boolean uses_augment_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_AUGMENT_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_AUGMENT_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && uses_augment_stmt_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_USES_AUGMENT_STMT, result_);
    return result_;
  }

  // (identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmt | case_stmt)+
  private static boolean uses_augment_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = uses_augment_stmt_3_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!uses_augment_stmt_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "uses_augment_stmt_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | data_def_stmt | case_stmt
  private static boolean uses_augment_stmt_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = when_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    if (!result_) result_ = data_def_stmt(builder_, level_ + 1);
    if (!result_) result_ = case_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // USES_KEYWORD string (SEMICOLON | (LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | refine_stmt | uses_augment_stmt )* RIGHT_BRACE))
  public static boolean uses_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_USES_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_USES_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && uses_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_USES_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | refine_stmt | uses_augment_stmt )* RIGHT_BRACE)
  private static boolean uses_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = uses_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  (identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | refine_stmt | uses_augment_stmt )* RIGHT_BRACE
  private static boolean uses_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && uses_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | refine_stmt | uses_augment_stmt )*
  private static boolean uses_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!uses_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "uses_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |when_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt | refine_stmt | uses_augment_stmt
  private static boolean uses_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = when_stmt(builder_, level_ + 1);
    if (!result_) result_ = if_feature_stmt(builder_, level_ + 1);
    if (!result_) result_ = status_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    if (!result_) result_ = refine_stmt(builder_, level_ + 1);
    if (!result_) result_ = uses_augment_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // VALUE_KEYWORD string stmtend
  public static boolean value_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "value_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_VALUE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_VALUE_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_VALUE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // WHEN_KEYWORD string (SEMICOLON | (LEFT_BRACE (identifier_stmt |description_stmt | reference_stmt )* RIGHT_BRACE))
  public static boolean when_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_WHEN_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_WHEN_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && when_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_WHEN_STMT, result_);
    return result_;
  }

  // SEMICOLON | (LEFT_BRACE (identifier_stmt |description_stmt | reference_stmt )* RIGHT_BRACE)
  private static boolean when_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = when_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE (identifier_stmt |description_stmt | reference_stmt )* RIGHT_BRACE
  private static boolean when_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && when_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier_stmt |description_stmt | reference_stmt )*
  private static boolean when_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_stmt_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!when_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "when_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // identifier_stmt |description_stmt | reference_stmt
  private static boolean when_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_stmt(builder_, level_ + 1);
    if (!result_) result_ = description_stmt(builder_, level_ + 1);
    if (!result_) result_ = reference_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // module_stmt | submodule_stmt
  static boolean yang(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yang")) return false;
    if (!nextTokenIs(builder_, "", YANG_MODULE_KEYWORD, YANG_SUBMODULE_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = module_stmt(builder_, level_ + 1);
    if (!result_) result_ = submodule_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // YANG_VERSION_KEYWORD string stmtend
  public static boolean yang_version_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yang_version_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_YANG_VERSION_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_YANG_VERSION_KEYWORD);
    result_ = result_ && string(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_YANG_VERSION_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // string
  public static boolean yin_element_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yin_element_arg")) return false;
    if (!nextTokenIs(builder_, YANG_STRING_LITERAL)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = string(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_YIN_ELEMENT_ARG, result_);
    return result_;
  }

  /* ********************************************************** */
  // YIN_ELEMENT_KEYWORD yin_element_arg stmtend
  public static boolean yin_element_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yin_element_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_YIN_ELEMENT_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_YIN_ELEMENT_KEYWORD);
    result_ = result_ && yin_element_arg(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_YIN_ELEMENT_STMT, result_);
    return result_;
  }

}
