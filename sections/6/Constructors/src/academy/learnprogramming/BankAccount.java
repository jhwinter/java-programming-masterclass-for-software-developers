package academy.learnprogramming;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("BankAccount constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        // general rule of thumb is that setting values directly in the
        //  constructor is better than using setter methods because there
        //  are some scenarios where the setter code may not be executed
        // general rule of thumb is to never call another method inside a
        //  constructor unless it's another constructor (by using `this()`)
        // setNumber(number);
        // setBalance(balance);
        // setCustomerName(customerName);
    }

    public BankAccount() {
        this("56789", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmail, customerPhoneNumber);
    }

    public void setNumber(String Number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.customerEmail = email;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double funds) {
        setBalance(getBalance() + funds);
        System.out.println("Deposit of " + funds + " made. New balance is " + getBalance());
    }

    public void withdraw(double funds) {
        // if (funds > getBalance()) {
        if (getBalance() - funds < 0) {
            System.out.println("Only " + getBalance() + " available. Withdrawal not processed.");
        } else {
            setBalance(getBalance() - funds);
            System.out.println("Withdrawal of " + funds + " processed. Remaining balance = " + getBalance());
            System.out.println("Balance decreased to " + getBalance());
        }
    }
}
