package ir.patterns.bridge;

public interface Device {
    // this is our device class for all our devices

    boolean isEnable();
    void turnOff();
    void turnOn();
    void setChanel(int chanel);
    int getChanel();
    void setVolume(int volume);
    int getVolume();
    void printStatus();
}
