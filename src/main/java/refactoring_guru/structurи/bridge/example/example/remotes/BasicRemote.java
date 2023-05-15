package refactoring_guru.structurи.bridge.example.example.remotes;

import refactoring_guru.structurи.bridge.example.example.devices.Device;

public class BasicRemote implements Remote{
    protected Device device;
    public BasicRemote(){}
    public BasicRemote(Device device){
        this.device=device;
    }
    public void power(){
        System.out.println("Remole: power toggle");
        if (device.isEnabled()){
            device.disable();
        }else {
            device.enable();
        }
    }
    public void volumeDown(){
        System.out.println("Remote: volume down");
        device.setVolume(device.getVolume()-10);
    }
    public void volumeUp(){
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume()+10);
    }
    public void channelDown(){
        System.out.println("Remote: channel down");
        device.setChannel(device.getChannel()-1);
    }
    public void channelUp(){
        System.out.println("Remote: channel up");
        device.setChannel(device.getChannel()+1);
    }
}
