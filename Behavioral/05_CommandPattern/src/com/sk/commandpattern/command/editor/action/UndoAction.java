package com.sk.commandpattern.command.editor.action;

import com.sk.commandpattern.command.editor.History;

public class UndoAction implements Action {
    private History history;

    public UndoAction(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0) {
            history.pop().unexecute();
        }
    }
}
