package ir.patterns.abstractFactory;

public class ShapeFactoryProducer {
    public AbstractFactoryShape getFactory(boolean rounded){
        if (rounded){
            return new RoundShapeFactory();
        }else
            return new ShapeFactory();
    }
}
