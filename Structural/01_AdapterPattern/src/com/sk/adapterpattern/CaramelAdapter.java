package com.sk.adapterpattern;

import com.sk.adapterpattern.tplfilters.Caramel;

//Inheritance way
public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
