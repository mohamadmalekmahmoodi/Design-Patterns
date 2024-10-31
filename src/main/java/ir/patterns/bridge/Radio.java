package ir.patterns.bridge;

public class Radio implements Device {
    private boolean enabled = false;
    private int chanel = 1;
    private int volume = 50;

    @Override
    public boolean isEnable() {
        return enabled;
    }

    @Override
    public void turnOff() {
        System.out.println("radio turned off");
        enabled = false;
    }

    @Override
    public void turnOn() {
        System.out.println("radio turned on");
        enabled = true;
    }

    @Override
    public void setChanel(int chanel) {
        System.out.println("radio chanel set to " + chanel);
        this.chanel = chanel;
    }

    @Override
    public int getChanel() {
        return chanel;
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("radio volume set to " + volume);
        if (volume < 0){
            this.volume = 0;
        }else if (volume > 100){
            this.volume = 100;
        }else
            this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void printStatus() {
        System.out.println("--------------------------");
        System.out.println("i am radio ..");
        System.out.println("the volume is " + volume);
        System.out.println("the status is " + (enabled ? "off" : "on"));
        System.out.println("the chanel is " + chanel);
    }
}
