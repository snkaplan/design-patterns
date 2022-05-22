package com.sk.flyweightpattern;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory factory;

    public PointService(PointIconFactory factory) {
        this.factory = factory;
    }

    public List<Point> getPoints(){
        return new ArrayList<>(){
            {
                add(new Point(1, 2, factory.getPointIcon(PointType.CAFE)));
                add(new Point(3, 4, factory.getPointIcon(PointType.HOSPITAL)));
            }
        };
    }
}
