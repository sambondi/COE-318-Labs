package coe318.lab4;
/**
 *
 * @author Sam Bondi, 500686504
 */
public class Account {
    //Instance variables
    final private String clientName;
    final private int accNumber;
    private double balance;
    
    //Constructor
    public Account(String name, int number, double initialBalance){
        this.clientName = name;
        this.accNumber = number;
        this.balance = initialBalance;
    }
    
    //Returns name on bank account
    public String getName(){
        return clientName;
    }
    
    //Returns balance on bank account
    public double getBalance(){
        return balance;
    }
    
    //Returns the account number
    public int getNumber(){
        return accNumber;
    }
    
    //Withrdaw
    public boolean withdraw(double takeOut){
        if(balance > takeOut && takeOut > 0 && takeOut != 0){
            this.balance = balance - takeOut;
            return true;
        }else if(balance < takeOut || takeOut == 0 || takeOut < 0){
            return false;
        }
        return false;
    }
    
    //Deposit
    public boolean deposit(double putIn){
        if(putIn == 0 || putIn < 0){
            return false;
        }else{
            this.balance = balance + putIn;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "(" + getName() + ", " + getNumber() + ", " +
                String.format("$%.2f", getBalance()) + ")";
    }
}
