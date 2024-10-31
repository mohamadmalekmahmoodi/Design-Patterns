package ir.patterns.decorator;

import java.awt.*;

public class BorderColorDecorator extends ShapeDecorator {
    private Color borderColor;
    public BorderColorDecorator(Shape decoratedShape, Color borderColor) {
        super(decoratedShape);
        this.borderColor = borderColor;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Border color: " + borderColor);
    }

    @Override
    public void resize() {
        decoratedShape.resize();}
}
