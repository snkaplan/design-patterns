package com.sk.visitorpattern.operation;

import com.sk.visitorpattern.node.AnchorNode;
import com.sk.visitorpattern.node.HeadingNode;

public interface Operation {
    void apply(HeadingNode headingNode);
    void apply(AnchorNode anchorNode);
}
