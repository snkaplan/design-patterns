package com.sk.commandpattern.command.editor.action;


public interface UndoableAction extends Action {
    void unexecute();
}
