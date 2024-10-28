package ir.patterns.builder;

public class Person {
    private String firstName;
    private String lastname;
    private Integer yearOfBirth;
    private String address;
    private String phoneNumber;
    private String email;
    private String nationalId;

    private Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.lastname = personBuilder.lastname;
        this.yearOfBirth = personBuilder.yearOfBirth;
        this.address = personBuilder.address;
        this.phoneNumber = personBuilder.phoneNumber;
        this.email = personBuilder.email;
        this.nationalId = personBuilder.nationalId;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", nationalId='" + nationalId + '\'' +
                '}';
    }

    public static class PersonBuilder{
        private String firstName;
        private String lastname;
        private Integer yearOfBirth;
        private String address;
        private String phoneNumber;
        private String email;
        private String nationalId;

        public PersonBuilder(String firstName, String lastname) {
            this.firstName = firstName;
            this.lastname = lastname;
        }

        public PersonBuilder setAge(Integer yearBirth){
            this.yearOfBirth = yearBirth;
            return this;
        }

        public PersonBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public PersonBuilder setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder setEmail(String email){
            this.email = email;
            return this;
        }

        public PersonBuilder setNationalId(String nationalId){
            this.nationalId = nationalId;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
