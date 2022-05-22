package com.sk.commandpattern;

import com.sk.commandpattern.command.AddCustomerCommand;
import com.sk.commandpattern.command.CustomerService;
import com.sk.commandpattern.command.editor.action.BoldAction;
import com.sk.commandpattern.command.editor.History;
import com.sk.commandpattern.command.editor.HtmlEditor;
import com.sk.commandpattern.command.editor.action.UndoAction;
import com.sk.commandpattern.compositecommand.BlackAndWhiteCommand;
import com.sk.commandpattern.compositecommand.CompositeCommand;
import com.sk.commandpattern.compositecommand.ResizeCommand;
import com.sk.commandpattern.fx.Button;
import com.sk.commandpattern.fx.Command;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);
        Button btn = new Button(command);
        btn.click();
        System.out.println("\n**********************");
        System.out.println("Composite Commands");
        // Composite commands
        var composite = new CompositeCommand();
        composite.addCommand(new ResizeCommand());
        composite.addCommand(new BlackAndWhiteCommand());
        composite.execute();
        System.out.println("\n**********************");
        System.out.println("Undoable Actions");
        var history = new History();
        var htmlEditor = new HtmlEditor();
        htmlEditor.setContent("Hello World");
        var boldAction = new BoldAction(htmlEditor, history);
        var undoAction = new UndoAction(history);
        boldAction.execute();
        System.out.println(htmlEditor.getContent());
        undoAction.execute();
        System.out.println(htmlEditor.getContent());
    }
}
