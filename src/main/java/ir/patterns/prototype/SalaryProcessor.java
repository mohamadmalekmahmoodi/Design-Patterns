package ir.patterns.prototype;

import java.util.Random;

public class SalaryProcessor implements Cloneable{
        private String formula;
        private String personName;
        private float salary;

        public SalaryProcessor(){
                //load all settings
                System.out.println("initializing salary processor ...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            formula = "loaded formula";
                System.out.println("salary processor initialized");

        }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void calculate(){
                Random random = new Random();
                salary = random.nextFloat();
        }

        @Override
        public String toString() {
                return "SalaryProcessor{" +
                        "formula='" + formula + '\'' +
                        ", personName='" + personName + '\'' +
                        ", salary=" + salary +
                        '}';
        }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }

    /*  prototype is for the time u have a class
    that costs a lot to make an instance of it and for then u can use prototype */
}
