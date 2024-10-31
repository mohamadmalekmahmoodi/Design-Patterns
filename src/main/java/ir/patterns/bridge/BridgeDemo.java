package ir.patterns.bridge;

public class BridgeDemo {
    public static void main(String[] args) {

        Device tv = new TV();
        BasicRemote tvRemote = new BasicRemote(tv);

        tvRemote.power();
        tvRemote.chanelUp();
        tvRemote.volumeUp();
        tv.printStatus();

        System.out.println("*********************************");

        Device radio = new Radio();
        BasicRemote radioRemote = new BasicRemote(radio);
        radioRemote.power();
        radioRemote.chanelUp();
        radioRemote.volumeUp();
        radio.printStatus();

    }
}
