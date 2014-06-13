package com.intellij.lang.yang;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.util.ProcessingContext;
import com.intellij.lang.yang.psi.YangFile;
import org.jetbrains.annotations.NotNull;

import static com.intellij.patterns.PlatformPatterns.psiElement;
import static com.intellij.patterns.StandardPatterns.instanceOf;

public class YangCompletionContributor extends CompletionContributor {
    public YangCompletionContributor() {
        extend(CompletionType.BASIC,
                psiElement().inFile(instanceOf(YangFile.class)),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("anyxml"));
                        resultSet.addElement(LookupElementBuilder.create("argument"));
                        resultSet.addElement(LookupElementBuilder.create("augment"));
                        resultSet.addElement(LookupElementBuilder.create("base"));
                        resultSet.addElement(LookupElementBuilder.create("belongs-to"));
                        resultSet.addElement(LookupElementBuilder.create("bit"));
                        resultSet.addElement(LookupElementBuilder.create("case"));
                        resultSet.addElement(LookupElementBuilder.create("choice"));
                        resultSet.addElement(LookupElementBuilder.create("config"));
                        resultSet.addElement(LookupElementBuilder.create("contact"));
                        resultSet.addElement(LookupElementBuilder.create("container"));
                        resultSet.addElement(LookupElementBuilder.create("default"));
                        resultSet.addElement(LookupElementBuilder.create("description"));
                        resultSet.addElement(LookupElementBuilder.create("enum"));
                        resultSet.addElement(LookupElementBuilder.create("error-app_tag"));
                        resultSet.addElement(LookupElementBuilder.create("error-message"));
                        resultSet.addElement(LookupElementBuilder.create("extension"));
                        resultSet.addElement(LookupElementBuilder.create("deviation"));
                        resultSet.addElement(LookupElementBuilder.create("deviate"));
                        resultSet.addElement(LookupElementBuilder.create("feature"));
                        resultSet.addElement(LookupElementBuilder.create("fraction-digits"));
                        resultSet.addElement(LookupElementBuilder.create("grouping"));
                        resultSet.addElement(LookupElementBuilder.create("identity"));
                        resultSet.addElement(LookupElementBuilder.create("if-feature"));
                        resultSet.addElement(LookupElementBuilder.create("import"));
                        resultSet.addElement(LookupElementBuilder.create("include"));
                        resultSet.addElement(LookupElementBuilder.create("input"));
                        resultSet.addElement(LookupElementBuilder.create("key"));
                        resultSet.addElement(LookupElementBuilder.create("leaf"));
                        resultSet.addElement(LookupElementBuilder.create("leaf-list"));
                        resultSet.addElement(LookupElementBuilder.create("length"));
                        resultSet.addElement(LookupElementBuilder.create("list"));
                        resultSet.addElement(LookupElementBuilder.create("mandatory"));
                        resultSet.addElement(LookupElementBuilder.create("max-elements"));
                        resultSet.addElement(LookupElementBuilder.create("min-elements"));
                        resultSet.addElement(LookupElementBuilder.create("module"));
                        resultSet.addElement(LookupElementBuilder.create("must"));
                        resultSet.addElement(LookupElementBuilder.create("namespace"));
                        resultSet.addElement(LookupElementBuilder.create("notification"));
                        resultSet.addElement(LookupElementBuilder.create("ordered-by"));
                        resultSet.addElement(LookupElementBuilder.create("organization"));
                        resultSet.addElement(LookupElementBuilder.create("output"));
                        resultSet.addElement(LookupElementBuilder.create("path"));
                        resultSet.addElement(LookupElementBuilder.create("pattern"));
                        resultSet.addElement(LookupElementBuilder.create("position"));
                        resultSet.addElement(LookupElementBuilder.create("prefix"));
                        resultSet.addElement(LookupElementBuilder.create("presence"));
                        resultSet.addElement(LookupElementBuilder.create("range"));
                        resultSet.addElement(LookupElementBuilder.create("reference"));
                        resultSet.addElement(LookupElementBuilder.create("refine"));
                        resultSet.addElement(LookupElementBuilder.create("require-instance"));
                        resultSet.addElement(LookupElementBuilder.create("revision"));
                        resultSet.addElement(LookupElementBuilder.create("revision-date"));
                        resultSet.addElement(LookupElementBuilder.create("rpc"));
                        resultSet.addElement(LookupElementBuilder.create("status"));
                        resultSet.addElement(LookupElementBuilder.create("submodule"));
                        resultSet.addElement(LookupElementBuilder.create("type"));
                        resultSet.addElement(LookupElementBuilder.create("typedef"));
                        resultSet.addElement(LookupElementBuilder.create("unique"));
                        resultSet.addElement(LookupElementBuilder.create("units"));
                        resultSet.addElement(LookupElementBuilder.create("uses"));
                        resultSet.addElement(LookupElementBuilder.create("value"));
                        resultSet.addElement(LookupElementBuilder.create("when"));
                        resultSet.addElement(LookupElementBuilder.create("yang-version"));
                        resultSet.addElement(LookupElementBuilder.create("yin-element"));
                        resultSet.addElement(LookupElementBuilder.create("add"));
                        resultSet.addElement(LookupElementBuilder.create("delete"));
                        resultSet.addElement(LookupElementBuilder.create("replace"));
                    }
                }
        );
    }
}