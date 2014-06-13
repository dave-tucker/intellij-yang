package com.intellij.lang.yang.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import com.intellij.lang.yang.YangLanguage;

/**
 * Created by dave on 20/05/2014.
 */
public class YangTokenType extends IElementType {

    public YangTokenType(@NotNull @NonNls String debugName) {
        super(debugName, YangLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "YangTokenType." + super.toString();
    }
}
