import java.util.ArrayList;

// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions


public class Bank {

    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public String getName() {
        return name;
    }


    private int findBranch(Branch branch) {
        return branches.indexOf(branch);
    }

    private Branch findBranch(String branchName) {
        if (branches.size() > 0) {
            for(Branch branch : branches) {
                if(branch.getName().equals(branchName)) {
                    return branch;
                }
            }
        }
        return null;
    }

    public boolean addBranch(Branch branch) {
        if (findBranch(branch) >= 0) {
            System.out.println("Branch " + branch.getName() + " already exists, it can't be added to a branchlist of Bank: " + this.name + ".");
            return false;
        } else {
            branches.add(branch);
            System.out.println("Branch " + branch.getName() + " has been added to a branchlist of Bank: " + this.name + ".");
            return true;
        }
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            System.out.println("Branch " + branchName + " has been added to a branchlist of Bank: " + this.name + ".");
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null) {
            return foundBranch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null) {
            return foundBranch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public void listCustomers(String branchName, boolean showTransactions) {
        Branch foundBranch = findBranch(branchName);
        if (foundBranch != null) {
            System.out.println("Customer details for branch " + foundBranch.getName());
            ArrayList<Customer> branchCustomers = foundBranch.getCustomers();
            for (Customer customer : branchCustomers) {
                System.out.println("Name of customer: " + customer.getName());
                if (showTransactions) {
                    System.out.println("Transactions: ");
                    for (double transaction : customer.getTransactions()) {
                        System.out.println(transaction);
                    }
                }
            }
        }
    }



}
