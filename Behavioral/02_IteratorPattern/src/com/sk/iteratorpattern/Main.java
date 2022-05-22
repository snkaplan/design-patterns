package com.sk.iteratorpattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        Iterator<String> iterator = history.createIterator();
        while (iterator.hasNext()){
            String current = iterator.current();
            System.out.println(current);
            iterator.next();
        }
    }
}
