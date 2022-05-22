package com.sk.visitorpattern.node;

import com.sk.visitorpattern.operation.Operation;

public interface HtmlNode {
    void execute(Operation operation);
}
