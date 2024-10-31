package ir.patterns.decorator;

public class BorderStyleDecorator extends ShapeDecorator {
    private LineStyle lineStyle;
    public BorderStyleDecorator(Shape decoratedShape, LineStyle lineStyle) {
        super(decoratedShape);
        this.lineStyle = lineStyle;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Border style: " + lineStyle);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }
}
