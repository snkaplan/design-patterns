package com.sk.observerpattern;

public class SpreadSheet implements Observer{
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // push style
    @Override
    public void updatePush(int value) {
        System.out.println("Spreadsheet got notified with push style: " + value);
    }

    @Override
    public void updatePull() {
        System.out.println("Spreadsheet got notified with pull style: " + dataSource.getValue());
    }
}
