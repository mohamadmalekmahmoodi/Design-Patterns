package ir.patterns.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {

    //in this log method they choose to give the work to the next chain or not
    //and if yes next chain will log(does ita job)

    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    public void log(String message, int level) {
        if (level >= this.level){
            System.out.println("console :: " + message);
        }
        next(message,level);
    }
}
