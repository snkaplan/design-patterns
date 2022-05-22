package com.sk.visitorpattern.operation;

import com.sk.visitorpattern.node.AnchorNode;
import com.sk.visitorpattern.node.HeadingNode;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("text-heading");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("text-anchor");
    }
}
