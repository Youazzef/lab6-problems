package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name){
        this.name = name;
        transactions = new ArrayList<Double>();;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(Double d){
        transactions.add(d);
        System.out.println(((d>0) ? "Credited " : "Debited ") +name + " " + Math.abs(d) + " MAD");
    }

    public void printTransactions(){
        System.out.println(transactions);
    }
}
