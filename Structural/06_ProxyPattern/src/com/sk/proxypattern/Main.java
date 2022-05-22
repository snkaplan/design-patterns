package com.sk.proxypattern;

// Proxy pattern provides us a lazy initialization. When the app starts all books loaded but with proxy a book will be loaded
// when its needed, but it's not the main point of proxy.
// Proxy forwards us to our real object
public class Main {

    public static void main(String[] args) {
        // write your code here
        var library = new Library();
        String[] fileNames = {"a", "b", "c", "d"};
        for (var fileName : fileNames) {
            library.add(new LoggingEbookProxy(fileName));
        }
        library.openEbook("c");
    }
}
