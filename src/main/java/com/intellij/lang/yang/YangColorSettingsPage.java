package com.intellij.lang.yang;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.lang.yang.icons.YangIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class YangColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Illegal", YangSyntaxHighlighter.ILLEGAL),
            new AttributesDescriptor("Comment", YangSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("String", YangSyntaxHighlighter.STRING),
            new AttributesDescriptor("Keyword", YangSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Braces", YangSyntaxHighlighter.BRACES),
            new AttributesDescriptor("Operator", YangSyntaxHighlighter.OP_SIGN),
            new AttributesDescriptor("Semicolon", YangSyntaxHighlighter.SEMICOLON),
            new AttributesDescriptor("Unknown", YangSyntaxHighlighter.UNKNOWN)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return YangIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new YangSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "module acme-foo {\n" +
               "  namespace \"http://acme.example.com/foo\";\n" +
               "  prefix \"acfoo\";\n" +
               "\n" +
               "  list interface {\n" +
               "    key \"name\";\n" +
               "    leaf name {\n" +
               "      type string;\n" +
               "  }\n" +
               "\n" +
               "// This is a line comment \n" +
               "/*** This is a block comment ***/\n" +
               "\n" +
               "  leaf mtu {\n" +
               "    type uint32;\n" +
               "    description \"The MTU of the interface.\";\n" +
               "  }\n" +
               "\n" +
               "// This isn't supposed to be here \n" +
               "%%%%%\n" +
               "}\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Yang";
    }
}