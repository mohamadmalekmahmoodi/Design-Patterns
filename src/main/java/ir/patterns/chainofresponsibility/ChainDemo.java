package ir.patterns.chainofresponsibility;

import java.util.logging.ConsoleHandler;

public class ChainDemo {
    public static void main(String[] args) {
        FileLogger fileLogger = new FileLogger(LoggerHandler.ERROR);
        ConsoleLogger consoleLogger = new ConsoleLogger(LoggerHandler.INFO);

        String message = "my log";

        fileLogger.log(message, LoggerHandler.ERROR);
        consoleLogger.log(message, LoggerHandler.ERROR);

        System.out.println();
        System.out.println("****************************************");
        System.out.println("this is the chain , we use it by this next method");
        System.out.println();

        LoggerHandler loggerHandler = new FileLogger(LoggerHandler.DEBUG)
                .setNext(new ConsoleLogger(LoggerHandler.INFO)
                        .setNext(new FileLogger(LoggerHandler.INFO)));
        loggerHandler.log(message,LoggerHandler.ERROR);
    }
}
