package com.intellij.lang.yang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import com.intellij.lang.yang.icons.YangIcons;

/**
 * Created by dave on 20/05/2014.
 */
public class YangFileType extends LanguageFileType {
    public static final YangFileType INSTANCE = new YangFileType();

    private YangFileType() {
        super(YangLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Yang file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "YANG is a data modeling language used to model configuration and\n" +
                "state data manipulated by the Network Configuration Protocol\n" +
                "(NETCONF), NETCONF remote procedure calls, and NETCONF notifications.\n";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "yang";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return YangIcons.FILE;
    }
}