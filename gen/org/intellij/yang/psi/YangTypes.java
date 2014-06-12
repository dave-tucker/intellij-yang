// This is a generated file. Not intended for manual editing.
package org.intellij.yang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.yang.psi.impl.*;

public interface YangTypes {

  IElementType YANG_ANYXML_STMT = new YangElementType("YANG_ANYXML_STMT");
  IElementType YANG_ARGUMENT_STMT = new YangElementType("YANG_ARGUMENT_STMT");
  IElementType YANG_AUGMENT_STMT = new YangElementType("YANG_AUGMENT_STMT");
  IElementType YANG_BASE_STMT = new YangElementType("YANG_BASE_STMT");
  IElementType YANG_BELONGS_TO_STMT = new YangElementType("YANG_BELONGS_TO_STMT");
  IElementType YANG_BIT_STMT = new YangElementType("YANG_BIT_STMT");
  IElementType YANG_CASE_STMT = new YangElementType("YANG_CASE_STMT");
  IElementType YANG_CHOICE_STMT = new YangElementType("YANG_CHOICE_STMT");
  IElementType YANG_COMMENT_STMT = new YangElementType("YANG_COMMENT_STMT");
  IElementType YANG_CONFIG_STMT = new YangElementType("YANG_CONFIG_STMT");
  IElementType YANG_CONTACT_STMT = new YangElementType("YANG_CONTACT_STMT");
  IElementType YANG_CONTAINER_STMT = new YangElementType("YANG_CONTAINER_STMT");
  IElementType YANG_DEFAULT_STMT = new YangElementType("YANG_DEFAULT_STMT");
  IElementType YANG_DESCRIPTION_STMT = new YangElementType("YANG_DESCRIPTION_STMT");
  IElementType YANG_DEVIATE_ADD_STMT = new YangElementType("YANG_DEVIATE_ADD_STMT");
  IElementType YANG_DEVIATE_DELETE_STMT = new YangElementType("YANG_DEVIATE_DELETE_STMT");
  IElementType YANG_DEVIATE_NOT_SUPPORTED_STMT = new YangElementType("YANG_DEVIATE_NOT_SUPPORTED_STMT");
  IElementType YANG_DEVIATE_REPLACE_STMT = new YangElementType("YANG_DEVIATE_REPLACE_STMT");
  IElementType YANG_DEVIATION_STMT = new YangElementType("YANG_DEVIATION_STMT");
  IElementType YANG_ENUM_STMT = new YangElementType("YANG_ENUM_STMT");
  IElementType YANG_ERROR_APP_TAG_STMT = new YangElementType("YANG_ERROR_APP_TAG_STMT");
  IElementType YANG_ERROR_MESSAGE_STMT = new YangElementType("YANG_ERROR_MESSAGE_STMT");
  IElementType YANG_EXTENSION_STMT = new YangElementType("YANG_EXTENSION_STMT");
  IElementType YANG_FEATURE_STMT = new YangElementType("YANG_FEATURE_STMT");
  IElementType YANG_FRACTION_DIGITS_STMT = new YangElementType("YANG_FRACTION_DIGITS_STMT");
  IElementType YANG_GROUPING_STMT = new YangElementType("YANG_GROUPING_STMT");
  IElementType YANG_IDENTIFIER_STMT = new YangElementType("YANG_IDENTIFIER_STMT");
  IElementType YANG_IDENTITY_STMT = new YangElementType("YANG_IDENTITY_STMT");
  IElementType YANG_IF_FEATURE_STMT = new YangElementType("YANG_IF_FEATURE_STMT");
  IElementType YANG_IMPORT_STMT = new YangElementType("YANG_IMPORT_STMT");
  IElementType YANG_INCLUDE_STMT = new YangElementType("YANG_INCLUDE_STMT");
  IElementType YANG_INPUT_STMT = new YangElementType("YANG_INPUT_STMT");
  IElementType YANG_KEY_STMT = new YangElementType("YANG_KEY_STMT");
  IElementType YANG_LEAF_LIST_STMT = new YangElementType("YANG_LEAF_LIST_STMT");
  IElementType YANG_LEAF_STMT = new YangElementType("YANG_LEAF_STMT");
  IElementType YANG_LENGTH_STMT = new YangElementType("YANG_LENGTH_STMT");
  IElementType YANG_LIST_STMT = new YangElementType("YANG_LIST_STMT");
  IElementType YANG_MANDATORY_STMT = new YangElementType("YANG_MANDATORY_STMT");
  IElementType YANG_MAX_ELEMENTS_STMT = new YangElementType("YANG_MAX_ELEMENTS_STMT");
  IElementType YANG_MIN_ELEMENTS_STMT = new YangElementType("YANG_MIN_ELEMENTS_STMT");
  IElementType YANG_MODULE_STMT = new YangElementType("YANG_MODULE_STMT");
  IElementType YANG_MUST_STMT = new YangElementType("YANG_MUST_STMT");
  IElementType YANG_NAMESPACE_STMT = new YangElementType("YANG_NAMESPACE_STMT");
  IElementType YANG_NOTIFICATION_STMT = new YangElementType("YANG_NOTIFICATION_STMT");
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
  IElementType YANG_REFINE_STMT = new YangElementType("YANG_REFINE_STMT");
  IElementType YANG_REQUIRE_INSTANCE_STMT = new YangElementType("YANG_REQUIRE_INSTANCE_STMT");
  IElementType YANG_REVISION_DATE_STMT = new YangElementType("YANG_REVISION_DATE_STMT");
  IElementType YANG_REVISION_STMT = new YangElementType("YANG_REVISION_STMT");
  IElementType YANG_RPC_STMT = new YangElementType("YANG_RPC_STMT");
  IElementType YANG_STATUS_STMT = new YangElementType("YANG_STATUS_STMT");
  IElementType YANG_STMTEND = new YangElementType("YANG_STMTEND");
  IElementType YANG_STRING_STMT = new YangElementType("YANG_STRING_STMT");
  IElementType YANG_SUBMODULE_STMT = new YangElementType("YANG_SUBMODULE_STMT");
  IElementType YANG_TYPEDEF_STMT = new YangElementType("YANG_TYPEDEF_STMT");
  IElementType YANG_TYPE_STMT = new YangElementType("YANG_TYPE_STMT");
  IElementType YANG_UNIQUE_STMT = new YangElementType("YANG_UNIQUE_STMT");
  IElementType YANG_UNITS_STMT = new YangElementType("YANG_UNITS_STMT");
  IElementType YANG_USES_AUGMENT_STMT = new YangElementType("YANG_USES_AUGMENT_STMT");
  IElementType YANG_USES_STMT = new YangElementType("YANG_USES_STMT");
  IElementType YANG_VALUE_STMT = new YangElementType("YANG_VALUE_STMT");
  IElementType YANG_WHEN_STMT = new YangElementType("YANG_WHEN_STMT");
  IElementType YANG_YANG_VERSION_STMT = new YangElementType("YANG_YANG_VERSION_STMT");
  IElementType YANG_YIN_ELEMENT_STMT = new YangElementType("YANG_YIN_ELEMENT_STMT");

  IElementType YANG_ADD = new YangTokenType("ADD");
  IElementType YANG_ANYXML = new YangTokenType("ANYXML");
  IElementType YANG_ARGUMENT = new YangTokenType("ARGUMENT");
  IElementType YANG_AUGMENT = new YangTokenType("AUGMENT");
  IElementType YANG_BASE = new YangTokenType("BASE");
  IElementType YANG_BELONGS_TO = new YangTokenType("BELONGS_TO");
  IElementType YANG_BIT = new YangTokenType("BIT");
  IElementType YANG_CASE = new YangTokenType("CASE");
  IElementType YANG_CHOICE = new YangTokenType("CHOICE");
  IElementType YANG_COMMENT = new YangTokenType("COMMENT");
  IElementType YANG_CONFIG = new YangTokenType("CONFIG");
  IElementType YANG_CONTACT = new YangTokenType("CONTACT");
  IElementType YANG_CONTAINER = new YangTokenType("CONTAINER");
  IElementType YANG_DEFAULT = new YangTokenType("DEFAULT");
  IElementType YANG_DELETE = new YangTokenType("DELETE");
  IElementType YANG_DESCRIPTION = new YangTokenType("DESCRIPTION");
  IElementType YANG_DEVIATE = new YangTokenType("DEVIATE");
  IElementType YANG_DEVIATION = new YangTokenType("DEVIATION");
  IElementType YANG_ENUM = new YangTokenType("ENUM");
  IElementType YANG_ERROR_APP_TAG = new YangTokenType("ERROR_APP_TAG");
  IElementType YANG_ERROR_MESSAGE = new YangTokenType("ERROR_MESSAGE");
  IElementType YANG_EXTENSION = new YangTokenType("EXTENSION");
  IElementType YANG_FEATURE = new YangTokenType("FEATURE");
  IElementType YANG_FRACTION_DIGITS = new YangTokenType("FRACTION_DIGITS");
  IElementType YANG_GROUPING = new YangTokenType("GROUPING");
  IElementType YANG_IDENTIFIER = new YangTokenType("IDENTIFIER");
  IElementType YANG_IDENTITY = new YangTokenType("IDENTITY");
  IElementType YANG_IF_FEATURE = new YangTokenType("IF_FEATURE");
  IElementType YANG_IMPORT = new YangTokenType("IMPORT");
  IElementType YANG_INCLUDE = new YangTokenType("INCLUDE");
  IElementType YANG_INPUT = new YangTokenType("INPUT");
  IElementType YANG_KEY = new YangTokenType("KEY");
  IElementType YANG_LEAF = new YangTokenType("LEAF");
  IElementType YANG_LEAF_LIST = new YangTokenType("LEAF_LIST");
  IElementType YANG_LEFT_BRACE = new YangTokenType("LEFT_BRACE");
  IElementType YANG_LENGTH = new YangTokenType("LENGTH");
  IElementType YANG_LIST = new YangTokenType("LIST");
  IElementType YANG_MANDATORY = new YangTokenType("MANDATORY");
  IElementType YANG_MAX_ELEMENTS = new YangTokenType("MAX_ELEMENTS");
  IElementType YANG_MIN_ELEMENTS = new YangTokenType("MIN_ELEMENTS");
  IElementType YANG_MODULE = new YangTokenType("MODULE");
  IElementType YANG_MUST = new YangTokenType("MUST");
  IElementType YANG_NAMESPACE = new YangTokenType("NAMESPACE");
  IElementType YANG_NOTIFICATION = new YangTokenType("NOTIFICATION");
  IElementType YANG_NOT_SUPPORTED = new YangTokenType("NOT_SUPPORTED");
  IElementType YANG_ORDERED_BY = new YangTokenType("ORDERED_BY");
  IElementType YANG_ORGANIZATION = new YangTokenType("ORGANIZATION");
  IElementType YANG_OUTPUT = new YangTokenType("OUTPUT");
  IElementType YANG_PATH = new YangTokenType("PATH");
  IElementType YANG_PATTERN = new YangTokenType("PATTERN");
  IElementType YANG_PLUS = new YangTokenType("PLUS");
  IElementType YANG_POSITION = new YangTokenType("POSITION");
  IElementType YANG_PREFIX = new YangTokenType("PREFIX");
  IElementType YANG_PRESENCE = new YangTokenType("PRESENCE");
  IElementType YANG_RANGE = new YangTokenType("RANGE");
  IElementType YANG_REFERENCE = new YangTokenType("REFERENCE");
  IElementType YANG_REFINE = new YangTokenType("REFINE");
  IElementType YANG_REPLACE = new YangTokenType("REPLACE");
  IElementType YANG_REQUIRE_INSTANCE = new YangTokenType("REQUIRE_INSTANCE");
  IElementType YANG_REVISION = new YangTokenType("REVISION");
  IElementType YANG_REVISION_DATE = new YangTokenType("REVISION_DATE");
  IElementType YANG_RIGHT_BRACE = new YangTokenType("RIGHT_BRACE");
  IElementType YANG_RPC = new YangTokenType("RPC");
  IElementType YANG_SEMICOLON = new YangTokenType("SEMICOLON");
  IElementType YANG_STATUS = new YangTokenType("STATUS");
  IElementType YANG_STRING = new YangTokenType("STRING");
  IElementType YANG_SUBMODULE = new YangTokenType("SUBMODULE");
  IElementType YANG_TYPE = new YangTokenType("TYPE");
  IElementType YANG_TYPEDEF = new YangTokenType("TYPEDEF");
  IElementType YANG_UNIQUE = new YangTokenType("UNIQUE");
  IElementType YANG_UNITS = new YangTokenType("UNITS");
  IElementType YANG_USES = new YangTokenType("USES");
  IElementType YANG_VALUE = new YangTokenType("VALUE");
  IElementType YANG_WHEN = new YangTokenType("WHEN");
  IElementType YANG_YANG_VERSION = new YangTokenType("YANG_VERSION");
  IElementType YANG_YIN_ELEMENT = new YangTokenType("YIN_ELEMENT");

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
      else if (type == YANG_BIT_STMT) {
        return new YangBitStmtImpl(node);
      }
      else if (type == YANG_CASE_STMT) {
        return new YangCaseStmtImpl(node);
      }
      else if (type == YANG_CHOICE_STMT) {
        return new YangChoiceStmtImpl(node);
      }
      else if (type == YANG_COMMENT_STMT) {
        return new YangCommentStmtImpl(node);
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
      else if (type == YANG_KEY_STMT) {
        return new YangKeyStmtImpl(node);
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
      else if (type == YANG_LIST_STMT) {
        return new YangListStmtImpl(node);
      }
      else if (type == YANG_MANDATORY_STMT) {
        return new YangMandatoryStmtImpl(node);
      }
      else if (type == YANG_MAX_ELEMENTS_STMT) {
        return new YangMaxElementsStmtImpl(node);
      }
      else if (type == YANG_MIN_ELEMENTS_STMT) {
        return new YangMinElementsStmtImpl(node);
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
      else if (type == YANG_REFINE_STMT) {
        return new YangRefineStmtImpl(node);
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
      else if (type == YANG_RPC_STMT) {
        return new YangRpcStmtImpl(node);
      }
      else if (type == YANG_STATUS_STMT) {
        return new YangStatusStmtImpl(node);
      }
      else if (type == YANG_STMTEND) {
        return new YangStmtendImpl(node);
      }
      else if (type == YANG_STRING_STMT) {
        return new YangStringStmtImpl(node);
      }
      else if (type == YANG_SUBMODULE_STMT) {
        return new YangSubmoduleStmtImpl(node);
      }
      else if (type == YANG_TYPEDEF_STMT) {
        return new YangTypedefStmtImpl(node);
      }
      else if (type == YANG_TYPE_STMT) {
        return new YangTypeStmtImpl(node);
      }
      else if (type == YANG_UNIQUE_STMT) {
        return new YangUniqueStmtImpl(node);
      }
      else if (type == YANG_UNITS_STMT) {
        return new YangUnitsStmtImpl(node);
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
      else if (type == YANG_YIN_ELEMENT_STMT) {
        return new YangYinElementStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
