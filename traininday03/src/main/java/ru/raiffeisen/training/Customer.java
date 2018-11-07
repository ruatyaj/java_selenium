package ru.raiffeisen.training;

import java.util.Random;

public class Customer {

    public Customer(){   //конструктор вызывается только один раз
        System.out.println("+++fff" + this);
        id =  new Random().nextInt(2434244);   //генерирует до указанной границы
    }

            public String name;
            public int age;
            public double balance;
            private int id;

    public int getId (){return  id;}

   // public void setId (int id) {this.id = id;}




    public String getcustomerinfo (){return (name + " " + age + "," + balance+ "."); }


}
