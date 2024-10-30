package ir.patterns.composite;

public class Dot implements Shape {
    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
        System.out.println(String.format("move dot to (%d,%d)", x, y));
    }

    @Override
    public void draw() {
        System.out.println(String.format("draw a dot at (%d,%d)", x, y));
    }
}
