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
package com.intellij.lang.yang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.lang.psi.impl.*;

public interface YangTypes  {

  IElementType YANG_ANYXML_STMT = new YangElementType("YANG_ANYXML_STMT");
  IElementType YANG_ARGUMENT_STMT = new YangElementType("YANG_ARGUMENT_STMT");
  IElementType YANG_AUGMENT_STMT = new YangElementType("YANG_AUGMENT_STMT");
  IElementType YANG_BASE_STMT = new YangElementType("YANG_BASE_STMT");
  IElementType YANG_BELONGS_TO_STMT = new YangElementType("YANG_BELONGS_TO_STMT");
  IElementType YANG_BITS_SPECIFICATION = new YangElementType("YANG_BITS_SPECIFICATION");
  IElementType YANG_BIT_STMT = new YangElementType("YANG_BIT_STMT");
  IElementType YANG_BODY_STMTS = new YangElementType("YANG_BODY_STMTS");
  IElementType YANG_CASE_STMT = new YangElementType("YANG_CASE_STMT");
  IElementType YANG_CHOICE_STMT = new YangElementType("YANG_CHOICE_STMT");
  IElementType YANG_CONFIG_ARG = new YangElementType("YANG_CONFIG_ARG");
  IElementType YANG_CONFIG_STMT = new YangElementType("YANG_CONFIG_STMT");
  IElementType YANG_CONTACT_STMT = new YangElementType("YANG_CONTACT_STMT");
  IElementType YANG_CONTAINER_STMT = new YangElementType("YANG_CONTAINER_STMT");
  IElementType YANG_DATA_DEF_STMT = new YangElementType("YANG_DATA_DEF_STMT");
  IElementType YANG_DECIMAL_64_SPECIFICATION = new YangElementType("YANG_DECIMAL_64_SPECIFICATION");
  IElementType YANG_DEFAULT_STMT = new YangElementType("YANG_DEFAULT_STMT");
  IElementType YANG_DESCRIPTION_STMT = new YangElementType("YANG_DESCRIPTION_STMT");
  IElementType YANG_DEVIATE_ADD_STMT = new YangElementType("YANG_DEVIATE_ADD_STMT");
  IElementType YANG_DEVIATE_DELETE_STMT = new YangElementType("YANG_DEVIATE_DELETE_STMT");
  IElementType YANG_DEVIATE_NOT_SUPPORTED_STMT = new YangElementType("YANG_DEVIATE_NOT_SUPPORTED_STMT");
  IElementType YANG_DEVIATE_REPLACE_STMT = new YangElementType("YANG_DEVIATE_REPLACE_STMT");
  IElementType YANG_DEVIATION_STMT = new YangElementType("YANG_DEVIATION_STMT");
  IElementType YANG_ENUM_SPECIFICATION = new YangElementType("YANG_ENUM_SPECIFICATION");
  IElementType YANG_ENUM_STMT = new YangElementType("YANG_ENUM_STMT");
  IElementType YANG_ERROR_APP_TAG_STMT = new YangElementType("YANG_ERROR_APP_TAG_STMT");
  IElementType YANG_ERROR_MESSAGE_STMT = new YangElementType("YANG_ERROR_MESSAGE_STMT");
  IElementType YANG_EXTENSION_STMT = new YangElementType("YANG_EXTENSION_STMT");
  IElementType YANG_FEATURE_STMT = new YangElementType("YANG_FEATURE_STMT");
  IElementType YANG_FRACTION_DIGITS_STMT = new YangElementType("YANG_FRACTION_DIGITS_STMT");
  IElementType YANG_GROUPING_STMT = new YangElementType("YANG_GROUPING_STMT");
  IElementType YANG_IDENTIFIER_STMT = new YangElementType("YANG_IDENTIFIER_STMT");
  IElementType YANG_IDENTITYREF_SPECIFICATION = new YangElementType("YANG_IDENTITYREF_SPECIFICATION");
  IElementType YANG_IDENTITY_STMT = new YangElementType("YANG_IDENTITY_STMT");
  IElementType YANG_IF_FEATURE_STMT = new YangElementType("YANG_IF_FEATURE_STMT");
  IElementType YANG_IMPORT_STMT = new YangElementType("YANG_IMPORT_STMT");
  IElementType YANG_INCLUDE_STMT = new YangElementType("YANG_INCLUDE_STMT");
  IElementType YANG_INPUT_STMT = new YangElementType("YANG_INPUT_STMT");
  IElementType YANG_INSTANCE_IDENTIFIER_SPECIFICATION = new YangElementType("YANG_INSTANCE_IDENTIFIER_SPECIFICATION");
  IElementType YANG_KEY_STMT = new YangElementType("YANG_KEY_STMT");
  IElementType YANG_LEAFREF_SPECIFICATION = new YangElementType("YANG_LEAFREF_SPECIFICATION");
  IElementType YANG_LEAF_LIST_STMT = new YangElementType("YANG_LEAF_LIST_STMT");
  IElementType YANG_LEAF_STMT = new YangElementType("YANG_LEAF_STMT");
  IElementType YANG_LENGTH_STMT = new YangElementType("YANG_LENGTH_STMT");
  IElementType YANG_LINKAGE_STMTS = new YangElementType("YANG_LINKAGE_STMTS");
  IElementType YANG_LIST_STMT = new YangElementType("YANG_LIST_STMT");
  IElementType YANG_MANDATORY_ARG = new YangElementType("YANG_MANDATORY_ARG");
  IElementType YANG_MANDATORY_STMT = new YangElementType("YANG_MANDATORY_STMT");
  IElementType YANG_MAX_ELEMENTS_STMT = new YangElementType("YANG_MAX_ELEMENTS_STMT");
  IElementType YANG_MAX_VALUE_ARG = new YangElementType("YANG_MAX_VALUE_ARG");
  IElementType YANG_META_STMTS = new YangElementType("YANG_META_STMTS");
  IElementType YANG_MIN_ELEMENTS_STMT = new YangElementType("YANG_MIN_ELEMENTS_STMT");
  IElementType YANG_MIN_VALUE_ARG = new YangElementType("YANG_MIN_VALUE_ARG");
  IElementType YANG_MODULE_HEADER_STMTS = new YangElementType("YANG_MODULE_HEADER_STMTS");
  IElementType YANG_MODULE_STMT = new YangElementType("YANG_MODULE_STMT");
  IElementType YANG_MUST_STMT = new YangElementType("YANG_MUST_STMT");
  IElementType YANG_NAMESPACE_STMT = new YangElementType("YANG_NAMESPACE_STMT");
  IElementType YANG_NOTIFICATION_STMT = new YangElementType("YANG_NOTIFICATION_STMT");
  IElementType YANG_NUMERICAL_RESTRICTIONS = new YangElementType("YANG_NUMERICAL_RESTRICTIONS");
  IElementType YANG_ORDERED_BY_ARG = new YangElementType("YANG_ORDERED_BY_ARG");
  IElementType YANG_ORDERED_BY_STMT = new YangElementType("YANG_ORDERED_BY_STMT");
  IElementType YANG_ORGANIZATION_STMT = new YangElementType("YANG_ORGANIZATION_STMT");
  IElementType YANG_OUTPUT_STMT = new YangElementType("YANG_OUTPUT_STMT");
  IElementType YANG_PATH_STMT = new YangElementType("YANG_PATH_STMT");
  IElementType YANG_PATTERN_STMT = new YangElementType("YANG_PATTERN_STMT");
  IElementType YANG_POSITION_STMT = new YangElementType("YANG_POSITION_STMT");
  IElementType YANG_PREFIX_STMT = new YangElementType("YANG_PREFIX_STMT");
  IElementType YANG_PRESENCE_STMT = new YangElementType("YANG_PRESENCE_STMT");
  IElementType YANG_RANGE_STMT = new YangElementType("YANG_RANGE_STMT");
  IElementType YANG_REFERENCE_STMT = new YangElementType("YANG_REFERENCE_STMT");
  IElementType YANG_REFINE_ANYXML_STMTS = new YangElementType("YANG_REFINE_ANYXML_STMTS");
  IElementType YANG_REFINE_CASE_STMTS = new YangElementType("YANG_REFINE_CASE_STMTS");
  IElementType YANG_REFINE_CHOICE_STMTS = new YangElementType("YANG_REFINE_CHOICE_STMTS");
  IElementType YANG_REFINE_CONTAINER_STMTS = new YangElementType("YANG_REFINE_CONTAINER_STMTS");
  IElementType YANG_REFINE_LEAF_LIST_STMTS = new YangElementType("YANG_REFINE_LEAF_LIST_STMTS");
  IElementType YANG_REFINE_LEAF_STMTS = new YangElementType("YANG_REFINE_LEAF_STMTS");
  IElementType YANG_REFINE_LIST_STMTS = new YangElementType("YANG_REFINE_LIST_STMTS");
  IElementType YANG_REFINE_POM = new YangElementType("YANG_REFINE_POM");
  IElementType YANG_REFINE_STMT = new YangElementType("YANG_REFINE_STMT");
  IElementType YANG_REQUIRE_INSTANCE_ARG = new YangElementType("YANG_REQUIRE_INSTANCE_ARG");
  IElementType YANG_REQUIRE_INSTANCE_STMT = new YangElementType("YANG_REQUIRE_INSTANCE_STMT");
  IElementType YANG_REVISION_DATE_STMT = new YangElementType("YANG_REVISION_DATE_STMT");
  IElementType YANG_REVISION_STMT = new YangElementType("YANG_REVISION_STMT");
  IElementType YANG_REVISION_STMTS = new YangElementType("YANG_REVISION_STMTS");
  IElementType YANG_RPC_STMT = new YangElementType("YANG_RPC_STMT");
  IElementType YANG_SHORT_CASE_STMT = new YangElementType("YANG_SHORT_CASE_STMT");
  IElementType YANG_STATUS_ARG = new YangElementType("YANG_STATUS_ARG");
  IElementType YANG_STATUS_STMT = new YangElementType("YANG_STATUS_STMT");
  IElementType YANG_STMTEND = new YangElementType("YANG_STMTEND");
  IElementType YANG_STRING = new YangElementType("YANG_STRING");
  IElementType YANG_STRING_RESTRICTIONS = new YangElementType("YANG_STRING_RESTRICTIONS");
  IElementType YANG_SUBMODULE_HEADER_STMTS = new YangElementType("YANG_SUBMODULE_HEADER_STMTS");
  IElementType YANG_SUBMODULE_STMT = new YangElementType("YANG_SUBMODULE_STMT");
  IElementType YANG_TYPEDEF_STMT = new YangElementType("YANG_TYPEDEF_STMT");
  IElementType YANG_TYPE_BODY_STMTS = new YangElementType("YANG_TYPE_BODY_STMTS");
  IElementType YANG_TYPE_STMT = new YangElementType("YANG_TYPE_STMT");
  IElementType YANG_UNION_SPECIFICATION = new YangElementType("YANG_UNION_SPECIFICATION");
  IElementType YANG_UNIQUE_STMT = new YangElementType("YANG_UNIQUE_STMT");
  IElementType YANG_UNITS_STMT = new YangElementType("YANG_UNITS_STMT");
  IElementType YANG_UNKNOWN_STATEMENT = new YangElementType("YANG_UNKNOWN_STATEMENT");
  IElementType YANG_UNKNOWN_STATEMENT_2 = new YangElementType("YANG_UNKNOWN_STATEMENT_2");
  IElementType YANG_UNKNOWN_STATEMENT_3 = new YangElementType("YANG_UNKNOWN_STATEMENT_3");
  IElementType YANG_USES_AUGMENT_STMT = new YangElementType("YANG_USES_AUGMENT_STMT");
  IElementType YANG_USES_STMT = new YangElementType("YANG_USES_STMT");
  IElementType YANG_VALUE_STMT = new YangElementType("YANG_VALUE_STMT");
  IElementType YANG_WHEN_STMT = new YangElementType("YANG_WHEN_STMT");
  IElementType YANG_YANG_VERSION_STMT = new YangElementType("YANG_YANG_VERSION_STMT");
  IElementType YANG_YIN_ELEMENT_ARG = new YangElementType("YANG_YIN_ELEMENT_ARG");
  IElementType YANG_YIN_ELEMENT_STMT = new YangElementType("YANG_YIN_ELEMENT_STMT");

  IElementType YANG_ANYXML_KEYWORD = new YangTokenType("ANYXML_KEYWORD");
  IElementType YANG_ARGUMENT_KEYWORD = new YangTokenType("ARGUMENT_KEYWORD");
  IElementType YANG_AUGMENT_KEYWORD = new YangTokenType("AUGMENT_KEYWORD");
  IElementType YANG_BASE_KEYWORD = new YangTokenType("BASE_KEYWORD");
  IElementType YANG_BELONGS_TO_KEYWORD = new YangTokenType("BELONGS_TO_KEYWORD");
  IElementType YANG_BIT_KEYWORD = new YangTokenType("BIT_KEYWORD");
  IElementType YANG_CASE_KEYWORD = new YangTokenType("CASE_KEYWORD");
  IElementType YANG_CHOICE_KEYWORD = new YangTokenType("CHOICE_KEYWORD");
  IElementType YANG_CONFIG_KEYWORD = new YangTokenType("CONFIG_KEYWORD");
  IElementType YANG_CONTACT_KEYWORD = new YangTokenType("CONTACT_KEYWORD");
  IElementType YANG_CONTAINER_KEYWORD = new YangTokenType("CONTAINER_KEYWORD");
  IElementType YANG_DEFAULT_KEYWORD = new YangTokenType("DEFAULT_KEYWORD");
  IElementType YANG_DESCRIPTION_KEYWORD = new YangTokenType("DESCRIPTION_KEYWORD");
  IElementType YANG_DEVIATE_KEYWORD = new YangTokenType("DEVIATE_KEYWORD");
  IElementType YANG_DEVIATION_KEYWORD = new YangTokenType("DEVIATION_KEYWORD");
  IElementType YANG_ENUM_KEYWORD = new YangTokenType("ENUM_KEYWORD");
  IElementType YANG_ERROR_APP_TAG_KEYWORD = new YangTokenType("ERROR_APP_TAG_KEYWORD");
  IElementType YANG_ERROR_MESSAGE_KEYWORD = new YangTokenType("ERROR_MESSAGE_KEYWORD");
  IElementType YANG_EXTENSION_KEYWORD = new YangTokenType("EXTENSION_KEYWORD");
  IElementType YANG_FEATURE_KEYWORD = new YangTokenType("FEATURE_KEYWORD");
  IElementType YANG_FRACTION_DIGITS_KEYWORD = new YangTokenType("FRACTION_DIGITS_KEYWORD");
  IElementType YANG_GROUPING_KEYWORD = new YangTokenType("GROUPING_KEYWORD");
  IElementType YANG_IDENTIFIER = new YangTokenType("IDENTIFIER");
  IElementType YANG_IDENTITY_KEYWORD = new YangTokenType("IDENTITY_KEYWORD");
  IElementType YANG_IF_FEATURE_KEYWORD = new YangTokenType("IF_FEATURE_KEYWORD");
  IElementType YANG_IMPORT_KEYWORD = new YangTokenType("IMPORT_KEYWORD");
  IElementType YANG_INCLUDE_KEYWORD = new YangTokenType("INCLUDE_KEYWORD");
  IElementType YANG_INPUT_KEYWORD = new YangTokenType("INPUT_KEYWORD");
  IElementType YANG_KEY_KEYWORD = new YangTokenType("KEY_KEYWORD");
  IElementType YANG_LEAF_KEYWORD = new YangTokenType("LEAF_KEYWORD");
  IElementType YANG_LEAF_LIST_KEYWORD = new YangTokenType("LEAF_LIST_KEYWORD");
  IElementType YANG_LEFT_BRACE = new YangTokenType("LEFT_BRACE");
  IElementType YANG_LENGTH_KEYWORD = new YangTokenType("LENGTH_KEYWORD");
  IElementType YANG_LIST_KEYWORD = new YangTokenType("LIST_KEYWORD");
  IElementType YANG_MANDATORY_KEYWORD = new YangTokenType("MANDATORY_KEYWORD");
  IElementType YANG_MAX_ELEMENTS_KEYWORD = new YangTokenType("MAX_ELEMENTS_KEYWORD");
  IElementType YANG_MIN_ELEMENTS_KEYWORD = new YangTokenType("MIN_ELEMENTS_KEYWORD");
  IElementType YANG_MODULE_KEYWORD = new YangTokenType("MODULE_KEYWORD");
  IElementType YANG_MUST_KEYWORD = new YangTokenType("MUST_KEYWORD");
  IElementType YANG_NAMESPACE_KEYWORD = new YangTokenType("NAMESPACE_KEYWORD");
  IElementType YANG_NOTIFICATION_KEYWORD = new YangTokenType("NOTIFICATION_KEYWORD");
  IElementType YANG_ORDERED_BY_KEYWORD = new YangTokenType("ORDERED_BY_KEYWORD");
  IElementType YANG_ORGANIZATION_KEYWORD = new YangTokenType("ORGANIZATION_KEYWORD");
  IElementType YANG_OUTPUT_KEYWORD = new YangTokenType("OUTPUT_KEYWORD");
  IElementType YANG_PATH_KEYWORD = new YangTokenType("PATH_KEYWORD");
  IElementType YANG_PATTERN_KEYWORD = new YangTokenType("PATTERN_KEYWORD");
  IElementType YANG_PLUS = new YangTokenType("PLUS");
  IElementType YANG_POSITION_KEYWORD = new YangTokenType("POSITION_KEYWORD");
  IElementType YANG_PREFIX_KEYWORD = new YangTokenType("PREFIX_KEYWORD");
  IElementType YANG_PRESENCE_KEYWORD = new YangTokenType("PRESENCE_KEYWORD");
  IElementType YANG_RANGE_KEYWORD = new YangTokenType("RANGE_KEYWORD");
  IElementType YANG_REFERENCE_KEYWORD = new YangTokenType("REFERENCE_KEYWORD");
  IElementType YANG_REFINE_KEYWORD = new YangTokenType("REFINE_KEYWORD");
  IElementType YANG_REQUIRE_INSTANCE_KEYWORD = new YangTokenType("REQUIRE_INSTANCE_KEYWORD");
  IElementType YANG_REVISION_DATE_KEYWORD = new YangTokenType("REVISION_DATE_KEYWORD");
  IElementType YANG_REVISION_KEYWORD = new YangTokenType("REVISION_KEYWORD");
  IElementType YANG_RIGHT_BRACE = new YangTokenType("RIGHT_BRACE");
  IElementType YANG_RPC_KEYWORD = new YangTokenType("RPC_KEYWORD");
  IElementType YANG_SEMICOLON = new YangTokenType("SEMICOLON");
  IElementType YANG_STATUS_KEYWORD = new YangTokenType("STATUS_KEYWORD");
  IElementType YANG_STRING_LITERAL = new YangTokenType("STRING_LITERAL");
  IElementType YANG_SUBMODULE_KEYWORD = new YangTokenType("SUBMODULE_KEYWORD");
  IElementType YANG_TYPEDEF_KEYWORD = new YangTokenType("TYPEDEF_KEYWORD");
  IElementType YANG_TYPE_KEYWORD = new YangTokenType("TYPE_KEYWORD");
  IElementType YANG_UNIQUE_KEYWORD = new YangTokenType("UNIQUE_KEYWORD");
  IElementType YANG_UNITS_KEYWORD = new YangTokenType("UNITS_KEYWORD");
  IElementType YANG_USES_KEYWORD = new YangTokenType("USES_KEYWORD");
  IElementType YANG_VALUE_KEYWORD = new YangTokenType("VALUE_KEYWORD");
  IElementType YANG_WHEN_KEYWORD = new YangTokenType("WHEN_KEYWORD");
  IElementType YANG_YANG_VERSION_KEYWORD = new YangTokenType("YANG_VERSION_KEYWORD");
  IElementType YANG_YIN_ELEMENT_KEYWORD = new YangTokenType("YIN_ELEMENT_KEYWORD");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == YANG_ANYXML_STMT) {
        return new YangAnyxmlStmtImpl(node);
      }
      else if (type == YANG_ARGUMENT_STMT) {
        return new YangArgumentStmtImpl(node);
      }
      else if (type == YANG_AUGMENT_STMT) {
        return new YangAugmentStmtImpl(node);
      }
      else if (type == YANG_BASE_STMT) {
        return new YangBaseStmtImpl(node);
      }
      else if (type == YANG_BELONGS_TO_STMT) {
        return new YangBelongsToStmtImpl(node);
      }
      else if (type == YANG_BITS_SPECIFICATION) {
        return new YangBitsSpecificationImpl(node);
      }
      else if (type == YANG_BIT_STMT) {
        return new YangBitStmtImpl(node);
      }
      else if (type == YANG_BODY_STMTS) {
        return new YangBodyStmtsImpl(node);
      }
      else if (type == YANG_CASE_STMT) {
        return new YangCaseStmtImpl(node);
      }
      else if (type == YANG_CHOICE_STMT) {
        return new YangChoiceStmtImpl(node);
      }
      else if (type == YANG_CONFIG_ARG) {
        return new YangConfigArgImpl(node);
      }
      else if (type == YANG_CONFIG_STMT) {
        return new YangConfigStmtImpl(node);
      }
      else if (type == YANG_CONTACT_STMT) {
        return new YangContactStmtImpl(node);
      }
      else if (type == YANG_CONTAINER_STMT) {
        return new YangContainerStmtImpl(node);
      }
      else if (type == YANG_DATA_DEF_STMT) {
        return new YangDataDefStmtImpl(node);
      }
      else if (type == YANG_DECIMAL_64_SPECIFICATION) {
        return new YangDecimal64SpecificationImpl(node);
      }
      else if (type == YANG_DEFAULT_STMT) {
        return new YangDefaultStmtImpl(node);
      }
      else if (type == YANG_DESCRIPTION_STMT) {
        return new YangDescriptionStmtImpl(node);
      }
      else if (type == YANG_DEVIATE_ADD_STMT) {
        return new YangDeviateAddStmtImpl(node);
      }
      else if (type == YANG_DEVIATE_DELETE_STMT) {
        return new YangDeviateDeleteStmtImpl(node);
      }
      else if (type == YANG_DEVIATE_NOT_SUPPORTED_STMT) {
        return new YangDeviateNotSupportedStmtImpl(node);
      }
      else if (type == YANG_DEVIATE_REPLACE_STMT) {
        return new YangDeviateReplaceStmtImpl(node);
      }
      else if (type == YANG_DEVIATION_STMT) {
        return new YangDeviationStmtImpl(node);
      }
      else if (type == YANG_ENUM_SPECIFICATION) {
        return new YangEnumSpecificationImpl(node);
      }
      else if (type == YANG_ENUM_STMT) {
        return new YangEnumStmtImpl(node);
      }
      else if (type == YANG_ERROR_APP_TAG_STMT) {
        return new YangErrorAppTagStmtImpl(node);
      }
      else if (type == YANG_ERROR_MESSAGE_STMT) {
        return new YangErrorMessageStmtImpl(node);
      }
      else if (type == YANG_EXTENSION_STMT) {
        return new YangExtensionStmtImpl(node);
      }
      else if (type == YANG_FEATURE_STMT) {
        return new YangFeatureStmtImpl(node);
      }
      else if (type == YANG_FRACTION_DIGITS_STMT) {
        return new YangFractionDigitsStmtImpl(node);
      }
      else if (type == YANG_GROUPING_STMT) {
        return new YangGroupingStmtImpl(node);
      }
      else if (type == YANG_IDENTIFIER_STMT) {
        return new YangIdentifierStmtImpl(node);
      }
      else if (type == YANG_IDENTITYREF_SPECIFICATION) {
        return new YangIdentityrefSpecificationImpl(node);
      }
      else if (type == YANG_IDENTITY_STMT) {
        return new YangIdentityStmtImpl(node);
      }
      else if (type == YANG_IF_FEATURE_STMT) {
        return new YangIfFeatureStmtImpl(node);
      }
      else if (type == YANG_IMPORT_STMT) {
        return new YangImportStmtImpl(node);
      }
      else if (type == YANG_INCLUDE_STMT) {
        return new YangIncludeStmtImpl(node);
      }
      else if (type == YANG_INPUT_STMT) {
        return new YangInputStmtImpl(node);
      }
      else if (type == YANG_INSTANCE_IDENTIFIER_SPECIFICATION) {
        return new YangInstanceIdentifierSpecificationImpl(node);
      }
      else if (type == YANG_KEY_STMT) {
        return new YangKeyStmtImpl(node);
      }
      else if (type == YANG_LEAFREF_SPECIFICATION) {
        return new YangLeafrefSpecificationImpl(node);
      }
      else if (type == YANG_LEAF_LIST_STMT) {
        return new YangLeafListStmtImpl(node);
      }
      else if (type == YANG_LEAF_STMT) {
        return new YangLeafStmtImpl(node);
      }
      else if (type == YANG_LENGTH_STMT) {
        return new YangLengthStmtImpl(node);
      }
      else if (type == YANG_LINKAGE_STMTS) {
        return new YangLinkageStmtsImpl(node);
      }
      else if (type == YANG_LIST_STMT) {
        return new YangListStmtImpl(node);
      }
      else if (type == YANG_MANDATORY_ARG) {
        return new YangMandatoryArgImpl(node);
      }
      else if (type == YANG_MANDATORY_STMT) {
        return new YangMandatoryStmtImpl(node);
      }
      else if (type == YANG_MAX_ELEMENTS_STMT) {
        return new YangMaxElementsStmtImpl(node);
      }
      else if (type == YANG_MAX_VALUE_ARG) {
        return new YangMaxValueArgImpl(node);
      }
      else if (type == YANG_META_STMTS) {
        return new YangMetaStmtsImpl(node);
      }
      else if (type == YANG_MIN_ELEMENTS_STMT) {
        return new YangMinElementsStmtImpl(node);
      }
      else if (type == YANG_MIN_VALUE_ARG) {
        return new YangMinValueArgImpl(node);
      }
      else if (type == YANG_MODULE_HEADER_STMTS) {
        return new YangModuleHeaderStmtsImpl(node);
      }
      else if (type == YANG_MODULE_STMT) {
        return new YangModuleStmtImpl(node);
      }
      else if (type == YANG_MUST_STMT) {
        return new YangMustStmtImpl(node);
      }
      else if (type == YANG_NAMESPACE_STMT) {
        return new YangNamespaceStmtImpl(node);
      }
      else if (type == YANG_NOTIFICATION_STMT) {
        return new YangNotificationStmtImpl(node);
      }
      else if (type == YANG_NUMERICAL_RESTRICTIONS) {
        return new YangNumericalRestrictionsImpl(node);
      }
      else if (type == YANG_ORDERED_BY_ARG) {
        return new YangOrderedByArgImpl(node);
      }
      else if (type == YANG_ORDERED_BY_STMT) {
        return new YangOrderedByStmtImpl(node);
      }
      else if (type == YANG_ORGANIZATION_STMT) {
        return new YangOrganizationStmtImpl(node);
      }
      else if (type == YANG_OUTPUT_STMT) {
        return new YangOutputStmtImpl(node);
      }
      else if (type == YANG_PATH_STMT) {
        return new YangPathStmtImpl(node);
      }
      else if (type == YANG_PATTERN_STMT) {
        return new YangPatternStmtImpl(node);
      }
      else if (type == YANG_POSITION_STMT) {
        return new YangPositionStmtImpl(node);
      }
      else if (type == YANG_PREFIX_STMT) {
        return new YangPrefixStmtImpl(node);
      }
      else if (type == YANG_PRESENCE_STMT) {
        return new YangPresenceStmtImpl(node);
      }
      else if (type == YANG_RANGE_STMT) {
        return new YangRangeStmtImpl(node);
      }
      else if (type == YANG_REFERENCE_STMT) {
        return new YangReferenceStmtImpl(node);
      }
      else if (type == YANG_REFINE_ANYXML_STMTS) {
        return new YangRefineAnyxmlStmtsImpl(node);
      }
      else if (type == YANG_REFINE_CASE_STMTS) {
        return new YangRefineCaseStmtsImpl(node);
      }
      else if (type == YANG_REFINE_CHOICE_STMTS) {
        return new YangRefineChoiceStmtsImpl(node);
      }
      else if (type == YANG_REFINE_CONTAINER_STMTS) {
        return new YangRefineContainerStmtsImpl(node);
      }
      else if (type == YANG_REFINE_LEAF_LIST_STMTS) {
        return new YangRefineLeafListStmtsImpl(node);
      }
      else if (type == YANG_REFINE_LEAF_STMTS) {
        return new YangRefineLeafStmtsImpl(node);
      }
      else if (type == YANG_REFINE_LIST_STMTS) {
        return new YangRefineListStmtsImpl(node);
      }
      else if (type == YANG_REFINE_POM) {
        return new YangRefinePomImpl(node);
      }
      else if (type == YANG_REFINE_STMT) {
        return new YangRefineStmtImpl(node);
      }
      else if (type == YANG_REQUIRE_INSTANCE_ARG) {
        return new YangRequireInstanceArgImpl(node);
      }
      else if (type == YANG_REQUIRE_INSTANCE_STMT) {
        return new YangRequireInstanceStmtImpl(node);
      }
      else if (type == YANG_REVISION_DATE_STMT) {
        return new YangRevisionDateStmtImpl(node);
      }
      else if (type == YANG_REVISION_STMT) {
        return new YangRevisionStmtImpl(node);
      }
      else if (type == YANG_REVISION_STMTS) {
        return new YangRevisionStmtsImpl(node);
      }
      else if (type == YANG_RPC_STMT) {
        return new YangRpcStmtImpl(node);
      }
      else if (type == YANG_SHORT_CASE_STMT) {
        return new YangShortCaseStmtImpl(node);
      }
      else if (type == YANG_STATUS_ARG) {
        return new YangStatusArgImpl(node);
      }
      else if (type == YANG_STATUS_STMT) {
        return new YangStatusStmtImpl(node);
      }
      else if (type == YANG_STMTEND) {
        return new YangStmtendImpl(node);
      }
      else if (type == YANG_STRING) {
        return new YangStringImpl(node);
      }
      else if (type == YANG_STRING_RESTRICTIONS) {
        return new YangStringRestrictionsImpl(node);
      }
      else if (type == YANG_SUBMODULE_HEADER_STMTS) {
        return new YangSubmoduleHeaderStmtsImpl(node);
      }
      else if (type == YANG_SUBMODULE_STMT) {
        return new YangSubmoduleStmtImpl(node);
      }
      else if (type == YANG_TYPEDEF_STMT) {
        return new YangTypedefStmtImpl(node);
      }
      else if (type == YANG_TYPE_BODY_STMTS) {
        return new YangTypeBodyStmtsImpl(node);
      }
      else if (type == YANG_TYPE_STMT) {
        return new YangTypeStmtImpl(node);
      }
      else if (type == YANG_UNION_SPECIFICATION) {
        return new YangUnionSpecificationImpl(node);
      }
      else if (type == YANG_UNIQUE_STMT) {
        return new YangUniqueStmtImpl(node);
      }
      else if (type == YANG_UNITS_STMT) {
        return new YangUnitsStmtImpl(node);
      }
      else if (type == YANG_UNKNOWN_STATEMENT) {
        return new YangUnknownStatementImpl(node);
      }
      else if (type == YANG_UNKNOWN_STATEMENT_2) {
        return new YangUnknownStatement2Impl(node);
      }
      else if (type == YANG_UNKNOWN_STATEMENT_3) {
        return new YangUnknownStatement3Impl(node);
      }
      else if (type == YANG_USES_AUGMENT_STMT) {
        return new YangUsesAugmentStmtImpl(node);
      }
      else if (type == YANG_USES_STMT) {
        return new YangUsesStmtImpl(node);
      }
      else if (type == YANG_VALUE_STMT) {
        return new YangValueStmtImpl(node);
      }
      else if (type == YANG_WHEN_STMT) {
        return new YangWhenStmtImpl(node);
      }
      else if (type == YANG_YANG_VERSION_STMT) {
        return new YangYangVersionStmtImpl(node);
      }
      else if (type == YANG_YIN_ELEMENT_ARG) {
        return new YangYinElementArgImpl(node);
      }
      else if (type == YANG_YIN_ELEMENT_STMT) {
        return new YangYinElementStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
