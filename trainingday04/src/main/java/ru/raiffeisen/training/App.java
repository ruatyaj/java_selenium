package ru.raiffeisen.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");

        Customer customer = new Customer();

        customer.sname = "LOST";
        customer.sname = "HAlo";


        Account acc1 = new Account(12, 67.677);
        System.out.println(acc1);
        System.out.println(acc1.getAccountstring());

        Customeraccount cacc1 = new Customeraccount(12, 9.56, customer);
        System.out.println(cacc1.getAccountstring());

        System.out.println(cacc1);

    }

}


