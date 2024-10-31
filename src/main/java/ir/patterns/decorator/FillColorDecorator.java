package ir.patterns.decorator;

import java.awt.*;

public class FillColorDecorator extends ShapeDecorator {
    private Color color;
    public FillColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Fill color: " + color);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }
}
