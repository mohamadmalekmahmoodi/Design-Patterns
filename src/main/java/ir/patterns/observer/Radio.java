package ir.patterns.observer;

public class Radio implements Channel {

    @Override
    public void update(String news) {
        System.out.println("Radio: " + news);
    }
}
