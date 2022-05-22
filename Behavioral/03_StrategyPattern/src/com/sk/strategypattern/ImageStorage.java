package com.sk.strategypattern;

import com.sk.strategypattern.compress.Compressor;
import com.sk.strategypattern.filter.Filter;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter){
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
