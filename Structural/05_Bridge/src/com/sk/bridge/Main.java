package com.sk.bridge;

import com.sk.bridge.device.SamsungTv;
import com.sk.bridge.device.SonyTv;
import com.sk.bridge.remotecontrol.AdvancedRemoteControl;
import com.sk.bridge.remotecontrol.RemoteControl;

// In this pattern there is a bridge between independent two separate hierarchy
public class Main {

    public static void main(String[] args) {
	// write your code here
        var remote = new AdvancedRemoteControl(new SonyTv());
        var remoteSamsung = new RemoteControl(new SamsungTv());
        remote.turnOn();
        remote.setChannel(5);
        remote.turnOff();
        remoteSamsung.turnOn();
        remoteSamsung.turnOff();
    }
}
