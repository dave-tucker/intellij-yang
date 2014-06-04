// This is a generated file. Not intended for manual editing.
package org.intellij.yang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static org.intellij.yang.psi.YangTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class YangParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("org.intellij.yang.parser.YangParser");

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
    else if (root_ == YANG_CASE_STMT) {
      result_ = case_stmt(builder_, 0);
    }
    else if (root_ == YANG_CHOICE_STMT) {
      result_ = choice_stmt(builder_, 0);
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
    else if (root_ == YANG_KEY_STMT) {
      result_ = key_stmt(builder_, 0);
    }
    else if (root_ == YANG_LEAF_LIST_STMT) {
      result_ = leaf_list_stmt(builder_, 0);
    }
    else if (root_ == YANG_LEAF_STMT) {
      result_ = leaf_stmt(builder_, 0);
    }
    else if (root_ == YANG_LENGTH_STMT) {
      result_ = length_stmt(builder_, 0);
    }
    else if (root_ == YANG_LIST_STMT) {
      result_ = list_stmt(builder_, 0);
    }
    else if (root_ == YANG_MANDATORY_STMT) {
      result_ = mandatory_stmt(builder_, 0);
    }
    else if (root_ == YANG_MAX_ELEMENTS_STMT) {
      result_ = max_elements_stmt(builder_, 0);
    }
    else if (root_ == YANG_MIN_ELEMENTS_STMT) {
      result_ = min_elements_stmt(builder_, 0);
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
    else if (root_ == YANG_REFINE_STMT) {
      result_ = refine_stmt(builder_, 0);
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
    else if (root_ == YANG_RPC_STMT) {
      result_ = rpc_stmt(builder_, 0);
    }
    else if (root_ == YANG_STATUS_STMT) {
      result_ = status_stmt(builder_, 0);
    }
    else if (root_ == YANG_STMTEND) {
      result_ = stmtend(builder_, 0);
    }
    else if (root_ == YANG_SUBMODULE_STMT) {
      result_ = submodule_stmt(builder_, 0);
    }
    else if (root_ == YANG_TYPE_STMT) {
      result_ = type_stmt(builder_, 0);
    }
    else if (root_ == YANG_TYPEDEF_STMT) {
      result_ = typedef_stmt(builder_, 0);
    }
    else if (root_ == YANG_UNIQUE_STMT) {
      result_ = unique_stmt(builder_, 0);
    }
    else if (root_ == YANG_UNITS_STMT) {
      result_ = units_stmt(builder_, 0);
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
  // [length_stmt] (pattern_stmt)+
  static boolean STRING_restrictions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "STRING_restrictions")) return false;
    if (!nextTokenIs(builder_, "", YANG_LENGTH, YANG_PATTERN)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = STRING_restrictions_0(builder_, level_ + 1);
    result_ = result_ && STRING_restrictions_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [length_stmt]
  private static boolean STRING_restrictions_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "STRING_restrictions_0")) return false;
    length_stmt(builder_, level_ + 1);
    return true;
  }

  // (pattern_stmt)+
  private static boolean STRING_restrictions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "STRING_restrictions_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = STRING_restrictions_1_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!STRING_restrictions_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "STRING_restrictions_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (pattern_stmt)
  private static boolean STRING_restrictions_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "STRING_restrictions_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = pattern_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ANYXML STRING (SEMICOLON | LEFT_BRACE [when_stmt] (if_feature_stmt)+ (must_stmt)+ [config_stmt] [mandatory_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE)
  public static boolean anyxml_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ANYXML)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_ANYXML, YANG_STRING);
    result_ = result_ && anyxml_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ANYXML_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [when_stmt] (if_feature_stmt)+ (must_stmt)+ [config_stmt] [mandatory_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean anyxml_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = anyxml_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [when_stmt] (if_feature_stmt)+ (must_stmt)+ [config_stmt] [mandatory_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean anyxml_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && anyxml_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && anyxml_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && anyxml_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && anyxml_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && anyxml_stmt_2_1_5(builder_, level_ + 1);
    result_ = result_ && anyxml_stmt_2_1_6(builder_, level_ + 1);
    result_ = result_ && anyxml_stmt_2_1_7(builder_, level_ + 1);
    result_ = result_ && anyxml_stmt_2_1_8(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [when_stmt]
  private static boolean anyxml_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1_1")) return false;
    when_stmt(builder_, level_ + 1);
    return true;
  }

  // (if_feature_stmt)+
  private static boolean anyxml_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = anyxml_stmt_2_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!anyxml_stmt_2_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "anyxml_stmt_2_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)
  private static boolean anyxml_stmt_2_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)+
  private static boolean anyxml_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = anyxml_stmt_2_1_3_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!anyxml_stmt_2_1_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "anyxml_stmt_2_1_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)
  private static boolean anyxml_stmt_2_1_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = must_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [config_stmt]
  private static boolean anyxml_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1_4")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [mandatory_stmt]
  private static boolean anyxml_stmt_2_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1_5")) return false;
    mandatory_stmt(builder_, level_ + 1);
    return true;
  }

  // [status_stmt]
  private static boolean anyxml_stmt_2_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1_6")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean anyxml_stmt_2_1_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1_7")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean anyxml_stmt_2_1_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyxml_stmt_2_1_8")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ARGUMENT STRING ( SEMICOLON | LEFT_BRACE [yin_element_arg] RIGHT_BRACE )
  public static boolean argument_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ARGUMENT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_ARGUMENT, YANG_STRING);
    result_ = result_ && argument_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ARGUMENT_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [yin_element_arg] RIGHT_BRACE
  private static boolean argument_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = argument_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [yin_element_arg] RIGHT_BRACE
  private static boolean argument_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && argument_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [yin_element_arg]
  private static boolean argument_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_stmt_2_1_1")) return false;
    yin_element_arg(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // AUGMENT STRING LEFT_BRACE [when_stmt] (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] ((data_def_stmt)+ | (case_stmt))* RIGHT_BRACE
  public static boolean augment_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_AUGMENT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_AUGMENT, YANG_STRING, YANG_LEFT_BRACE);
    result_ = result_ && augment_stmt_3(builder_, level_ + 1);
    result_ = result_ && augment_stmt_4(builder_, level_ + 1);
    result_ = result_ && augment_stmt_5(builder_, level_ + 1);
    result_ = result_ && augment_stmt_6(builder_, level_ + 1);
    result_ = result_ && augment_stmt_7(builder_, level_ + 1);
    result_ = result_ && augment_stmt_8(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_AUGMENT_STMT, result_);
    return result_;
  }

  // [when_stmt]
  private static boolean augment_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_3")) return false;
    when_stmt(builder_, level_ + 1);
    return true;
  }

  // (if_feature_stmt)+
  private static boolean augment_stmt_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = augment_stmt_4_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!augment_stmt_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "augment_stmt_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)
  private static boolean augment_stmt_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [status_stmt]
  private static boolean augment_stmt_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_5")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean augment_stmt_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_6")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean augment_stmt_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_7")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  // ((data_def_stmt)+ | (case_stmt))*
  private static boolean augment_stmt_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_8")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!augment_stmt_8_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "augment_stmt_8", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (data_def_stmt)+ | (case_stmt)
  private static boolean augment_stmt_8_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_8_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = augment_stmt_8_0_0(builder_, level_ + 1);
    if (!result_) result_ = augment_stmt_8_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)+
  private static boolean augment_stmt_8_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_8_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = augment_stmt_8_0_0_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!augment_stmt_8_0_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "augment_stmt_8_0_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)
  private static boolean augment_stmt_8_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_8_0_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (case_stmt)
  private static boolean augment_stmt_8_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "augment_stmt_8_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = case_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // BASE STRING stmtend
  public static boolean base_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "base_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_BASE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_BASE, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_BASE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // BELONGS_TO STRING LEFT_BRACE prefix_stmt RIGHT_BRACE
  public static boolean belongs_to_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "belongs_to_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_BELONGS_TO)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_BELONGS_TO, YANG_STRING, YANG_LEFT_BRACE);
    result_ = result_ && prefix_stmt(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_BELONGS_TO_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // [length_stmt]
  static boolean binary_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binary_specification")) return false;
    length_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // BIT STRING (SEMICOLON | LEFT_BRACE [position_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE)
  public static boolean bit_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_BIT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_BIT, YANG_STRING);
    result_ = result_ && bit_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_BIT_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [position_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean bit_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = bit_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [position_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean bit_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && bit_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && bit_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && bit_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && bit_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [position_stmt]
  private static boolean bit_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_stmt_2_1_1")) return false;
    position_stmt(builder_, level_ + 1);
    return true;
  }

  // [status_stmt]
  private static boolean bit_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_stmt_2_1_2")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean bit_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_stmt_2_1_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean bit_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_stmt_2_1_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (bit_stmt)*
  static boolean bits_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bits_specification")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!bits_specification_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "bits_specification", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (bit_stmt)
  private static boolean bits_specification_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bits_specification_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = bit_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (extension_stmt | feature_stmt | identity_stmt | typedef_stmt | grouping_stmt | data_def_stmt | augment_stmt | rpc_stmt | notification_stmt | deviation_stmt)+
  static boolean body_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_stmts")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = body_stmts_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!body_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "body_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // extension_stmt | feature_stmt | identity_stmt | typedef_stmt | grouping_stmt | data_def_stmt | augment_stmt | rpc_stmt | notification_stmt | deviation_stmt
  private static boolean body_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = extension_stmt(builder_, level_ + 1);
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
  // CASE STRING (SEMICOLON | LEFT_BRACE [when_stmt] (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] (data_def_stmt)+ RIGHT_BRACE)
  public static boolean case_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_CASE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_CASE, YANG_STRING);
    result_ = result_ && case_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_CASE_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [when_stmt] (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] (data_def_stmt)+ RIGHT_BRACE
  private static boolean case_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = case_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [when_stmt] (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] (data_def_stmt)+ RIGHT_BRACE
  private static boolean case_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && case_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && case_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && case_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && case_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && case_stmt_2_1_5(builder_, level_ + 1);
    result_ = result_ && case_stmt_2_1_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [when_stmt]
  private static boolean case_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2_1_1")) return false;
    when_stmt(builder_, level_ + 1);
    return true;
  }

  // (if_feature_stmt)+
  private static boolean case_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = case_stmt_2_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!case_stmt_2_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "case_stmt_2_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)
  private static boolean case_stmt_2_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [status_stmt]
  private static boolean case_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2_1_3")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean case_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2_1_4")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean case_stmt_2_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2_1_5")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  // (data_def_stmt)+
  private static boolean case_stmt_2_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2_1_6")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = case_stmt_2_1_6_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!case_stmt_2_1_6_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "case_stmt_2_1_6", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)
  private static boolean case_stmt_2_1_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_stmt_2_1_6_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CHOICE STRING (SEMICOLON | LEFT_BRACE [when_stmt] (if_feature_stmt)+ [default_stmt] [config_stmt] [mandatory_stmt] [status_stmt] [description_stmt] [reference_stmt] (short_case_stmt | case_stmt)+ RIGHT_BRACE)
  public static boolean choice_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_CHOICE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_CHOICE, YANG_STRING);
    result_ = result_ && choice_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_CHOICE_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [when_stmt] (if_feature_stmt)+ [default_stmt] [config_stmt] [mandatory_stmt] [status_stmt] [description_stmt] [reference_stmt] (short_case_stmt | case_stmt)+ RIGHT_BRACE
  private static boolean choice_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = choice_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [when_stmt] (if_feature_stmt)+ [default_stmt] [config_stmt] [mandatory_stmt] [status_stmt] [description_stmt] [reference_stmt] (short_case_stmt | case_stmt)+ RIGHT_BRACE
  private static boolean choice_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && choice_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && choice_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && choice_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && choice_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && choice_stmt_2_1_5(builder_, level_ + 1);
    result_ = result_ && choice_stmt_2_1_6(builder_, level_ + 1);
    result_ = result_ && choice_stmt_2_1_7(builder_, level_ + 1);
    result_ = result_ && choice_stmt_2_1_8(builder_, level_ + 1);
    result_ = result_ && choice_stmt_2_1_9(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [when_stmt]
  private static boolean choice_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_1")) return false;
    when_stmt(builder_, level_ + 1);
    return true;
  }

  // (if_feature_stmt)+
  private static boolean choice_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = choice_stmt_2_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!choice_stmt_2_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "choice_stmt_2_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)
  private static boolean choice_stmt_2_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [default_stmt]
  private static boolean choice_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_3")) return false;
    default_stmt(builder_, level_ + 1);
    return true;
  }

  // [config_stmt]
  private static boolean choice_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_4")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [mandatory_stmt]
  private static boolean choice_stmt_2_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_5")) return false;
    mandatory_stmt(builder_, level_ + 1);
    return true;
  }

  // [status_stmt]
  private static boolean choice_stmt_2_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_6")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean choice_stmt_2_1_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_7")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean choice_stmt_2_1_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_8")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  // (short_case_stmt | case_stmt)+
  private static boolean choice_stmt_2_1_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_9")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = choice_stmt_2_1_9_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!choice_stmt_2_1_9_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "choice_stmt_2_1_9", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // short_case_stmt | case_stmt
  private static boolean choice_stmt_2_1_9_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_stmt_2_1_9_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = short_case_stmt(builder_, level_ + 1);
    if (!result_) result_ = case_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONFIG STRING stmtend
  public static boolean config_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "config_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_CONFIG)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_CONFIG, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_CONFIG_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONTACT STRING stmtend
  public static boolean contact_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "contact_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_CONTACT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_CONTACT, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_CONTACT_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONTAINER STRING (SEMICOLON | LEFT_BRACE [when_stmt] (if_feature_stmt)+ (must_stmt)+ [presence_stmt] [config_stmt] [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ (data_def_stmt)+ RIGHT_BRACE)
  public static boolean container_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_CONTAINER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_CONTAINER, YANG_STRING);
    result_ = result_ && container_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_CONTAINER_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [when_stmt] (if_feature_stmt)+ (must_stmt)+ [presence_stmt] [config_stmt] [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ (data_def_stmt)+ RIGHT_BRACE
  private static boolean container_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = container_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [when_stmt] (if_feature_stmt)+ (must_stmt)+ [presence_stmt] [config_stmt] [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ (data_def_stmt)+ RIGHT_BRACE
  private static boolean container_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && container_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && container_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && container_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && container_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && container_stmt_2_1_5(builder_, level_ + 1);
    result_ = result_ && container_stmt_2_1_6(builder_, level_ + 1);
    result_ = result_ && container_stmt_2_1_7(builder_, level_ + 1);
    result_ = result_ && container_stmt_2_1_8(builder_, level_ + 1);
    result_ = result_ && container_stmt_2_1_9(builder_, level_ + 1);
    result_ = result_ && container_stmt_2_1_10(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [when_stmt]
  private static boolean container_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_1")) return false;
    when_stmt(builder_, level_ + 1);
    return true;
  }

  // (if_feature_stmt)+
  private static boolean container_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = container_stmt_2_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!container_stmt_2_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "container_stmt_2_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)
  private static boolean container_stmt_2_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)+
  private static boolean container_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = container_stmt_2_1_3_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!container_stmt_2_1_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "container_stmt_2_1_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)
  private static boolean container_stmt_2_1_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = must_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [presence_stmt]
  private static boolean container_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_4")) return false;
    presence_stmt(builder_, level_ + 1);
    return true;
  }

  // [config_stmt]
  private static boolean container_stmt_2_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_5")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [status_stmt]
  private static boolean container_stmt_2_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_6")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean container_stmt_2_1_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_7")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean container_stmt_2_1_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_8")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  // (typedef_stmt | grouping_stmt)+
  private static boolean container_stmt_2_1_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_9")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = container_stmt_2_1_9_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!container_stmt_2_1_9_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "container_stmt_2_1_9", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typedef_stmt | grouping_stmt
  private static boolean container_stmt_2_1_9_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_9_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)+
  private static boolean container_stmt_2_1_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_10")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = container_stmt_2_1_10_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!container_stmt_2_1_10_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "container_stmt_2_1_10", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)
  private static boolean container_stmt_2_1_10_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_stmt_2_1_10_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // container_stmt | leaf_stmt | leaf_list_stmt | list_stmt  | choice_stmt | anyxml_stmt | uses_stmt
  static boolean data_def_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "data_def_stmt")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = container_stmt(builder_, level_ + 1);
    if (!result_) result_ = leaf_stmt(builder_, level_ + 1);
    if (!result_) result_ = leaf_list_stmt(builder_, level_ + 1);
    if (!result_) result_ = list_stmt(builder_, level_ + 1);
    if (!result_) result_ = choice_stmt(builder_, level_ + 1);
    if (!result_) result_ = anyxml_stmt(builder_, level_ + 1);
    if (!result_) result_ = uses_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // fraction_digits_stmt [range_stmt]
  static boolean decimal64_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "decimal64_specification")) return false;
    if (!nextTokenIs(builder_, YANG_FRACTION_DIGITS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = fraction_digits_stmt(builder_, level_ + 1);
    result_ = result_ && decimal64_specification_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [range_stmt]
  private static boolean decimal64_specification_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "decimal64_specification_1")) return false;
    range_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // DEFAULT STRING stmtend
  public static boolean default_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "default_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DEFAULT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_DEFAULT, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_DEFAULT_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // DESCRIPTION STRING stmtend
  public static boolean description_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "description_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DESCRIPTION)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_DESCRIPTION, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_DESCRIPTION_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // DEVIATE ADD (SEMICOLON | LEFT_BRACE [units_stmt] (must_stmt)+ (unique_stmt)+ [default_stmt] [config_stmt] [mandatory_stmt] [min_elements_stmt] [max_elements_stmt] RIGHT_BRACE)
  public static boolean deviate_add_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DEVIATE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_DEVIATE, YANG_ADD);
    result_ = result_ && deviate_add_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_DEVIATE_ADD_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [units_stmt] (must_stmt)+ (unique_stmt)+ [default_stmt] [config_stmt] [mandatory_stmt] [min_elements_stmt] [max_elements_stmt] RIGHT_BRACE
  private static boolean deviate_add_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = deviate_add_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [units_stmt] (must_stmt)+ (unique_stmt)+ [default_stmt] [config_stmt] [mandatory_stmt] [min_elements_stmt] [max_elements_stmt] RIGHT_BRACE
  private static boolean deviate_add_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && deviate_add_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && deviate_add_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && deviate_add_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && deviate_add_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && deviate_add_stmt_2_1_5(builder_, level_ + 1);
    result_ = result_ && deviate_add_stmt_2_1_6(builder_, level_ + 1);
    result_ = result_ && deviate_add_stmt_2_1_7(builder_, level_ + 1);
    result_ = result_ && deviate_add_stmt_2_1_8(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [units_stmt]
  private static boolean deviate_add_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1_1")) return false;
    units_stmt(builder_, level_ + 1);
    return true;
  }

  // (must_stmt)+
  private static boolean deviate_add_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = deviate_add_stmt_2_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!deviate_add_stmt_2_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "deviate_add_stmt_2_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)
  private static boolean deviate_add_stmt_2_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = must_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (unique_stmt)+
  private static boolean deviate_add_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = deviate_add_stmt_2_1_3_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!deviate_add_stmt_2_1_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "deviate_add_stmt_2_1_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (unique_stmt)
  private static boolean deviate_add_stmt_2_1_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = unique_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [default_stmt]
  private static boolean deviate_add_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1_4")) return false;
    default_stmt(builder_, level_ + 1);
    return true;
  }

  // [config_stmt]
  private static boolean deviate_add_stmt_2_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1_5")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [mandatory_stmt]
  private static boolean deviate_add_stmt_2_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1_6")) return false;
    mandatory_stmt(builder_, level_ + 1);
    return true;
  }

  // [min_elements_stmt]
  private static boolean deviate_add_stmt_2_1_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1_7")) return false;
    min_elements_stmt(builder_, level_ + 1);
    return true;
  }

  // [max_elements_stmt]
  private static boolean deviate_add_stmt_2_1_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_add_stmt_2_1_8")) return false;
    max_elements_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // DEVIATE DELETE (SEMICOLON | LEFT_BRACE [units_stmt] (must_stmt)+ (unique_stmt)+ [default_stmt] RIGHT_BRACE)
  public static boolean deviate_delete_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DEVIATE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_DEVIATE, YANG_DELETE);
    result_ = result_ && deviate_delete_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_DEVIATE_DELETE_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [units_stmt] (must_stmt)+ (unique_stmt)+ [default_stmt] RIGHT_BRACE
  private static boolean deviate_delete_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = deviate_delete_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [units_stmt] (must_stmt)+ (unique_stmt)+ [default_stmt] RIGHT_BRACE
  private static boolean deviate_delete_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && deviate_delete_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && deviate_delete_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && deviate_delete_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && deviate_delete_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [units_stmt]
  private static boolean deviate_delete_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt_2_1_1")) return false;
    units_stmt(builder_, level_ + 1);
    return true;
  }

  // (must_stmt)+
  private static boolean deviate_delete_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt_2_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = deviate_delete_stmt_2_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!deviate_delete_stmt_2_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "deviate_delete_stmt_2_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)
  private static boolean deviate_delete_stmt_2_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt_2_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = must_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (unique_stmt)+
  private static boolean deviate_delete_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt_2_1_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = deviate_delete_stmt_2_1_3_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!deviate_delete_stmt_2_1_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "deviate_delete_stmt_2_1_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (unique_stmt)
  private static boolean deviate_delete_stmt_2_1_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt_2_1_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = unique_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [default_stmt]
  private static boolean deviate_delete_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_delete_stmt_2_1_4")) return false;
    default_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // DEVIATE NOT_SUPPORTED (SEMICOLON | LEFT_BRACE RIGHT_BRACE)
  public static boolean deviate_not_supported_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_not_supported_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DEVIATE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_DEVIATE, YANG_NOT_SUPPORTED);
    result_ = result_ && deviate_not_supported_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_DEVIATE_NOT_SUPPORTED_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE RIGHT_BRACE
  private static boolean deviate_not_supported_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_not_supported_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = parseTokens(builder_, 0, YANG_LEFT_BRACE, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DEVIATE REPLACE (SEMICOLON | LEFT_BRACE [type_stmt] [units_stmt] [default_stmt] [config_stmt] [mandatory_stmt] [min_elements_stmt] [max_elements_stmt] RIGHT_BRACE)
  public static boolean deviate_replace_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DEVIATE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_DEVIATE, YANG_REPLACE);
    result_ = result_ && deviate_replace_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_DEVIATE_REPLACE_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [type_stmt] [units_stmt] [default_stmt] [config_stmt] [mandatory_stmt] [min_elements_stmt] [max_elements_stmt] RIGHT_BRACE
  private static boolean deviate_replace_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = deviate_replace_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [type_stmt] [units_stmt] [default_stmt] [config_stmt] [mandatory_stmt] [min_elements_stmt] [max_elements_stmt] RIGHT_BRACE
  private static boolean deviate_replace_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && deviate_replace_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && deviate_replace_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && deviate_replace_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && deviate_replace_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && deviate_replace_stmt_2_1_5(builder_, level_ + 1);
    result_ = result_ && deviate_replace_stmt_2_1_6(builder_, level_ + 1);
    result_ = result_ && deviate_replace_stmt_2_1_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [type_stmt]
  private static boolean deviate_replace_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2_1_1")) return false;
    type_stmt(builder_, level_ + 1);
    return true;
  }

  // [units_stmt]
  private static boolean deviate_replace_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2_1_2")) return false;
    units_stmt(builder_, level_ + 1);
    return true;
  }

  // [default_stmt]
  private static boolean deviate_replace_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2_1_3")) return false;
    default_stmt(builder_, level_ + 1);
    return true;
  }

  // [config_stmt]
  private static boolean deviate_replace_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2_1_4")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [mandatory_stmt]
  private static boolean deviate_replace_stmt_2_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2_1_5")) return false;
    mandatory_stmt(builder_, level_ + 1);
    return true;
  }

  // [min_elements_stmt]
  private static boolean deviate_replace_stmt_2_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2_1_6")) return false;
    min_elements_stmt(builder_, level_ + 1);
    return true;
  }

  // [max_elements_stmt]
  private static boolean deviate_replace_stmt_2_1_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviate_replace_stmt_2_1_7")) return false;
    max_elements_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // DEVIATION STRING LEFT_BRACE [description_stmt] [reference_stmt] (deviate_not_supported_stmt | (deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt))+ RIGHT_BRACE
  public static boolean deviation_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviation_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_DEVIATION)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_DEVIATION, YANG_STRING, YANG_LEFT_BRACE);
    result_ = result_ && deviation_stmt_3(builder_, level_ + 1);
    result_ = result_ && deviation_stmt_4(builder_, level_ + 1);
    result_ = result_ && deviation_stmt_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_DEVIATION_STMT, result_);
    return result_;
  }

  // [description_stmt]
  private static boolean deviation_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviation_stmt_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean deviation_stmt_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviation_stmt_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  // (deviate_not_supported_stmt | (deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt))+
  private static boolean deviation_stmt_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviation_stmt_5")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = deviation_stmt_5_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!deviation_stmt_5_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "deviation_stmt_5", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // deviate_not_supported_stmt | (deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt)
  private static boolean deviation_stmt_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviation_stmt_5_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = deviate_not_supported_stmt(builder_, level_ + 1);
    if (!result_) result_ = deviation_stmt_5_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt
  private static boolean deviation_stmt_5_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "deviation_stmt_5_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = deviate_add_stmt(builder_, level_ + 1);
    if (!result_) result_ = deviate_replace_stmt(builder_, level_ + 1);
    if (!result_) result_ = deviate_delete_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (enum_stmt)+
  static boolean enum_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_specification")) return false;
    if (!nextTokenIs(builder_, YANG_ENUM)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = enum_specification_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!enum_specification_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_specification", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (enum_stmt)
  private static boolean enum_specification_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_specification_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = enum_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ENUM STRING (SEMICOLON | LEFT_BRACE [value_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE)
  public static boolean enum_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ENUM)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_ENUM, YANG_STRING);
    result_ = result_ && enum_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ENUM_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [value_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean enum_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = enum_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [value_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean enum_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && enum_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && enum_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && enum_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && enum_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [value_stmt]
  private static boolean enum_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_stmt_2_1_1")) return false;
    value_stmt(builder_, level_ + 1);
    return true;
  }

  // [status_stmt]
  private static boolean enum_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_stmt_2_1_2")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean enum_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_stmt_2_1_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean enum_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_stmt_2_1_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ERROR_APP_TAG STRING stmtend
  public static boolean error_app_tag_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "error_app_tag_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ERROR_APP_TAG)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_ERROR_APP_TAG, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ERROR_APP_TAG_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ERROR_MESSAGE STRING stmtend
  public static boolean error_message_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "error_message_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ERROR_MESSAGE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_ERROR_MESSAGE, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ERROR_MESSAGE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // EXTENSION STRING ( SEMICOLON | LEFT_BRACE [argument_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE )
  public static boolean extension_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extension_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_EXTENSION)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_EXTENSION, YANG_STRING);
    result_ = result_ && extension_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_EXTENSION_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [argument_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean extension_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extension_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = extension_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [argument_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean extension_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extension_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && extension_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && extension_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && extension_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && extension_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [argument_stmt]
  private static boolean extension_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extension_stmt_2_1_1")) return false;
    argument_stmt(builder_, level_ + 1);
    return true;
  }

  // [status_stmt]
  private static boolean extension_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extension_stmt_2_1_2")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean extension_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extension_stmt_2_1_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean extension_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extension_stmt_2_1_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // FEATURE STRING (SEMICOLON | LEFT_BRACE (if_feature_stmt+) [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE)
  public static boolean feature_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "feature_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_FEATURE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_FEATURE, YANG_STRING);
    result_ = result_ && feature_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_FEATURE_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE (if_feature_stmt+) [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean feature_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "feature_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = feature_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE (if_feature_stmt+) [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean feature_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "feature_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && feature_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && feature_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && feature_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && feature_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // if_feature_stmt+
  private static boolean feature_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "feature_stmt_2_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!if_feature_stmt(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "feature_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [status_stmt]
  private static boolean feature_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "feature_stmt_2_1_2")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean feature_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "feature_stmt_2_1_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean feature_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "feature_stmt_2_1_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // FRACTION_DIGITS STRING stmtend
  public static boolean fraction_digits_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fraction_digits_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_FRACTION_DIGITS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_FRACTION_DIGITS, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_FRACTION_DIGITS_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // GROUPING STRING (SEMICOLON | LEFT_BRACE [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ (data_def_stmt)+ RIGHT_BRACE)
  public static boolean grouping_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_GROUPING)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_GROUPING, YANG_STRING);
    result_ = result_ && grouping_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_GROUPING_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ (data_def_stmt)+ RIGHT_BRACE
  private static boolean grouping_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = grouping_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ (data_def_stmt)+ RIGHT_BRACE
  private static boolean grouping_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && grouping_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && grouping_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && grouping_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && grouping_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && grouping_stmt_2_1_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [status_stmt]
  private static boolean grouping_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2_1_1")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean grouping_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2_1_2")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean grouping_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2_1_3")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  // (typedef_stmt | grouping_stmt)+
  private static boolean grouping_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2_1_4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = grouping_stmt_2_1_4_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!grouping_stmt_2_1_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "grouping_stmt_2_1_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typedef_stmt | grouping_stmt
  private static boolean grouping_stmt_2_1_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2_1_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)+
  private static boolean grouping_stmt_2_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2_1_5")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = grouping_stmt_2_1_5_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!grouping_stmt_2_1_5_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "grouping_stmt_2_1_5", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)
  private static boolean grouping_stmt_2_1_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "grouping_stmt_2_1_5_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER [STRING]
  public static boolean identifier_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_IDENTIFIER);
    result_ = result_ && identifier_stmt_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_IDENTIFIER_STMT, result_);
    return result_;
  }

  // [STRING]
  private static boolean identifier_stmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_stmt_1")) return false;
    consumeToken(builder_, YANG_STRING);
    return true;
  }

  /* ********************************************************** */
  // IDENTITY STRING ( SEMICOLON | LEFT_BRACE [base_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE )
  public static boolean identity_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identity_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_IDENTITY)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_IDENTITY, YANG_STRING);
    result_ = result_ && identity_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_IDENTITY_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [base_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean identity_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identity_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = identity_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [base_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean identity_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identity_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && identity_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && identity_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && identity_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && identity_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [base_stmt]
  private static boolean identity_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identity_stmt_2_1_1")) return false;
    base_stmt(builder_, level_ + 1);
    return true;
  }

  // [status_stmt]
  private static boolean identity_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identity_stmt_2_1_2")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean identity_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identity_stmt_2_1_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean identity_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identity_stmt_2_1_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // base_stmt
  static boolean identityref_specification(PsiBuilder builder_, int level_) {
    return base_stmt(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // IF_FEATURE STRING stmtend
  public static boolean if_feature_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_feature_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_IF_FEATURE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_IF_FEATURE, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_IF_FEATURE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // IMPORT STRING LEFT_BRACE  prefix_stmt [revision_date_stmt] RIGHT_BRACE
  public static boolean import_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_IMPORT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_IMPORT, YANG_STRING, YANG_LEFT_BRACE);
    result_ = result_ && prefix_stmt(builder_, level_ + 1);
    result_ = result_ && import_stmt_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_IMPORT_STMT, result_);
    return result_;
  }

  // [revision_date_stmt]
  private static boolean import_stmt_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_stmt_4")) return false;
    revision_date_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // INCLUDE STRING (SEMICOLON | LEFT_BRACE [revision_date_stmt] RIGHT_BRACE)
  public static boolean include_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_INCLUDE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_INCLUDE, YANG_STRING);
    result_ = result_ && include_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_INCLUDE_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [revision_date_stmt] RIGHT_BRACE
  private static boolean include_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = include_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [revision_date_stmt] RIGHT_BRACE
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

  // [revision_date_stmt]
  private static boolean include_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_stmt_2_1_1")) return false;
    revision_date_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // INPUT LEFT_BRACE (typedef_stmt | grouping_stmt)+ (data_def_stmt)* RIGHT_BRACE
  public static boolean input_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_INPUT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_INPUT, YANG_LEFT_BRACE);
    result_ = result_ && input_stmt_2(builder_, level_ + 1);
    result_ = result_ && input_stmt_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_INPUT_STMT, result_);
    return result_;
  }

  // (typedef_stmt | grouping_stmt)+
  private static boolean input_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = input_stmt_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!input_stmt_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "input_stmt_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typedef_stmt | grouping_stmt
  private static boolean input_stmt_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_stmt_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)*
  private static boolean input_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_stmt_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!input_stmt_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "input_stmt_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (data_def_stmt)
  private static boolean input_stmt_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_stmt_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [require_instance_stmt]
  static boolean instance_identifier_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instance_identifier_specification")) return false;
    require_instance_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // KEY STRING stmtend
  public static boolean key_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "key_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_KEY)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_KEY, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_KEY_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // LEAF_LIST STRING LEFT_BRACE [when_stmt] (if_feature_stmt)+ type_stmt [units_stmt] (must_stmt)+ [config_stmt] [min_elements_stmt] [max_elements_stmt] [ordered_by_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  public static boolean leaf_list_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_LEAF_LIST)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_LEAF_LIST, YANG_STRING, YANG_LEFT_BRACE);
    result_ = result_ && leaf_list_stmt_3(builder_, level_ + 1);
    result_ = result_ && leaf_list_stmt_4(builder_, level_ + 1);
    result_ = result_ && type_stmt(builder_, level_ + 1);
    result_ = result_ && leaf_list_stmt_6(builder_, level_ + 1);
    result_ = result_ && leaf_list_stmt_7(builder_, level_ + 1);
    result_ = result_ && leaf_list_stmt_8(builder_, level_ + 1);
    result_ = result_ && leaf_list_stmt_9(builder_, level_ + 1);
    result_ = result_ && leaf_list_stmt_10(builder_, level_ + 1);
    result_ = result_ && leaf_list_stmt_11(builder_, level_ + 1);
    result_ = result_ && leaf_list_stmt_12(builder_, level_ + 1);
    result_ = result_ && leaf_list_stmt_13(builder_, level_ + 1);
    result_ = result_ && leaf_list_stmt_14(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_LEAF_LIST_STMT, result_);
    return result_;
  }

  // [when_stmt]
  private static boolean leaf_list_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_3")) return false;
    when_stmt(builder_, level_ + 1);
    return true;
  }

  // (if_feature_stmt)+
  private static boolean leaf_list_stmt_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = leaf_list_stmt_4_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!leaf_list_stmt_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "leaf_list_stmt_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)
  private static boolean leaf_list_stmt_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [units_stmt]
  private static boolean leaf_list_stmt_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_6")) return false;
    units_stmt(builder_, level_ + 1);
    return true;
  }

  // (must_stmt)+
  private static boolean leaf_list_stmt_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_7")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = leaf_list_stmt_7_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!leaf_list_stmt_7_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "leaf_list_stmt_7", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)
  private static boolean leaf_list_stmt_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_7_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = must_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [config_stmt]
  private static boolean leaf_list_stmt_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_8")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [min_elements_stmt]
  private static boolean leaf_list_stmt_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_9")) return false;
    min_elements_stmt(builder_, level_ + 1);
    return true;
  }

  // [max_elements_stmt]
  private static boolean leaf_list_stmt_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_10")) return false;
    max_elements_stmt(builder_, level_ + 1);
    return true;
  }

  // [ordered_by_stmt]
  private static boolean leaf_list_stmt_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_11")) return false;
    ordered_by_stmt(builder_, level_ + 1);
    return true;
  }

  // [status_stmt]
  private static boolean leaf_list_stmt_12(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_12")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean leaf_list_stmt_13(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_13")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean leaf_list_stmt_14(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_list_stmt_14")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // LEAF STRING LEFT_BRACE [when_stmt] (if_feature_stmt)+ type_stmt [units_stmt] (must_stmt)+ [default_stmt] [config_stmt] [mandatory_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  public static boolean leaf_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_LEAF)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_LEAF, YANG_STRING, YANG_LEFT_BRACE);
    result_ = result_ && leaf_stmt_3(builder_, level_ + 1);
    result_ = result_ && leaf_stmt_4(builder_, level_ + 1);
    result_ = result_ && type_stmt(builder_, level_ + 1);
    result_ = result_ && leaf_stmt_6(builder_, level_ + 1);
    result_ = result_ && leaf_stmt_7(builder_, level_ + 1);
    result_ = result_ && leaf_stmt_8(builder_, level_ + 1);
    result_ = result_ && leaf_stmt_9(builder_, level_ + 1);
    result_ = result_ && leaf_stmt_10(builder_, level_ + 1);
    result_ = result_ && leaf_stmt_11(builder_, level_ + 1);
    result_ = result_ && leaf_stmt_12(builder_, level_ + 1);
    result_ = result_ && leaf_stmt_13(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_LEAF_STMT, result_);
    return result_;
  }

  // [when_stmt]
  private static boolean leaf_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_3")) return false;
    when_stmt(builder_, level_ + 1);
    return true;
  }

  // (if_feature_stmt)+
  private static boolean leaf_stmt_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = leaf_stmt_4_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!leaf_stmt_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "leaf_stmt_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)
  private static boolean leaf_stmt_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [units_stmt]
  private static boolean leaf_stmt_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_6")) return false;
    units_stmt(builder_, level_ + 1);
    return true;
  }

  // (must_stmt)+
  private static boolean leaf_stmt_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_7")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = leaf_stmt_7_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!leaf_stmt_7_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "leaf_stmt_7", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)
  private static boolean leaf_stmt_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_7_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = must_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [default_stmt]
  private static boolean leaf_stmt_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_8")) return false;
    default_stmt(builder_, level_ + 1);
    return true;
  }

  // [config_stmt]
  private static boolean leaf_stmt_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_9")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [mandatory_stmt]
  private static boolean leaf_stmt_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_10")) return false;
    mandatory_stmt(builder_, level_ + 1);
    return true;
  }

  // [status_stmt]
  private static boolean leaf_stmt_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_11")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean leaf_stmt_12(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_12")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean leaf_stmt_13(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_stmt_13")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // path_stmt
  static boolean leafref_specification(PsiBuilder builder_, int level_) {
    return path_stmt(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // LENGTH STRING (SEMICOLON | LEFT_BRACE [error_message_stmt] [error_app_tag_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE)
  public static boolean length_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "length_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_LENGTH)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_LENGTH, YANG_STRING);
    result_ = result_ && length_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_LENGTH_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [error_message_stmt] [error_app_tag_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean length_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "length_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = length_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [error_message_stmt] [error_app_tag_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean length_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "length_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && length_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && length_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && length_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && length_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [error_message_stmt]
  private static boolean length_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "length_stmt_2_1_1")) return false;
    error_message_stmt(builder_, level_ + 1);
    return true;
  }

  // [error_app_tag_stmt]
  private static boolean length_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "length_stmt_2_1_2")) return false;
    error_app_tag_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean length_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "length_stmt_2_1_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean length_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "length_stmt_2_1_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (import_stmt)+ (include_stmt)+
  static boolean linkage_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "linkage_stmts")) return false;
    if (!nextTokenIs(builder_, YANG_IMPORT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = linkage_stmts_0(builder_, level_ + 1);
    result_ = result_ && linkage_stmts_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (import_stmt)+
  private static boolean linkage_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "linkage_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = linkage_stmts_0_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!linkage_stmts_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "linkage_stmts_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (import_stmt)
  private static boolean linkage_stmts_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "linkage_stmts_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = import_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (include_stmt)+
  private static boolean linkage_stmts_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "linkage_stmts_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = linkage_stmts_1_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!linkage_stmts_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "linkage_stmts_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (include_stmt)
  private static boolean linkage_stmts_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "linkage_stmts_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = include_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LIST STRING LEFT_BRACE [when_stmt] (if_feature_stmt)+ type_stmt [units_stmt] (must_stmt)+ [config_stmt] [min_elements_stmt] [max_elements_stmt] [ordered_by_stmt] [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ (data_def_stmt)* RIGHT_BRACE
  public static boolean list_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_LIST)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_LIST, YANG_STRING, YANG_LEFT_BRACE);
    result_ = result_ && list_stmt_3(builder_, level_ + 1);
    result_ = result_ && list_stmt_4(builder_, level_ + 1);
    result_ = result_ && type_stmt(builder_, level_ + 1);
    result_ = result_ && list_stmt_6(builder_, level_ + 1);
    result_ = result_ && list_stmt_7(builder_, level_ + 1);
    result_ = result_ && list_stmt_8(builder_, level_ + 1);
    result_ = result_ && list_stmt_9(builder_, level_ + 1);
    result_ = result_ && list_stmt_10(builder_, level_ + 1);
    result_ = result_ && list_stmt_11(builder_, level_ + 1);
    result_ = result_ && list_stmt_12(builder_, level_ + 1);
    result_ = result_ && list_stmt_13(builder_, level_ + 1);
    result_ = result_ && list_stmt_14(builder_, level_ + 1);
    result_ = result_ && list_stmt_15(builder_, level_ + 1);
    result_ = result_ && list_stmt_16(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_LIST_STMT, result_);
    return result_;
  }

  // [when_stmt]
  private static boolean list_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_3")) return false;
    when_stmt(builder_, level_ + 1);
    return true;
  }

  // (if_feature_stmt)+
  private static boolean list_stmt_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = list_stmt_4_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!list_stmt_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "list_stmt_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)
  private static boolean list_stmt_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [units_stmt]
  private static boolean list_stmt_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_6")) return false;
    units_stmt(builder_, level_ + 1);
    return true;
  }

  // (must_stmt)+
  private static boolean list_stmt_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_7")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = list_stmt_7_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!list_stmt_7_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "list_stmt_7", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)
  private static boolean list_stmt_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_7_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = must_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [config_stmt]
  private static boolean list_stmt_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_8")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [min_elements_stmt]
  private static boolean list_stmt_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_9")) return false;
    min_elements_stmt(builder_, level_ + 1);
    return true;
  }

  // [max_elements_stmt]
  private static boolean list_stmt_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_10")) return false;
    max_elements_stmt(builder_, level_ + 1);
    return true;
  }

  // [ordered_by_stmt]
  private static boolean list_stmt_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_11")) return false;
    ordered_by_stmt(builder_, level_ + 1);
    return true;
  }

  // [status_stmt]
  private static boolean list_stmt_12(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_12")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean list_stmt_13(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_13")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean list_stmt_14(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_14")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  // (typedef_stmt | grouping_stmt)+
  private static boolean list_stmt_15(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_15")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = list_stmt_15_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!list_stmt_15_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "list_stmt_15", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typedef_stmt | grouping_stmt
  private static boolean list_stmt_15_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_15_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)*
  private static boolean list_stmt_16(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_16")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!list_stmt_16_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "list_stmt_16", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (data_def_stmt)
  private static boolean list_stmt_16_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_stmt_16_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // MANDATORY STRING stmtend
  public static boolean mandatory_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mandatory_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_MANDATORY)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_MANDATORY, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_MANDATORY_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // MAX_ELEMENTS STRING stmtend
  public static boolean max_elements_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "max_elements_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_MAX_ELEMENTS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_MAX_ELEMENTS, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_MAX_ELEMENTS_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // [organization_stmt ] [contact_stmt ] [description_stmt ] [reference_stmt]
  static boolean meta_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "meta_stmts")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = meta_stmts_0(builder_, level_ + 1);
    result_ = result_ && meta_stmts_1(builder_, level_ + 1);
    result_ = result_ && meta_stmts_2(builder_, level_ + 1);
    result_ = result_ && meta_stmts_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [organization_stmt ]
  private static boolean meta_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "meta_stmts_0")) return false;
    organization_stmt(builder_, level_ + 1);
    return true;
  }

  // [contact_stmt ]
  private static boolean meta_stmts_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "meta_stmts_1")) return false;
    contact_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt ]
  private static boolean meta_stmts_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "meta_stmts_2")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean meta_stmts_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "meta_stmts_3")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // MIN_ELEMENTS STRING stmtend
  public static boolean min_elements_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "min_elements_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_MIN_ELEMENTS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_MIN_ELEMENTS, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_MIN_ELEMENTS_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ yang_version_stmt ] namespace_stmt prefix_stmt
  static boolean module_header_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_header_stmts")) return false;
    if (!nextTokenIs(builder_, "", YANG_NAMESPACE, YANG_YANG_VERSION)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = module_header_stmts_0(builder_, level_ + 1);
    result_ = result_ && namespace_stmt(builder_, level_ + 1);
    result_ = result_ && prefix_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ yang_version_stmt ]
  private static boolean module_header_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_header_stmts_0")) return false;
    yang_version_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // MODULE STRING LEFT_BRACE module_header_stmts linkage_stmts meta_stmts revision_stmts body_stmts RIGHT_BRACE
  public static boolean module_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_MODULE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_MODULE, YANG_STRING, YANG_LEFT_BRACE);
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
  // MUST STRING (SEMICOLON | LEFT_BRACE [error_message_stmt] [error_app_tag_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE)
  public static boolean must_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "must_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_MUST)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_MUST, YANG_STRING);
    result_ = result_ && must_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_MUST_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [error_message_stmt] [error_app_tag_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean must_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "must_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = must_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [error_message_stmt] [error_app_tag_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean must_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "must_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && must_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && must_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && must_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && must_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [error_message_stmt]
  private static boolean must_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "must_stmt_2_1_1")) return false;
    error_message_stmt(builder_, level_ + 1);
    return true;
  }

  // [error_app_tag_stmt]
  private static boolean must_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "must_stmt_2_1_2")) return false;
    error_app_tag_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean must_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "must_stmt_2_1_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean must_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "must_stmt_2_1_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // NAMESPACE STRING stmtend
  public static boolean namespace_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_NAMESPACE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_NAMESPACE, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_NAMESPACE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // NOTIFICATION STRING (SEMICOLON | LEFT_BRACE (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ (data_def_stmt)+ RIGHT_BRACE)
  public static boolean notification_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_NOTIFICATION)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_NOTIFICATION, YANG_STRING);
    result_ = result_ && notification_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_NOTIFICATION_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ (data_def_stmt)+ RIGHT_BRACE
  private static boolean notification_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = notification_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ (data_def_stmt)+ RIGHT_BRACE
  private static boolean notification_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && notification_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && notification_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && notification_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && notification_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && notification_stmt_2_1_5(builder_, level_ + 1);
    result_ = result_ && notification_stmt_2_1_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)+
  private static boolean notification_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = notification_stmt_2_1_1_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!notification_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "notification_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)
  private static boolean notification_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [status_stmt]
  private static boolean notification_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1_2")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean notification_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean notification_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  // (typedef_stmt | grouping_stmt)+
  private static boolean notification_stmt_2_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1_5")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = notification_stmt_2_1_5_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!notification_stmt_2_1_5_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "notification_stmt_2_1_5", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typedef_stmt | grouping_stmt
  private static boolean notification_stmt_2_1_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1_5_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)+
  private static boolean notification_stmt_2_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1_6")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = notification_stmt_2_1_6_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!notification_stmt_2_1_6_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "notification_stmt_2_1_6", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)
  private static boolean notification_stmt_2_1_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notification_stmt_2_1_6_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // range_stmt
  static boolean numerical_restrictions(PsiBuilder builder_, int level_) {
    return range_stmt(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // ORDERED_BY STRING stmtend
  public static boolean ordered_by_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ordered_by_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ORDERED_BY)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_ORDERED_BY, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ORDERED_BY_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ORGANIZATION STRING stmtend
  public static boolean organization_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "organization_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_ORGANIZATION)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_ORGANIZATION, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_ORGANIZATION_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // OUTPUT LEFT_BRACE (typedef_stmt | grouping_stmt)+ (data_def_stmt)* RIGHT_BRACE
  public static boolean output_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "output_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_OUTPUT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_OUTPUT, YANG_LEFT_BRACE);
    result_ = result_ && output_stmt_2(builder_, level_ + 1);
    result_ = result_ && output_stmt_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_OUTPUT_STMT, result_);
    return result_;
  }

  // (typedef_stmt | grouping_stmt)+
  private static boolean output_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "output_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = output_stmt_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!output_stmt_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "output_stmt_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typedef_stmt | grouping_stmt
  private static boolean output_stmt_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "output_stmt_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)*
  private static boolean output_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "output_stmt_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!output_stmt_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "output_stmt_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (data_def_stmt)
  private static boolean output_stmt_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "output_stmt_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PATH STRING stmtend
  public static boolean path_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "path_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_PATH)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_PATH, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_PATH_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // PATTERN STRING (SEMICOLON | LEFT_BRACE [error_message_stmt] [error_app_tag_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE)
  public static boolean pattern_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_PATTERN)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_PATTERN, YANG_STRING);
    result_ = result_ && pattern_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_PATTERN_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [error_message_stmt] [error_app_tag_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean pattern_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = pattern_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [error_message_stmt] [error_app_tag_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean pattern_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && pattern_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && pattern_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && pattern_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && pattern_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [error_message_stmt]
  private static boolean pattern_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_stmt_2_1_1")) return false;
    error_message_stmt(builder_, level_ + 1);
    return true;
  }

  // [error_app_tag_stmt]
  private static boolean pattern_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_stmt_2_1_2")) return false;
    error_app_tag_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean pattern_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_stmt_2_1_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean pattern_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_stmt_2_1_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // POSITION STRING stmtend
  public static boolean position_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "position_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_POSITION)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_POSITION, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_POSITION_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // PREFIX STRING stmtend
  public static boolean prefix_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefix_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_PREFIX)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_PREFIX, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_PREFIX_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // PRESENCE STRING stmtend
  public static boolean presence_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "presence_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_PRESENCE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_PRESENCE, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_PRESENCE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // RANGE STRING (SEMICOLON | LEFT_BRACE [error_message_stmt] [error_app_tag_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE)
  public static boolean range_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_RANGE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_RANGE, YANG_STRING);
    result_ = result_ && range_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_RANGE_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [error_message_stmt] [error_app_tag_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean range_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = range_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [error_message_stmt] [error_app_tag_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean range_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && range_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && range_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && range_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && range_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [error_message_stmt]
  private static boolean range_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_stmt_2_1_1")) return false;
    error_message_stmt(builder_, level_ + 1);
    return true;
  }

  // [error_app_tag_stmt]
  private static boolean range_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_stmt_2_1_2")) return false;
    error_app_tag_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean range_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_stmt_2_1_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean range_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_stmt_2_1_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // REFERENCE  STRING stmtend
  public static boolean reference_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reference_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_REFERENCE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_REFERENCE, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_REFERENCE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // (must_stmt)+ [config_stmt] [mandatory_stmt] [description_stmt] [reference_stmt]
  static boolean refine_anyxml_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_anyxml_stmts")) return false;
    if (!nextTokenIs(builder_, YANG_MUST)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_anyxml_stmts_0(builder_, level_ + 1);
    result_ = result_ && refine_anyxml_stmts_1(builder_, level_ + 1);
    result_ = result_ && refine_anyxml_stmts_2(builder_, level_ + 1);
    result_ = result_ && refine_anyxml_stmts_3(builder_, level_ + 1);
    result_ = result_ && refine_anyxml_stmts_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)+
  private static boolean refine_anyxml_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_anyxml_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_anyxml_stmts_0_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!refine_anyxml_stmts_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "refine_anyxml_stmts_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)
  private static boolean refine_anyxml_stmts_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_anyxml_stmts_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = must_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [config_stmt]
  private static boolean refine_anyxml_stmts_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_anyxml_stmts_1")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [mandatory_stmt]
  private static boolean refine_anyxml_stmts_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_anyxml_stmts_2")) return false;
    mandatory_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean refine_anyxml_stmts_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_anyxml_stmts_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean refine_anyxml_stmts_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_anyxml_stmts_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [description_stmt] [reference_stmt]
  static boolean refine_case_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_case_stmts")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_case_stmts_0(builder_, level_ + 1);
    result_ = result_ && refine_case_stmts_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [description_stmt]
  private static boolean refine_case_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_case_stmts_0")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean refine_case_stmts_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_case_stmts_1")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [default_stmt] [config_stmt] [mandatory_stmt] [description_stmt] [reference_stmt]
  static boolean refine_choice_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_choice_stmts")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_choice_stmts_0(builder_, level_ + 1);
    result_ = result_ && refine_choice_stmts_1(builder_, level_ + 1);
    result_ = result_ && refine_choice_stmts_2(builder_, level_ + 1);
    result_ = result_ && refine_choice_stmts_3(builder_, level_ + 1);
    result_ = result_ && refine_choice_stmts_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [default_stmt]
  private static boolean refine_choice_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_choice_stmts_0")) return false;
    default_stmt(builder_, level_ + 1);
    return true;
  }

  // [config_stmt]
  private static boolean refine_choice_stmts_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_choice_stmts_1")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [mandatory_stmt]
  private static boolean refine_choice_stmts_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_choice_stmts_2")) return false;
    mandatory_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean refine_choice_stmts_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_choice_stmts_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean refine_choice_stmts_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_choice_stmts_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (must_stmt)+ [presence_stmt] [config_stmt] [description_stmt] [reference_stmt]
  static boolean refine_container_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_container_stmts")) return false;
    if (!nextTokenIs(builder_, YANG_MUST)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_container_stmts_0(builder_, level_ + 1);
    result_ = result_ && refine_container_stmts_1(builder_, level_ + 1);
    result_ = result_ && refine_container_stmts_2(builder_, level_ + 1);
    result_ = result_ && refine_container_stmts_3(builder_, level_ + 1);
    result_ = result_ && refine_container_stmts_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)+
  private static boolean refine_container_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_container_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_container_stmts_0_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!refine_container_stmts_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "refine_container_stmts_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)
  private static boolean refine_container_stmts_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_container_stmts_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = must_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [presence_stmt]
  private static boolean refine_container_stmts_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_container_stmts_1")) return false;
    presence_stmt(builder_, level_ + 1);
    return true;
  }

  // [config_stmt]
  private static boolean refine_container_stmts_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_container_stmts_2")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean refine_container_stmts_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_container_stmts_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean refine_container_stmts_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_container_stmts_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (must_stmt)+ [config_stmt] [min_elements_stmt] [max_elements_stmt] [description_stmt] [reference_stmt]
  static boolean refine_leaf_list_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_list_stmts")) return false;
    if (!nextTokenIs(builder_, YANG_MUST)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_leaf_list_stmts_0(builder_, level_ + 1);
    result_ = result_ && refine_leaf_list_stmts_1(builder_, level_ + 1);
    result_ = result_ && refine_leaf_list_stmts_2(builder_, level_ + 1);
    result_ = result_ && refine_leaf_list_stmts_3(builder_, level_ + 1);
    result_ = result_ && refine_leaf_list_stmts_4(builder_, level_ + 1);
    result_ = result_ && refine_leaf_list_stmts_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)+
  private static boolean refine_leaf_list_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_list_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_leaf_list_stmts_0_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!refine_leaf_list_stmts_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "refine_leaf_list_stmts_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)
  private static boolean refine_leaf_list_stmts_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_list_stmts_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = must_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [config_stmt]
  private static boolean refine_leaf_list_stmts_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_list_stmts_1")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [min_elements_stmt]
  private static boolean refine_leaf_list_stmts_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_list_stmts_2")) return false;
    min_elements_stmt(builder_, level_ + 1);
    return true;
  }

  // [max_elements_stmt]
  private static boolean refine_leaf_list_stmts_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_list_stmts_3")) return false;
    max_elements_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean refine_leaf_list_stmts_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_list_stmts_4")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean refine_leaf_list_stmts_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_list_stmts_5")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (must_stmt)+ [default_stmt] [config_stmt] [mandatory_stmt] [description_stmt] [reference_stmt]
  static boolean refine_leaf_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_stmts")) return false;
    if (!nextTokenIs(builder_, YANG_MUST)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_leaf_stmts_0(builder_, level_ + 1);
    result_ = result_ && refine_leaf_stmts_1(builder_, level_ + 1);
    result_ = result_ && refine_leaf_stmts_2(builder_, level_ + 1);
    result_ = result_ && refine_leaf_stmts_3(builder_, level_ + 1);
    result_ = result_ && refine_leaf_stmts_4(builder_, level_ + 1);
    result_ = result_ && refine_leaf_stmts_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)+
  private static boolean refine_leaf_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_leaf_stmts_0_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!refine_leaf_stmts_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "refine_leaf_stmts_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)
  private static boolean refine_leaf_stmts_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_stmts_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = must_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [default_stmt]
  private static boolean refine_leaf_stmts_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_stmts_1")) return false;
    default_stmt(builder_, level_ + 1);
    return true;
  }

  // [config_stmt]
  private static boolean refine_leaf_stmts_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_stmts_2")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [mandatory_stmt]
  private static boolean refine_leaf_stmts_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_stmts_3")) return false;
    mandatory_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean refine_leaf_stmts_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_stmts_4")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean refine_leaf_stmts_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_leaf_stmts_5")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (must_stmt)+ [config_stmt] [min_elements_stmt] [max_elements_stmt] [description_stmt] [reference_stmt]
  static boolean refine_list_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_list_stmts")) return false;
    if (!nextTokenIs(builder_, YANG_MUST)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_list_stmts_0(builder_, level_ + 1);
    result_ = result_ && refine_list_stmts_1(builder_, level_ + 1);
    result_ = result_ && refine_list_stmts_2(builder_, level_ + 1);
    result_ = result_ && refine_list_stmts_3(builder_, level_ + 1);
    result_ = result_ && refine_list_stmts_4(builder_, level_ + 1);
    result_ = result_ && refine_list_stmts_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)+
  private static boolean refine_list_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_list_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_list_stmts_0_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!refine_list_stmts_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "refine_list_stmts_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (must_stmt)
  private static boolean refine_list_stmts_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_list_stmts_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = must_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [config_stmt]
  private static boolean refine_list_stmts_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_list_stmts_1")) return false;
    config_stmt(builder_, level_ + 1);
    return true;
  }

  // [min_elements_stmt]
  private static boolean refine_list_stmts_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_list_stmts_2")) return false;
    min_elements_stmt(builder_, level_ + 1);
    return true;
  }

  // [max_elements_stmt]
  private static boolean refine_list_stmts_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_list_stmts_3")) return false;
    max_elements_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean refine_list_stmts_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_list_stmts_4")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean refine_list_stmts_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_list_stmts_5")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // REFINE STRING (SEMICOLON | LEFT_BRACE (refine_container_stmts | refine_leaf_stmts | refine_leaf_list_stmts | refine_list_stmts | refine_choice_stmts | refine_case_stmts | refine_anyxml_stmts) RIGHT_BRACE)
  public static boolean refine_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_REFINE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_REFINE, YANG_STRING);
    result_ = result_ && refine_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_REFINE_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE (refine_container_stmts | refine_leaf_stmts | refine_leaf_list_stmts | refine_list_stmts | refine_choice_stmts | refine_case_stmts | refine_anyxml_stmts) RIGHT_BRACE
  private static boolean refine_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = refine_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE (refine_container_stmts | refine_leaf_stmts | refine_leaf_list_stmts | refine_list_stmts | refine_choice_stmts | refine_case_stmts | refine_anyxml_stmts) RIGHT_BRACE
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

  // refine_container_stmts | refine_leaf_stmts | refine_leaf_list_stmts | refine_list_stmts | refine_choice_stmts | refine_case_stmts | refine_anyxml_stmts
  private static boolean refine_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "refine_stmt_2_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_container_stmts(builder_, level_ + 1);
    if (!result_) result_ = refine_leaf_stmts(builder_, level_ + 1);
    if (!result_) result_ = refine_leaf_list_stmts(builder_, level_ + 1);
    if (!result_) result_ = refine_list_stmts(builder_, level_ + 1);
    if (!result_) result_ = refine_choice_stmts(builder_, level_ + 1);
    if (!result_) result_ = refine_case_stmts(builder_, level_ + 1);
    if (!result_) result_ = refine_anyxml_stmts(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // REQUIRE_INSTANCE STRING stmtend
  public static boolean require_instance_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "require_instance_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_REQUIRE_INSTANCE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_REQUIRE_INSTANCE, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_REQUIRE_INSTANCE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // REVISION_DATE STRING stmtend
  public static boolean revision_date_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_date_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_REVISION_DATE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_REVISION_DATE, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_REVISION_DATE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // REVISION STRING (SEMICOLON | LEFT_BRACE [description_stmt] [reference_stmt] RIGHT_BRACE)
  public static boolean revision_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_REVISION)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_REVISION, YANG_STRING);
    result_ = result_ && revision_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_REVISION_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean revision_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = revision_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [description_stmt] [reference_stmt] RIGHT_BRACE
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

  // [description_stmt]
  private static boolean revision_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmt_2_1_1")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean revision_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmt_2_1_2")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (revision_stmt)+
  static boolean revision_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmts")) return false;
    if (!nextTokenIs(builder_, YANG_REVISION)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = revision_stmts_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!revision_stmts_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "revision_stmts", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (revision_stmt)
  private static boolean revision_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "revision_stmts_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = revision_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // RPC STRING (SEMICOLON | LEFT_BRACE (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ [input_stmt] [output_stmt] RIGHT_BRACE)
  public static boolean rpc_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_RPC)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_RPC, YANG_STRING);
    result_ = result_ && rpc_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_RPC_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ [input_stmt] [output_stmt] RIGHT_BRACE
  private static boolean rpc_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = rpc_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] (typedef_stmt | grouping_stmt)+ [input_stmt] [output_stmt] RIGHT_BRACE
  private static boolean rpc_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && rpc_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && rpc_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && rpc_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && rpc_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && rpc_stmt_2_1_5(builder_, level_ + 1);
    result_ = result_ && rpc_stmt_2_1_6(builder_, level_ + 1);
    result_ = result_ && rpc_stmt_2_1_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)+
  private static boolean rpc_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = rpc_stmt_2_1_1_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!rpc_stmt_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "rpc_stmt_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)
  private static boolean rpc_stmt_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [status_stmt]
  private static boolean rpc_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1_2")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean rpc_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1_3")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean rpc_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1_4")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  // (typedef_stmt | grouping_stmt)+
  private static boolean rpc_stmt_2_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1_5")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = rpc_stmt_2_1_5_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!rpc_stmt_2_1_5_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "rpc_stmt_2_1_5", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typedef_stmt | grouping_stmt
  private static boolean rpc_stmt_2_1_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1_5_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = typedef_stmt(builder_, level_ + 1);
    if (!result_) result_ = grouping_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [input_stmt]
  private static boolean rpc_stmt_2_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1_6")) return false;
    input_stmt(builder_, level_ + 1);
    return true;
  }

  // [output_stmt]
  private static boolean rpc_stmt_2_1_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rpc_stmt_2_1_7")) return false;
    output_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // container_stmt | leaf_stmt | leaf_list_stmt | list_stmt | anyxml_stmt
  static boolean short_case_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "short_case_stmt")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = container_stmt(builder_, level_ + 1);
    if (!result_) result_ = leaf_stmt(builder_, level_ + 1);
    if (!result_) result_ = leaf_list_stmt(builder_, level_ + 1);
    if (!result_) result_ = list_stmt(builder_, level_ + 1);
    if (!result_) result_ = anyxml_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // STATUS STRING stmtend
  public static boolean status_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "status_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_STATUS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_STATUS, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_STATUS_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // SEMICOLON [identifier_stmt] | (LEFT_BRACE [identifier_stmt] RIGHT_BRACE)
  public static boolean stmtend(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stmtend")) return false;
    if (!nextTokenIs(builder_, "<stmtend>", YANG_LEFT_BRACE, YANG_SEMICOLON)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<stmtend>");
    result_ = stmtend_0(builder_, level_ + 1);
    if (!result_) result_ = stmtend_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YANG_STMTEND, result_, false, null);
    return result_;
  }

  // SEMICOLON [identifier_stmt]
  private static boolean stmtend_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stmtend_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    result_ = result_ && stmtend_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [identifier_stmt]
  private static boolean stmtend_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stmtend_0_1")) return false;
    identifier_stmt(builder_, level_ + 1);
    return true;
  }

  // LEFT_BRACE [identifier_stmt] RIGHT_BRACE
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

  // [identifier_stmt]
  private static boolean stmtend_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stmtend_1_1")) return false;
    identifier_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [ yang_version_stmt ] belongs_to_stmt
  static boolean submodule_header_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "submodule_header_stmts")) return false;
    if (!nextTokenIs(builder_, "", YANG_BELONGS_TO, YANG_YANG_VERSION)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = submodule_header_stmts_0(builder_, level_ + 1);
    result_ = result_ && belongs_to_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ yang_version_stmt ]
  private static boolean submodule_header_stmts_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "submodule_header_stmts_0")) return false;
    yang_version_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // SUBMODULE STRING LEFT_BRACE submodule_header_stmts linkage_stmts meta_stmts revision_stmts body_stmts RIGHT_BRACE
  public static boolean submodule_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "submodule_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_SUBMODULE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_SUBMODULE, YANG_STRING, YANG_LEFT_BRACE);
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
  // numerical_restrictions | decimal64_specification | STRING_restrictions | enum_specification | leafref_specification | identityref_specification | instance_identifier_specification | bits_specification | union_specification | binary_specification
  static boolean type_body_stmts(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_body_stmts")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = numerical_restrictions(builder_, level_ + 1);
    if (!result_) result_ = decimal64_specification(builder_, level_ + 1);
    if (!result_) result_ = STRING_restrictions(builder_, level_ + 1);
    if (!result_) result_ = enum_specification(builder_, level_ + 1);
    if (!result_) result_ = leafref_specification(builder_, level_ + 1);
    if (!result_) result_ = identityref_specification(builder_, level_ + 1);
    if (!result_) result_ = instance_identifier_specification(builder_, level_ + 1);
    if (!result_) result_ = bits_specification(builder_, level_ + 1);
    if (!result_) result_ = union_specification(builder_, level_ + 1);
    if (!result_) result_ = binary_specification(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TYPE STRING ( SEMICOLON | RIGHT_BRACE type_body_stmts RIGHT_BRACE )
  public static boolean type_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_TYPE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_TYPE, YANG_STRING);
    result_ = result_ && type_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_TYPE_STMT, result_);
    return result_;
  }

  // SEMICOLON | RIGHT_BRACE type_body_stmts RIGHT_BRACE
  private static boolean type_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = type_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // RIGHT_BRACE type_body_stmts RIGHT_BRACE
  private static boolean type_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_RIGHT_BRACE);
    result_ = result_ && type_body_stmts(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TYPEDEF STRING LEFT_BRACE type_stmt [units_stmt] [default_stmt] [status_stmt] [description_stmt] [reference_stmt] RIGHT_BRACE
  public static boolean typedef_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedef_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_TYPEDEF)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_TYPEDEF, YANG_STRING, YANG_LEFT_BRACE);
    result_ = result_ && type_stmt(builder_, level_ + 1);
    result_ = result_ && typedef_stmt_4(builder_, level_ + 1);
    result_ = result_ && typedef_stmt_5(builder_, level_ + 1);
    result_ = result_ && typedef_stmt_6(builder_, level_ + 1);
    result_ = result_ && typedef_stmt_7(builder_, level_ + 1);
    result_ = result_ && typedef_stmt_8(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_TYPEDEF_STMT, result_);
    return result_;
  }

  // [units_stmt]
  private static boolean typedef_stmt_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedef_stmt_4")) return false;
    units_stmt(builder_, level_ + 1);
    return true;
  }

  // [default_stmt]
  private static boolean typedef_stmt_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedef_stmt_5")) return false;
    default_stmt(builder_, level_ + 1);
    return true;
  }

  // [status_stmt]
  private static boolean typedef_stmt_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedef_stmt_6")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean typedef_stmt_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedef_stmt_7")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean typedef_stmt_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedef_stmt_8")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (type_stmt)*
  static boolean union_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "union_specification")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!union_specification_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "union_specification", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (type_stmt)
  private static boolean union_specification_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "union_specification_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = type_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // UNIQUE STRING stmtend
  public static boolean unique_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unique_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_UNIQUE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_UNIQUE, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_UNIQUE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // UNITS STRING stmtend
  public static boolean units_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "units_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_UNITS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_UNITS, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_UNITS_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // AUGMENT STRING LEFT_BRACE [when_stmt] (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] ((data_def_stmt)+ | (case_stmt))* RIGHT_BRACE
  public static boolean uses_augment_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_AUGMENT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_AUGMENT, YANG_STRING, YANG_LEFT_BRACE);
    result_ = result_ && uses_augment_stmt_3(builder_, level_ + 1);
    result_ = result_ && uses_augment_stmt_4(builder_, level_ + 1);
    result_ = result_ && uses_augment_stmt_5(builder_, level_ + 1);
    result_ = result_ && uses_augment_stmt_6(builder_, level_ + 1);
    result_ = result_ && uses_augment_stmt_7(builder_, level_ + 1);
    result_ = result_ && uses_augment_stmt_8(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, YANG_USES_AUGMENT_STMT, result_);
    return result_;
  }

  // [when_stmt]
  private static boolean uses_augment_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_3")) return false;
    when_stmt(builder_, level_ + 1);
    return true;
  }

  // (if_feature_stmt)+
  private static boolean uses_augment_stmt_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = uses_augment_stmt_4_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!uses_augment_stmt_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "uses_augment_stmt_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)
  private static boolean uses_augment_stmt_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [status_stmt]
  private static boolean uses_augment_stmt_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_5")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean uses_augment_stmt_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_6")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean uses_augment_stmt_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_7")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  // ((data_def_stmt)+ | (case_stmt))*
  private static boolean uses_augment_stmt_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_8")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!uses_augment_stmt_8_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "uses_augment_stmt_8", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (data_def_stmt)+ | (case_stmt)
  private static boolean uses_augment_stmt_8_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_8_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = uses_augment_stmt_8_0_0(builder_, level_ + 1);
    if (!result_) result_ = uses_augment_stmt_8_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)+
  private static boolean uses_augment_stmt_8_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_8_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = uses_augment_stmt_8_0_0_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!uses_augment_stmt_8_0_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "uses_augment_stmt_8_0_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (data_def_stmt)
  private static boolean uses_augment_stmt_8_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_8_0_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = data_def_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (case_stmt)
  private static boolean uses_augment_stmt_8_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_augment_stmt_8_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = case_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // USES STRING (SEMICOLON | LEFT_BRACE [when_stmt] (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] (refine_stmt)+ (uses_augment_stmt)+ RIGHT_BRACE)
  public static boolean uses_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_USES)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_USES, YANG_STRING);
    result_ = result_ && uses_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_USES_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [when_stmt] (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] (refine_stmt)+ (uses_augment_stmt)+ RIGHT_BRACE
  private static boolean uses_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = uses_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [when_stmt] (if_feature_stmt)+ [status_stmt] [description_stmt] [reference_stmt] (refine_stmt)+ (uses_augment_stmt)+ RIGHT_BRACE
  private static boolean uses_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && uses_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && uses_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && uses_stmt_2_1_3(builder_, level_ + 1);
    result_ = result_ && uses_stmt_2_1_4(builder_, level_ + 1);
    result_ = result_ && uses_stmt_2_1_5(builder_, level_ + 1);
    result_ = result_ && uses_stmt_2_1_6(builder_, level_ + 1);
    result_ = result_ && uses_stmt_2_1_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [when_stmt]
  private static boolean uses_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1_1")) return false;
    when_stmt(builder_, level_ + 1);
    return true;
  }

  // (if_feature_stmt)+
  private static boolean uses_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = uses_stmt_2_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!uses_stmt_2_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "uses_stmt_2_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (if_feature_stmt)
  private static boolean uses_stmt_2_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = if_feature_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [status_stmt]
  private static boolean uses_stmt_2_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1_3")) return false;
    status_stmt(builder_, level_ + 1);
    return true;
  }

  // [description_stmt]
  private static boolean uses_stmt_2_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1_4")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean uses_stmt_2_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1_5")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  // (refine_stmt)+
  private static boolean uses_stmt_2_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1_6")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = uses_stmt_2_1_6_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!uses_stmt_2_1_6_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "uses_stmt_2_1_6", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (refine_stmt)
  private static boolean uses_stmt_2_1_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1_6_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = refine_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (uses_augment_stmt)+
  private static boolean uses_stmt_2_1_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1_7")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = uses_stmt_2_1_7_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!uses_stmt_2_1_7_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "uses_stmt_2_1_7", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (uses_augment_stmt)
  private static boolean uses_stmt_2_1_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uses_stmt_2_1_7_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = uses_augment_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // VALUE STRING stmtend
  public static boolean value_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "value_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_VALUE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_VALUE, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_VALUE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // WHEN STRING (SEMICOLON | LEFT_BRACE [description_stmt] [reference_stmt] RIGHT_BRACE)
  public static boolean when_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_WHEN)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_WHEN, YANG_STRING);
    result_ = result_ && when_stmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_WHEN_STMT, result_);
    return result_;
  }

  // SEMICOLON | LEFT_BRACE [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean when_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_stmt_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_SEMICOLON);
    if (!result_) result_ = when_stmt_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE [description_stmt] [reference_stmt] RIGHT_BRACE
  private static boolean when_stmt_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_stmt_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_LEFT_BRACE);
    result_ = result_ && when_stmt_2_1_1(builder_, level_ + 1);
    result_ = result_ && when_stmt_2_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, YANG_RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [description_stmt]
  private static boolean when_stmt_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_stmt_2_1_1")) return false;
    description_stmt(builder_, level_ + 1);
    return true;
  }

  // [reference_stmt]
  private static boolean when_stmt_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_stmt_2_1_2")) return false;
    reference_stmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // module_stmt | submodule_stmt
  static boolean yang(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yang")) return false;
    if (!nextTokenIs(builder_, "", YANG_MODULE, YANG_SUBMODULE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = module_stmt(builder_, level_ + 1);
    if (!result_) result_ = submodule_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // YANG_VERSION STRING stmtend
  public static boolean yang_version_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yang_version_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_YANG_VERSION)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, YANG_YANG_VERSION, YANG_STRING);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_YANG_VERSION_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING
  static boolean yin_element_arg(PsiBuilder builder_, int level_) {
    return consumeToken(builder_, YANG_STRING);
  }

  /* ********************************************************** */
  // YIN_ELEMENT yin_element_arg stmtend
  public static boolean yin_element_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yin_element_stmt")) return false;
    if (!nextTokenIs(builder_, YANG_YIN_ELEMENT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YANG_YIN_ELEMENT);
    result_ = result_ && yin_element_arg(builder_, level_ + 1);
    result_ = result_ && stmtend(builder_, level_ + 1);
    exit_section_(builder_, marker_, YANG_YIN_ELEMENT_STMT, result_);
    return result_;
  }

}
