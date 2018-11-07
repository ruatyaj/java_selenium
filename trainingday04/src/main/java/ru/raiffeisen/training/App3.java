package ru.raiffeisen.training;

interface Imovabke {
    public void moveforward(int vel);

    public void moveback(int vel);

    //........
}

interface Itranssmission {

    public void switche(int i);

}


abstract class BasicCAr {


    double mass, power, vel;

    public abstract void ignit();

    ;  // абстракатный метод


}

class Car extends BasicCAr implements Imovabke {
    @Override
    public void ignit() {
        System.out.println("Car ignit...");
    }

    @Override
    public void moveforward(int vel) {
        this.vel = vel;
        System.out.println("Car moves forward..." + vel + "velocity");

    }

    @Override
    public void moveback(int vel) {
        this.vel = vel;
        System.out.println("Car moves back..." + vel + "velocity");

    }
}

class Truck extends BasicCAr {
    @Override
    public void ignit() {
        System.out.println("Truck ignit...");

    }
}

public class App3 {

    private static void testcArmove(Imovabke mv) {

        System.out.println("starttest...");
        mv.moveback(12);
        mv.moveforward(15);
    }

    public static void main(String[] args) {


        Car car = new Car();
        car.ignit();
        car.moveforward(10);
        car.moveback(1);

        testcArmove(car);

        Object o = car;  //объектная ссылка


        ((Car) o).ignit();
        //((Truck) o).ignit(); находится на другой ветке - ошибка
        Object o1 = new Object();
        //Car c2 = o1;  можно объявлять только от родителя к потомкам, но не наоборот

    }


}
