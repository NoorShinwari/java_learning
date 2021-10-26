package com.javaLearning;

public class BankAccount {

    public BankAccount(int accountNumber, long balance, String firstName, String lastName, String email,
                       String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    private int accountNumber;
    private long balance;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return this.accountNumber;

    }

    public long getBalance() {
        return this.balance;

    }

    public String getFirstName() {
        return this.firstName;

    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        if (!this.firstName.isEmpty() && !this.lastName.isEmpty()) {
            return this.firstName + " " + this.lastName;
        }
        if (!this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return this.firstName;
        }
        if (this.firstName.isEmpty() && !this.lastName.isEmpty()) {
            return this.lastName;
        }
        return "";

    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    public void setBalance(long balance) {
        this.balance = balance;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public void deposit(long funds) {
        long balanceBefore = this.balance;
        this.balance += funds;
        System.out.println("Funds before : " + balanceBefore);
        System.out.println(funds + " added to your account, now the current balance is : " + this.balance);

    }

    public void withdraw(long funds) {
        long balanceBefore = this.balance;

        if (this.balance < funds) {
            System.out.println("Not enough balance");
            return;
        }
        this.balance -= funds;
        System.out.println("Funds before : " + balanceBefore);
        System.out.println(funds + " withdrawed from your account, now the current balance is : " + this.balance);

    }

}
