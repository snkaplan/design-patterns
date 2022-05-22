package com.sk.proxypattern;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Ebook> books = new HashMap<>();
    public void add(Ebook ebook){
        books.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName){
        books.get(fileName).show();
    }
}
