package com.sk.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType, PointIcon> pointIconCache = new HashMap<>();
    public PointIcon getPointIcon(PointType type){
        if(pointIconCache.containsKey(type)){
            return pointIconCache.get(type);
        } else {
            var icon = new PointIcon(type, null);
            pointIconCache.put(type, icon);
            return icon;
        }
    }
}
