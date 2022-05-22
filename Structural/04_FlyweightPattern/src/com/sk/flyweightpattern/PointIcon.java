package com.sk.flyweightpattern;

public class PointIcon {
    private final PointType pointType;
    private final byte[] icon;

    public PointIcon(PointType pointType, byte[] icon) {
        this.pointType = pointType;
        this.icon = icon;
    }

    public PointType getPointType() {
        return pointType;
    }
}
