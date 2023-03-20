package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }

        return null;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) != null) {
            return false;
        }

        this.branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        return branch.newCustomer(customerName, amount);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        return branch.addCustomerTransaction(customerName, amount);
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        System.out.println("Customer details for branch " + branch.getName());
        for (int i = 0; i < branch.getCustomers().size(); i++) {
            Customer customer = branch.getCustomers().get(i);
            System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
            if (showTransactions) {
                System.out.println("Transactions");
                for (int j = 0; j < customer.getTransactions().size(); j++) {
                    System.out.println("[" + (j + 1) + "] " + " Amount " + customer.getTransactions().get(j));
                }
            }
        }
        return true;
    }
}
