package ir.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
//this is our composite class
    //this class is not a shape like circle but it does some operation on its children

    private List<Shape> children;

    public CompoundShape() {
        this.children = new ArrayList<>();
    }

    public void add(Shape shape){
        this.children.add(shape);
    }
    public void remove(Shape shape){
        this.children.remove(shape);
    }

    @Override
    public void move(int x, int y) {
        for (Shape child : children) {
            child.move(x,y);
        }
    }

    @Override
    public void draw() {
        for (Shape child : children) {
            child.draw();
        }
    }
}
