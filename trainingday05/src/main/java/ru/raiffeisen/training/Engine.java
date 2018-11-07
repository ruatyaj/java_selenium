package ru.raiffeisen.training;


public class Engine {
    //...
    public static final int DELATA_FUEL = 17;

    private int fuel = 0;

    private void blockVlve() {
        System.out.println("valve closed");
    }


    @Deprecated
    public void addFuel_old(int f) {
        if (f >= DELATA_FUEL)
            return;
        fuel = f;
        ///.....
        System.out.println("fuel ok " + f);
    }

    public void addFuel(int f) throws FuelProcessinExcwption{
        if (f >= DELATA_FUEL)
           throw new FuelProcessinExcwption("NOT WORK "+f);
        ///.....
        fuel = f;
    }



}
