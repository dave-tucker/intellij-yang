package com.intellij.lang.yang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.lang.yang.YangFileType;
import com.intellij.lang.yang.YangLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class YangFile extends PsiFileBase {
    public YangFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, YangLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return YangFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Yang File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}