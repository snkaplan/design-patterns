package com.sk.commandpattern.command.editor;

import com.sk.commandpattern.command.editor.action.UndoableAction;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableAction> actions = new ArrayDeque<>();

    public void push(UndoableAction action) {
        actions.add(action);
    }

    public UndoableAction pop() {
        return actions.pop();
    }

    public int size() {
        return actions.size();
    }
}
