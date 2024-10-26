package ir.patterns.factory;

public class ShapeFactory {
    public Shape getShape(String type){
        return switch (type.toLowerCase()) {
            case "rectangle" -> new Rectangle();
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> throw new RuntimeException("not found");
        };
    }
}
