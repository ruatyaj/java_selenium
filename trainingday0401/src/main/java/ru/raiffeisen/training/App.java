package ru.raiffeisen.training;

public class App {


    private static void testfigure (Figure f) {

        System.out.println(f.getsp());
    }

    private static void tetsfigure2 (Object o){
        System.out.println(((Figure)o).getsp());
    }


    public static void main(String[] args) {

        testfigure(new Circle(2));
        tetsfigure2(new Circle(5));

        Figure f2 = new Circle(15);
        ((Circle)f2).setR(2);
        System.out.println(f2.getsp());

        Figure f3 = new Recttangle(12, 7);
        System.out.println(f3.getsp());



    }


}



