package ru.raiffeisen.training.day02;

public class test1 {

    public static void main(String[] args) {
        // System.out.println("Hai");

        int p = 1;
        if (p == 1) {
            System.out.println("ttt");
        } else {
            System.out.println("wrong");
        }


        int d = 0;
        if (d == 11) {
            System.out.println("ll");
        }
        else if (d == 0) {
            System.out.println(d);
        }


        switch (d) {   //selector
                case 1:
                System.out.println("12");break;
                case 2:
                System.out.println("11");break;
                default:System.out.println("11");
        }

        //ternary if

        int App = 56;
        System.out.println("there is " + App + "classes" +
                (App != 0 ? "true" : "false")
        );

        int g = (App != 0 ? 100 : 0);


        for (int i=0; i < 10; ++i) {
            System.out.println(i+ "?");
            int r = 3;
            r++;
            if (r>7) break;;
            }
        System.out.println(".");


        int a2 = 0;

        while (a2 <10) {
           // System.out.println("test"+ a2);
            a2++;
        }


        while (true) {
            if (a2>5) break;
            a2++;
            if (a2%2 == 0) continue; //продолжить операцию
            System.out.println("yes");

        }


        System.out.println("123\t222\t777"); //tab
        System.out.println("67766\b77");  //backspace
        System.out.println("544656\n888");  //перенос строки


        System.out.println();

        }
    }


