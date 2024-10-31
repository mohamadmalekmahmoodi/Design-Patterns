package ir.patterns.decorator;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw circle");
    }

    @Override
    public void resize() {
        System.out.println("resizing circle");
    }
}
