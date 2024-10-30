package ir.patterns.bridge;

public interface Remote {
    // this class is the functionalities that our remote has
    //and we have a basic remote that implements these functionalities
    void power();
    void chanelUp();
    void chanelDown();
    void volumeUp();
    void volumeDown();
}
