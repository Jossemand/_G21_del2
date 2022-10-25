package Game;

public class Account {

    private int balance;
    private int minbalance;
    private int amount;

    public Account() {
        balance = 1000;
        //constructor
    }
    public int getBalance() {
        return balance;
    }

    public int addToBalance(int amount) {
        balance=amount+balance;
        return balance;
    }

    public int subtractFromBalance(int amount) {
        balance=amount-balance;
        return balance;
    }





}
