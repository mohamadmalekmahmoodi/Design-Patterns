package ir.patterns.decorator;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }

    @Override
    public void resize() {
        System.out.println("resizing rectangle");
    }
}
