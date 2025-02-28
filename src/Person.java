public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String SSN;
    private String phoneNumber;
    private String streetAddress;

    public Person(String firstName, String lastName, int age, String SSN, String phoneNumber, String streetAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.SSN = SSN;
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
    }

    // Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSSN(String SSN){
        this.SSN = SSN;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }

    // Getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getSSN(){
        return SSN;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getStreetAddress(){
        return streetAddress;
    }
}
