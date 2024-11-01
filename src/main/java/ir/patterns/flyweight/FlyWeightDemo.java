package ir.patterns.flyweight;

import java.awt.*;

public class FlyWeightDemo {
    private static final int CANVAS_SIZE = 500;
    private static final int TREE_TO_DRAW = 1000000;
    private static final int TREE_TYPE = 2;

    public static void main(String[] args) {

        Forest forest = new Forest();
        for(int i = 0; i < (TREE_TO_DRAW / TREE_TYPE); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak", Color.GREEN);
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak", Color.ORANGE);
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);
        report();
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private static void report() {
        System.out.println();
        System.out.println("*************** Report ****************");
        System.out.println("Memory consumption with flyweight:");
        MemoryReport.print();
        System.out.println();
        System.out.println("Memory consumption without flyweight:");
        System.out.println("Total memory consumed by trees: " + (((Tree.SIZE + TreeType.SIZE) * TREE_TO_DRAW) / 1024 / 1024) + " GB");
        System.out.println("*************** Finish ****************");
    }
}
