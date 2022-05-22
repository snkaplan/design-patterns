package com.sk.visitorpattern;

import com.sk.visitorpattern.node.AnchorNode;
import com.sk.visitorpattern.node.HeadingNode;
import com.sk.visitorpattern.operation.HighlightOperation;
import com.sk.visitorpattern.operation.PlainTextOperation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());
    }
}
