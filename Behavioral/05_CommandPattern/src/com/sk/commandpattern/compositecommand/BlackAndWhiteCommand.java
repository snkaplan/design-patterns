package com.sk.commandpattern.compositecommand;

import com.sk.commandpattern.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White");
    }
}
