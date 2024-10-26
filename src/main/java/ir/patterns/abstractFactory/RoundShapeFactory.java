package ir.patterns.abstractFactory;

public class RoundShapeFactory extends AbstractFactoryShape {
    @Override
    public Shape getShape(String type) {
        return switch (type.toLowerCase()) {
            case "rectangle" -> new RoundRectangle();
            case "square" -> new RoundSquare();
            default -> throw new RuntimeException("not found and rounded");
        };
    }
}
