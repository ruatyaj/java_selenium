package ru.raiffeisen.training;

public class FuelProcessinExcwption extends Exception {

    private  int f;
    public  int getF(){return  f;};
    public FuelProcessinExcwption(String m) {


        super(m);
    }
}
