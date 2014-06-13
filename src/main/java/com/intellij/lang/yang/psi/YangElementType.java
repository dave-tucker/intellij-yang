package com.intellij.lang.yang.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import com.intellij.lang.yang.YangLanguage;

/**
 * Created by dave on 20/05/2014.
 */
public class YangElementType extends IElementType{
    public YangElementType(@NotNull @NonNls String debugName) {
        super(debugName, YangLanguage.INSTANCE);
    }
}
