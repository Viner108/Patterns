package refactoring_guru.structurи.bridge.example.example.remotes;

import refactoring_guru.structurи.bridge.example.example.devices.Device;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device){
        super.device=device;
    }
    public void mute(){
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
