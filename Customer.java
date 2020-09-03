import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;
    private double initialAmount;


    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }


    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

}
