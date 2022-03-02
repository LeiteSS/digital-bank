package io.github.leitess.digitalBank;

import io.github.leitess.digitalBank.entities.Account;
import io.github.leitess.digitalBank.entities.CheckingAccount;
import io.github.leitess.digitalBank.entities.Customer;
import io.github.leitess.digitalBank.entities.SavingAccount;

public class App
{
    public static void main(String[] args)
    {
        Customer silas = new Customer();
        silas.setName("Silas");

        Account cc = new CheckingAccount(silas);
        Account savings = new SavingAccount(silas);

        cc.deposit(100);
        cc.transfer(100, savings);

        cc.bankStatement();
        savings.bankStatement();
    }
}
