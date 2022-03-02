package io.github.leitess.digitalBank.entities;
// conta poupança
public class SavingAccount extends Account
{
    public SavingAccount(Customer customer)
    {
        super(customer);
    }

    @Override
    public void bankStatement() {
        System.out.println("=== Extrato Conta Poupança");
        super.printBankStatement();
    }
}
