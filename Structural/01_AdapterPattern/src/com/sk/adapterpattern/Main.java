package com.sk.adapterpattern;

import com.sk.adapterpattern.tplfilters.Caramel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilterAdapter(new Caramel()));
    }
}
