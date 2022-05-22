package com.sk.flyweightpattern;

public class Point {
    private int x;
    private int y;
    private PointIcon icon;

    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void draw() {
        System.out.println(icon.getPointType().name() + " at (" + x + ", " + y +")");
    }
}
