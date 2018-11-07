package ru.raiffeisen.training;

import java.util.Random;

public class Customer2 {

//    public Customer2(){   //конструктор вызывается только один раз
//        System.out.println("+++fff" + this);
//        id =  new Random().nextInt(2434244);   //генерирует до указанной границы
//    }

            private String name;
            private int age;
            private double balance;
            private  static  int count =0;



            public  Customer2 (String name, int age){  //констурктор можно вызвать только один раз. можно создавтаь контсрукторы с определыенными фиксированными значениями параметров
                this(name,age,10);  //this позволяет не объявлять значение аргумента - берется по дефолту
            }


    public Customer2(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        id =  new Random().nextInt(2434244);   //генерирует до указанной границы
        count++;
    }


    public static int getcount() {return count;}

    private int id;

    public int getId (){return  id;}

   // public void setId (int id) {this.id = id;}


    public String getcustomerinfo (){return (getName() + " " + getAge() + "," + getBalance() + "."); }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        double old_balance = this.balance;
//        this.balance = balance;
//        if (!ballanceavaliable()) this.balance = old_balance;
//
//    }
//
//
//    private boolean ballanceavaliable() {
//        if (balance >= AccountDAta.MAX_ballance_CAT2) return false;
//        else return true;
//    }


    public void setBalance(double balance) {
        if (ballanceavaliable(balance)) this.balance = balance;

    }

    private boolean ballanceavaliable(double bal) {
        if (bal >= AccountDAta.MAX_ballance_CAT2) return false;
        else return true;
    }

}
