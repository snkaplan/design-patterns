package com.sk.mementopattern;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();
    public void push(EditorState state){
        states.add(state);
    }
    public EditorState pop(){
        var lastIndex = states.size() - 1;
        var lastItem = states.get(lastIndex);
        states.remove(lastItem);
        return lastItem;
    }
}
