package com.sk.mediatorpattern;

import com.sk.mediatorpattern.ui.ArticlesDialogBox;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
