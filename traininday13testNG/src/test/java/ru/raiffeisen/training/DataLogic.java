package ru.raiffeisen.training;

public class DataLogic {

    public static String getLogin(String name, String sname){
        return name.trim().substring(0,1).toUpperCase()+"/"+sname.trim().toUpperCase();
    }
}
