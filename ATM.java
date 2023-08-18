package AtmInterface;

import java.util.Scanner;

class BankAccount 
{
    private int balance;

    public BankAccount(int balance)
    {
        this.balance = balance;
    }

    public int getBalance() 
    {
        return balance;
    }

    public void setBalance(int balance) 
    {
        this.balance = balance;
    }
}

public class ATM 
{
    private BankAccount account;

    public ATM(BankAccount account) 
    {
        this.account = account;
    }

    public void withdraw(int amount) 
    {
        if (account.getBalance() >= amount)
        {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawal successful ");
        } else {
            System.out.println("Insufficient balance ! Please Try Again ");
        }
    }

    public void deposit(int amount)
    {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful ");
    }

    public int getBalance() 
    {
        return account.getBalance();
    }

    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(1000);
        ATM atm = new ATM(account);

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the amount to withdraw: ");
        int amount = sc.nextInt();
        atm.withdraw(amount);
        System.out.println("Balance is now: " +atm.getBalance());

        
        System.out.println("Enter the amount to deposit: ");
        amount = sc.nextInt();
        atm.deposit(amount);
        System.out.println("Balance is now: " +atm.getBalance());
    }
}
