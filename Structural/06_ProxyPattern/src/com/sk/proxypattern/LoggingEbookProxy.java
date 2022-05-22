package com.sk.proxypattern;

public class LoggingEbookProxy implements Ebook {
    private String fileName;
    private Ebook ebook;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null) {
            ebook = new RealEbook(fileName);
        }
        System.out.println("Logging ebook");
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
