import javax.swing.*;

public class Main {
    class createFromFiles {
        public createFromFiles(String firstName, String lastName, int age, String SSN, String phoneNumber, String streetAddress, double checkingsBalance, double savingsBalance, double creditLine, double creditUsed) {

        }
    }


    public static void main(String[] args) {
        Person Max = new Person("Max", "Raymond", 20, "2323423", "860-461-8828", "11 Glenwood Road");
        Max.JSONWriter();
        Bank maxAccount = new Bank(Max, 1234.1, 22223.3, 1500.0, 222);
        maxAccount.JSONWriter();

    }
}