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

package com.intellij.lang.yang.editor;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.psi.tree.IElementType;

import java.util.ArrayList;
import java.util.List;

public class YangFoldingBuilder implements FoldingBuilder {
    public FoldingDescriptor[] buildFoldRegions(ASTNode node, Document document) {

        List<FoldingDescriptor> descriptors = new ArrayList<FoldingDescriptor>();
        doAppend(node, document, descriptors);
        return descriptors.toArray(new FoldingDescriptor[descriptors.size()]);
    }

    private static ASTNode doAppend(final ASTNode node, final Document document, final List<FoldingDescriptor> descriptors) {

        IElementType elementType = node.getElementType();
        if (elementType.toString().contains("STMT")) {
            //let's fold multiline directives only
            if (document.getLineNumber(node.getStartOffset()) < document.getLineNumber(node.getTextRange().getEndOffset())) {
                descriptors.add(new FoldingDescriptor(node, node.getTextRange()));
            }
        }

        ASTNode child = node.getFirstChildNode();
        while (child != null) {
            child = doAppend(child, document, descriptors).getTreeNext();
        }

        return node;
    }

    public String getPlaceholderText(ASTNode node) {
        String text = node.getText();
        int end = text.indexOf("{");
        if ( end < 0 ) {
            int length = text.length();
            end = length > 10 ? 10 : length;
        }
        return text.substring(0, end) + "{...}";
    }

    public boolean isCollapsedByDefault(ASTNode node) {
        return false;
    }
}
