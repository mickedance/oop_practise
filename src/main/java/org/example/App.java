package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer customer = new Customer("Mikael Svensson", "micke@dolphins.com", "07033333");

        BankAccount bankAccount1 = new BankAccount(200, customer);

        System.out.println(bankAccount1.getBalance());
    }
}
