package ir.patterns.observer;

public class Tv implements Channel {

    @Override
    public void update(String news) {
        System.out.println("Tv: " + news);
    }
}
