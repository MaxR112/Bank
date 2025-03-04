import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class Bank{
    private double checkingBalance;
    private double savingsBalance;
    private double creditLine;
    private double creditUsed;
    private Person accountHolder;

    public Bank(Person accountHolder, double checkingBalance, double savingsBalance, double creditLine, double creditUsed) {
        this.accountHolder = accountHolder;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.creditLine = creditLine;
        this.creditUsed = creditUsed;
    }

    // Setters
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void setCreditLine(double creditLine) {
        this.creditLine = creditLine;
    }

    public void setCreditUsed(double creditUsed) {
        this.creditUsed = creditUsed;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getters
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double getCreditLine() {
        return creditLine;
    }

    public double getCreditUsed() {
        return creditUsed;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

}

