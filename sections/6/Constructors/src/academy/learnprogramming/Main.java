package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(0.0);
        account.withdraw(400);
        System.out.println("Balance= " + account.getBalance());
        account.deposit(100.25);
        account.deposit(500.50);
        account.withdraw(250.50);
        System.out.println("Balance= " + account.getBalance());

        System.out.println();

        BankAccount bobsAccount = new BankAccount("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(100.0);

        System.out.println();
        BankAccount defaultAccount = new BankAccount();
        System.out.println(defaultAccount.getNumber());
        System.out.println(defaultAccount.getBalance());

        System.out.println();
        BankAccount jonsAccount = new BankAccount("Jon", "jon@email.com", "12345");
        System.out.println(jonsAccount.getNumber() + " name " + jonsAccount.getCustomerName());
        System.out.println(jonsAccount.getBalance());

        System.out.println();
        System.out.println("************VipCustomer()***************");
        VipCustomer cusOne = new VipCustomer();
        System.out.println(
                "cusOne = VipCustomer("
                        + cusOne.getName()
                        + ", " + cusOne.getEmailAddress()
                        + ", " + cusOne.getCreditLimit()
                        + ")"
        );
        VipCustomer cusTwo = new VipCustomer("Two", "two@email.com");
        System.out.println(
                "cusTwo = VipCustomer("
                        + cusTwo.getName()
                        + ", " + cusTwo.getEmailAddress()
                        + ", " + cusTwo.getCreditLimit()
                        + ")"
        );
        VipCustomer cusThree = new VipCustomer("Three", "three@email.com", 5000.00);
        System.out.println(
                "cusThree = VipCustomer("
                        + cusThree.getName()
                        + ", " + cusThree.getEmailAddress()
                        + ", " + cusThree.getCreditLimit()
                        + ")"
        );
    }
}
