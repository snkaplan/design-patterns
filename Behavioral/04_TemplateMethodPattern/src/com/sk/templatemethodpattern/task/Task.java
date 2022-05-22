package com.sk.templatemethodpattern.task;

import com.sk.templatemethodpattern.AuditTrail;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task(){
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        doExecute();
        auditTrail.record();
    }

    protected abstract void doExecute();
}
