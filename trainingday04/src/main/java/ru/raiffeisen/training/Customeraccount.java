package ru.raiffeisen.training;

public class Customeraccount extends Account { // родительский класс для Account

    Customer customer;

    public Customeraccount (int id, double ballance){
        super (id, ballance);
    }

    public Customeraccount (int id, double ballance, Customer customer){
        super (id, ballance);
        this.customer = customer;
    }

    public  String getAccountstring ()
    {return super.getAccountstring() + "name " +customer.name + "sname "+ customer.sname;}


    @Override
    public String toString() {return getAccountstring();}


}
