package ir.patterns.singleton;

public class Singleton {
    private static Singleton instance = new Singleton();
    private static final Object LOCK = new Object();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("hello from singleton");
    }

    //another way of thread safe
    //TODO
//    public static synchronized Singleton getInstance2() {
//        if (instance == null) {
//            instance = new Singleton();
//
//        }
//        return instance;
//    }


    //second way of thread safe
    //TODO
//    public static Singleton getInstance3() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

}
