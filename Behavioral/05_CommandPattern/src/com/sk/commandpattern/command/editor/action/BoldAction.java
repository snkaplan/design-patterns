package com.sk.commandpattern.command.editor.action;

import com.sk.commandpattern.command.editor.History;
import com.sk.commandpattern.command.editor.HtmlEditor;

public class BoldAction implements UndoableAction {
    private String prevContent;
    private HtmlEditor htmlEditor;
    private History history;

    public BoldAction(HtmlEditor htmlEditor, History history) {
        this.htmlEditor = htmlEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = htmlEditor.getContent();
        htmlEditor.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        htmlEditor.setContent(prevContent);
    }
}
