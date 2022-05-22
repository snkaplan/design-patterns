package com.sk.flyweightpattern;

public class Main {
    // With flyweight, we can reduce memory usage of application
    // If we have thousands of points in memory, and we try to draw all of them app will be crashed
    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        for(var point: service.getPoints()){
            point.draw();
        }
    }
}
