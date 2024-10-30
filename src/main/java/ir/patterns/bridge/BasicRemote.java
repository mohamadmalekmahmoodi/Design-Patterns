package ir.patterns.bridge;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isEnable()){
            device.turnOff();
        }else
            device.turnOn();
    }

    @Override
    public void chanelUp() {
        device.setChanel(device.getChanel() + 1);
    }

    @Override
    public void chanelDown() {
        device.setChanel(device.getChanel() -1);
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 5);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() -5);
    }
}
