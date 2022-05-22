package com.sk.statepattern;

import com.sk.statepattern.abuse.Stopwatch;
import com.sk.statepattern.canvas.Canvas;
import com.sk.statepattern.canvas.tool.BrushTool;
import com.sk.statepattern.canvas.tool.EraserTool;
import com.sk.statepattern.canvas.tool.SelectionTool;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

        System.out.println("************************");
        // ABUSE

        var stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
    }
}
