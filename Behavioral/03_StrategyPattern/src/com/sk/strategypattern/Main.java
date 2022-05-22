package com.sk.strategypattern;

import com.sk.strategypattern.compress.JpegCompressor;
import com.sk.strategypattern.compress.PngCompressor;
import com.sk.strategypattern.filter.BlackAndWhiteFilter;
import com.sk.strategypattern.filter.HighContrast;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new PngCompressor(), new HighContrast());
    }
}
