package ir.patterns.decorator;

public abstract class ShapeDecorator implements Shape{

    //this is our decorator class, and now we must
    //write methods in this class that we want to add to the object
    //and now we add four implementation

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
}
