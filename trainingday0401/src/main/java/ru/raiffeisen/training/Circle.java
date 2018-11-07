package ru.raiffeisen.training;

public class Circle extends Figure {


    public Circle(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double r;

    @Override
    double square() {
        return r*r;
    }

    @Override
    double perimetr() {
        return Math.PI*r*r;
    }
}
