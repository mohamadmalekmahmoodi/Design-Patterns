package ir.patterns.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ShapeFactoryProducer shapeFactoryProducer = new ShapeFactoryProducer();
        AbstractFactoryShape abstractFactoryShape = shapeFactoryProducer.getFactory(false);
        AbstractFactoryShape factoryShape = shapeFactoryProducer.getFactory(true);

        Shape square = abstractFactoryShape.getShape("square");
        square.draw();

        Shape rectangle = abstractFactoryShape.getShape("rectangle");
        rectangle.draw();

        Shape roundedSquare = factoryShape.getShape("square");
        roundedSquare.draw();

        Shape roundedRectangle = factoryShape.getShape("rectangle");
        roundedRectangle.draw();
    }
}
