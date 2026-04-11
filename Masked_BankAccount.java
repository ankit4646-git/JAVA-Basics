import java.util.*;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String password;

    // Setters
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setPassword(String password) { this.password = password; }

    // Masked Getters
    public String getMaskedAccountNumber() {
        String s = String.valueOf(accountNumber);
        return (s.length() > 3) ? "#####" + s.substring(s.length() - 3) : s;
    }

    public String getMaskedPassword() {
        return (password != null) ? "*".repeat(password.length()) : "";
    }

    public double getBalance() { return balance; }
}

public class Masked_BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter Account Number: ");
        acc.setAccountNumber(sc.next());

        // Password Input logic
        if (System.console() != null) {
            char[] passChars = System.console().readPassword("Enter Password: ");
            acc.setPassword(new String(passChars));
        } else {
            System.out.print("Enter Password: ");
            acc.setPassword(sc.next());
        }

        acc.setBalance(200000.0);

        System.out.println("\n--- Account Deatils ---");
        System.out.println("Account Number: " + acc.getMaskedAccountNumber());
        System.out.println("Password: " + acc.getMaskedPassword());
        // Use the getter instead of acc.balance
        System.out.println("Balance: " + acc.getBalance()); 

        sc.close();
    }
}
