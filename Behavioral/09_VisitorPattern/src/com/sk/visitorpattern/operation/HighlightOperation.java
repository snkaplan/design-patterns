package com.sk.visitorpattern.operation;

import com.sk.visitorpattern.node.AnchorNode;
import com.sk.visitorpattern.node.HeadingNode;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("highlight-heading");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("highlight-anchor");
    }
}
