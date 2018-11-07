package ru.raiffeisen.training.day02;

public class Table {

    public static void main(String[] args)
    {

        int di = 1;
        int dh = 1;
;
        System.out.print("\t");

        for (int i = 1; i <= 5; i=i+di)
            System.out.print(i+"\t");

            System.out.println();

            for (int j = 1; j <= 5; j=j+dh)
            {
                System.out.println();
                System.out.print(+j + "\t");
                for (int i = 1; i <= 5; i++)
                    System.out.print(i * j + "\t");
                System.out.println();


            }



            }
        }


