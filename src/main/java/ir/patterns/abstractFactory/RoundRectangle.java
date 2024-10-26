package ir.patterns.abstractFactory;

public class RoundRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("inside RoundRectangle");
    }
}
