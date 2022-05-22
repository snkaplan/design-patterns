package com.sk.observerpattern;

public class Chart implements Observer{
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // push style
    @Override
    public void updatePush(int value) {
        System.out.println("Chart got updated with push style: " + value);
    }

    @Override
    public void updatePull() {
        System.out.println("Chart got notified with pull style: " + dataSource.getValue());
    }
}
