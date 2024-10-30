package ir.patterns.composite;

public class CompositeDemo {
    public static void main(String[] args) {

        Shape circle1 = new Circle(3, 4, 1);
        Shape circle2 = new Circle(3, 2, 1);
        Dot dot = new Dot(2, 1);

        CompoundShape shapes = new CompoundShape();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(dot);

        shapes.draw();
        shapes.move(3,4);
        shapes.draw();
    }
}
