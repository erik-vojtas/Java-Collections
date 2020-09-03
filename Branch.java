import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;
    private String name;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            System.out.println("Customer " + customerName + " has been added to a customerlist of Branch: " + this.name + ".");
            return true;
        }
        return false;
    }

    private int findCustomer(Customer customer) {
        return customers.indexOf(customer);
    }

    private Customer findCustomer(String customerName) {
        for(Customer customer : this.customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            System.out.println("Transaction: " + amount + " has been added.");
            return true;
        }
        return false;
    }



}
