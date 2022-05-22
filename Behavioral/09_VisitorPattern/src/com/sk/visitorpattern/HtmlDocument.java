package com.sk.visitorpattern;

import com.sk.visitorpattern.node.HtmlNode;
import com.sk.visitorpattern.operation.Operation;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    public void execute(Operation operation) {
        for (var node : nodes) {
            node.execute(operation);
        }
    }
}
