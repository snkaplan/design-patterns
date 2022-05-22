package com.sk.observerpattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DataSource dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var sheet3 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);
        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(sheet3);
        dataSource.addObserver(chart);
        dataSource.setValue(1);
    }
}
