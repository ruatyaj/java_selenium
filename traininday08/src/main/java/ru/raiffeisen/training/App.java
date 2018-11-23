package ru.raiffeisen.training;


import ru.raiffeusen.training.Utils;

public class App {

    private static double sum(double a, double... d) {  ///объявлен массив!!!
        double sum = 0;
        for (double r : d) {
            sum += r;
        }
        //System.out.println("args: "+d.length);
        return Double.parseDouble(String.valueOf(sum));
    }

    public static void main(String[] args) {

        System.out.printf("Test %d, %d, %d, %s", 11, 12, 23, "AAA");  //вывод переменных double string
        System.out.println();
        System.out.println("sum = " + sum(1.22, 55.55, 55.55));


        for (String arg : args) {
            System.out.println(arg);

            if (arg.startsWith("-")) {
                String[] args1 = arg.substring(2).split(",");
                double sum[] =
                        new double[args1.length];

                for (int i = 0; i < sum.length; i++) {
                    sum[i] = Double.parseDouble(args1[i]);
                    Utils.echo("-",29);
                    System.out.println("Summ = " + sum.toString());

                }

            }


        }

    }
}