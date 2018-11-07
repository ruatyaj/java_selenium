package ru.raiffeisen.training;

public abstract class Figure {

    abstract double square();
    abstract double perimetr();

    public String getsp() {
       return "s="+ square() + "p = " +perimetr();

    }

}
