package ir.patterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("john", "doe\n")
                .setAge(35)
                .setAddress("usa,third street in vietnam\n")
                .setEmail("johnDoeMalek@gmail.com\n")
                .setPhoneNumber("09123456783\n")
                .setNationalId("0200285335\n")
                .build();

        System.out.println(person);
    }
}
