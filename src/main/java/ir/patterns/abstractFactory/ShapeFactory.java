package ir.patterns.abstractFactory;

public class ShapeFactory extends AbstractFactoryShape {
    @Override
    public Shape getShape(String type) {
        return switch (type.toLowerCase()) {
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> throw new RuntimeException("not found");
        };
    }
}
