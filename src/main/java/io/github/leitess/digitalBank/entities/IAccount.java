package io.github.leitess.digitalBank.entities;

public interface IAccount
{
    void withdraw(double value);

    void deposit(double value);

    void transfer(double value, IAccount toAccount);

    void bankStatement();
}
