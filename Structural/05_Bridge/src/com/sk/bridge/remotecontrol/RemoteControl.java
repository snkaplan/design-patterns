package com.sk.bridge.remotecontrol;

import com.sk.bridge.device.Device;

// BasicRemoteControl turnOn, turnOf
// AdvancedRemoteControl setChannel
// MovieRemoteControl play, pause, rewind
public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}
