package io.github.leitess.digitalBank.entities;

// conta corrente
public class CheckingAccount extends Account
{
    public CheckingAccount(Customer customer)
    {
        super(customer);
    }

    @Override
    public void bankStatement() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.printBankStatement();
    }
}
