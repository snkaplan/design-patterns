package com.sk.adapterpattern;

import com.sk.adapterpattern.tplfilters.Caramel;

// Composition way(has a).
// Better than inheritance.
public class CaramelFilterAdapter implements Filter{
    private final Caramel caramel;

    public CaramelFilterAdapter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        System.out.println("Caramel filter adapter applying");
        caramel.init();
        caramel.render(image);
    }
}
