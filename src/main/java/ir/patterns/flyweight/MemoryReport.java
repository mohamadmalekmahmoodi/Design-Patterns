package ir.patterns.flyweight;

public class MemoryReport {
    private static int totlaSize = 0;

    public static void calculate(int objectSize){
        totlaSize = objectSize;
    }

    public static void print(){
        System.out.println("total memory consumed by trees = "+(totlaSize / 1024) + "MB");
    }
}
