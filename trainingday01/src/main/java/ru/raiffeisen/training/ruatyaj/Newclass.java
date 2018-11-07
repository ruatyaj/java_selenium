package ru.raiffeisen.training.ruatyaj;

public class Newclass {

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("LOL");

        byte b1 = 127;
        byte b2 = -128;
        byte b3 = (byte)(b1+1);
        System.out.println("b3="+b3);

        byte b4 = (byte)0b0111_1101111;
        System.out.println("b4="+b4);


        short sh1 = 4324;
        System.out.println((1<<15)-1);  // верхняя граница short
        System.out.println(-(1<<15)); // нижняя граница short

        System.out.println(Short.MAX_VALUE);


        int i1 =100;
        System.out.println(Integer.MAX_VALUE);
        System.out.println((1<<31)-1);
        int i2 = 0xA734_12AD;  //с предикатом
        int i3 = 1_555_777_777;
        int i4 = 0175656; //octal

        System.out.println(Integer.toHexString(i3));


        long L1 = Long.MAX_VALUE -1;
        System.out.println(L1);
        System.out.println(Math.log(L1));


        long L2 = 756756576576576L;



        char ch1;  //,беззнаковый тип 4Байт

        System.out.println((int)Character.MAX_VALUE);


        //операции


        int in1 = 0b001011_1101;
        int in2 = 0b001011_1101;

        int in3 = in1 & in2;
        int in4 = in2 | in1;  //побитовое или
        int in5 = in2 ^ in1 ^ in1; //исключающее или

        int in6 = ~in1; //побитовое отрицание

        System.out.println(Integer.toBinaryString(in3));  //перевод в бинарную строку

        System.out.println(in4);

        System.out.println(Integer.toBinaryString(in5));



        float f1 = 0.35359999999399999953f;  //с плавающей точкой одинарной точности

        System.out.println(Math.log10(1<<24));  //кол-во разрядов
        float f2 = 1e6f + 12f;

        System.out.println(f1);


        double d1 = 0.243442424;//числа с двойной точностью

        System.out.println(1.343535e35+2.78678884444444444444444);



        char c2 = 'C';

        System.out.println((char) (c2+3));
        System.out.println((char)(242422424));
        System.out.println('\u0042');  //utf кодировка

        boolean bo1 = true; boolean bo2 = false;
        boolean bo3 = 75 == -56;

        System.out.println(bo3 || bo1 && bo2);

        String s1 = "halo";
    }

}
