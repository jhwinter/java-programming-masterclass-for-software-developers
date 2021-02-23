package academy.learnprogramming;

// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.

/**
 * Create a new class VipCustomer
 * it should have 3 fields name, credit limit, and email address.
 * create 3 constructors
 * 1st constructor empty should call the constructor with 3 parameters with default values
 * 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
 * 3rd constructor should save all fields.
 * create getters only for this using code generation of intellij as setters wont be needed
 * test and confirm it works.
 *
 */
public class VipCustomer {
    private String name;
    private String emailAddress;
    private double creditLimit;

    public VipCustomer() {
        this("default name", "default@email.com", 1000.00);
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, emailAddress, 3000.00);
    }

    public VipCustomer(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
