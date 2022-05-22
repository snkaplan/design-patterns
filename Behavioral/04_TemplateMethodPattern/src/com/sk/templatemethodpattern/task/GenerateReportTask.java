package com.sk.templatemethodpattern.task;

import com.sk.templatemethodpattern.AuditTrail;

public class GenerateReportTask extends Task {

    public GenerateReportTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Generate report");
    }

}
