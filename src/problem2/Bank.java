package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String n){
        name = n;
        customers = new ArrayList<Customer>();
    }
    public void addCustomer(Customer C){

        boolean flag = true;
        for (Customer c : customers){
            if (C.equals(c)){
                flag = false;
                break;
            }
        }
        if (flag) {
            customers.add(C);
        }
    }

    public void addTransaction(String CName, Double T){
        boolean flag = true;
        for (Customer c : customers){
            if (CName.equals(c.getName())){
                flag = false;
                c.addTransaction(T);
                break;
            }
        }
        if (flag){
            System.out.println("Customer not found ! ");
        }
    }
    public void printTransactions(String CName){
        boolean flag = true;
        for (Customer c : customers){
            if (CName.equals(c.getName())){
                flag = false;
                System.out.print(CName + " ") ; c.printTransactions();
                break;
            }
        }
        if (flag){
            System.out.println("Customer not found ! ");
        }
    }

}
