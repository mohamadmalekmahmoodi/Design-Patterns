package ir.patterns.flyweight;

import java.awt.*;

public class Tree {
    public final static int SIZE = 1;

    private int x;
    private int y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.treeType = type;
        MemoryReport.calculate(SIZE);
    }

    public void draw(Graphics g) {
        treeType.draw(g,x,y);}

}
