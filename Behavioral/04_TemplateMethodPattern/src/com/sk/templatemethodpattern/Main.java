package com.sk.templatemethodpattern;

import com.sk.templatemethodpattern.task.GenerateReportTask;
import com.sk.templatemethodpattern.task.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var task = new TransferMoneyTask();
        task.execute();
        var generateReportTask = new GenerateReportTask(new AuditTrail());
        generateReportTask.execute();
    }
}
