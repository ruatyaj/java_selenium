package ru.raiffeisen.training;

public class Account {  // родительский класс для Customeraccount

    public Account(int id, double ballance) {
        this.id = id;
        this.ballance = ballance;
    }

    private int id;
    private  double ballance;

    public int getId() {  //RO read only
        return id;
    }

    public void setId(int id) {   //RW
        this.id = id;
    }

    public double getBallance() {
        return ballance;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }

    public  String getAccountstring ()
    {return "account id:"+ id +", ballance:"+ballance;}

}
