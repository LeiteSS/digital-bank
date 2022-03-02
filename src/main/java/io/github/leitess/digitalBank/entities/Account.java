package io.github.leitess.digitalBank.entities;

import lombok.Getter;

@Getter
public abstract class Account implements IAccount
{
    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Customer customer; // composition

    public Account(Customer customer)
    {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENCIAL++; // s=s+1
        this.customer = customer;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, IAccount toAccount) {
        this.withdraw(value);
        toAccount.deposit(value);
    }


    protected void printBankStatement() {
        System.out.println(String.format("Titular: %s", this.customer.getName()));
        System.out.println(String.format("Agencia: %d", this.agency));
        System.out.println(String.format("Numero: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }
}
