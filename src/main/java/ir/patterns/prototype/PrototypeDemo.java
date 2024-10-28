package ir.patterns.prototype;
public class PrototypeDemo {
    public static void main(String[] args) {

        //after using prototype
        SalaryProcessor processor1 = SalaryProcessorCache.getProcessor();
        processor1.setPersonName("person 1");
        processor1.calculate();

        SalaryProcessor processor2 = SalaryProcessorCache.getProcessor();
        processor2.setPersonName("person 2");
        processor2.calculate();

        System.out.println(processor1);
        System.out.println(processor2);


        //before using prototype
//        SalaryProcessor salaryProcessor = new SalaryProcessor();
//        salaryProcessor.setPersonName("person 1");
//        salaryProcessor.calculate();
//
//        SalaryProcessor salaryProcessor1 = new SalaryProcessor();
//        salaryProcessor1.setPersonName("person 2");
//        salaryProcessor1.calculate();
//
//        System.out.println(salaryProcessor);
//        System.out.println(salaryProcessor1);
    }
}
