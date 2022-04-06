package org.example;

public class BankAccount {

    int AccountNumber;
    int balance;
    Customer customer;

    public BankAccount( int balance, Customer customer) {
        this.balance = balance;
        this.customer = customer;
        this.AccountNumber++;
    }



    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void withdraw(int amount){
        if(amount>0)
            if(balance >= amount){
                balance -= amount;
            }
    }
    public void deposit(int amount){
        if(amount>0)
            balance += amount;
    }
}


/*
* Create a class called BankAccount
•Create fields for account number, balance, customer name, email and
phone number.
•Create a constructor that assign values to all fields
•Make getters and setters for all fields
•Create methods to deposit and withdraw funds.
•Do not allow a withdrawal to complete if the balance is insufficient.
•Extra: Have a static counter that increment and assign the account
number.*/