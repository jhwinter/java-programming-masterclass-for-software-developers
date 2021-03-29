package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }

        return null;
    }


    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) != null) {
            return false;
        }

        this.customers.add(new Customer(customerName, initialAmount));
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            return false;
        }

        customer.addTransaction(transaction);
        return true;
    }


}
