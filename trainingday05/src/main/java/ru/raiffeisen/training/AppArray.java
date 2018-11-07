package ru.raiffeisen.training;

import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 */
public class AppArray {


    public static void main(String[] args) {

        int[] arraay1 = {1, 2, 3, 4};
        int arraay2[] = {1, 2, 3, 4};
        int arg[] = {1, 2, 3, 4};
        int N = 3;
        int arr4[] = new int[20];
        int arr5[] = new int[N];
        sumArray(arg);
        System.out.println(Arrays.toString(arg));

        //arraay1[0] = 5;
        System.out.println(arraay1[0]);
        System.out.println("L=" + arraay1.length);

        for (int i = 0; i < arraay1.length; i++) {
            System.out.println(arraay1[i]);
            System.out.println("\t");
            System.out.println(arraay2[i]);
        }

        System.out.println("\t");

        for (int data : arraay1) {
            System.out.println(data);

        }

        System.out.println(Arrays.toString(randomArray(10)));
        System.out.println(Arrays.toString(randomArray(10)));
        System.out.println();


        adderArray(arraay1, 2);

        System.out.println(sum(new int[] {1,5,4,8}));  //можно анонимно объявить переменную или массив


    }

    private static void sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum=" + sum);
    }

    private static int[] randomArray(int N) {
        int arg[] = new int[N];
        Random r = new Random();
        for (int i = 0; i < N; i++) {
            arg[i] = r.nextInt(12);
        }
        return arg;
    }


    private static void adderArray(int[] arr, int b) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] += b;
        }
        System.out.println(Arrays.toString(arr));
    }


    private static int sum(int[] arr) {
        int s = 0;
        for (int d : arr) s += d;
        return s;
    }

}





