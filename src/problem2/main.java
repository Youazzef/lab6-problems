package problem2;

public class main {
    public static void main(String[] args){
        Customer C1 = new Customer("Youssef");
        Customer C2 = new Customer("Anass");
        Bank B = new Bank("Bank Doe");

        C1.addTransaction(50.0);
        C2.addTransaction(80.0);
        B.addCustomer(C1);
        B.addCustomer(C2);

        B.addCustomer(C1);

        B.addTransaction("Youssef", 50.0);
        B.printTransactions("Youssef");


    }
}
