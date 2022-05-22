package com.sk.visitorpattern.node;

import com.sk.visitorpattern.operation.Operation;

public class HeadingNode implements HtmlNode{

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
