package com.sk.strategypattern.filter;

public class HighContrast implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying High Contrast filter");
    }
}
