package com.sk.commandpattern.compositecommand;

import com.sk.commandpattern.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
