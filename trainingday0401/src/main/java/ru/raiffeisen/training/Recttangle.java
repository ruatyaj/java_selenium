package ru.raiffeisen.training;

public class Recttangle extends  Figure {

    public double a;
    public double b;

    public Recttangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    double square() {
        return a*b;
    }

    @Override
    double perimetr() {
        return 2*(a+b);
    }
}
