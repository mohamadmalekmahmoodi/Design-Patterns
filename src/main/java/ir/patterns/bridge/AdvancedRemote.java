package ir.patterns.bridge;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super(device);
    }

    void mute(){
        System.out.println("advanced remote:mute()");
        super.device.setVolume(0);
    }
}
