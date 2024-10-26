package ir.patterns.abstractFactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("inside square");
    }
}
