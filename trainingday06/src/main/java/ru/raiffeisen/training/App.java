package ru.raiffeisen.training;

import java.util.Arrays;
import java.util.Locale;

public class App {


    private static String getDomain(String email) {
        return email.substring(email.indexOf("@"+1));
    }


        public static void main(String[] args) {
        String name1 = "Vanya";  //строка неизменяема - константа
        String name2 = new String("Vanya");

        if (name1 == name2)   //нельзя использовать для сравнения строк
            System.out.println("ok");
        System.out.println(name1.hashCode());
        System.out.println(System.identityHashCode(name1));
        System.out.println(System.identityHashCode(name2));


        if (name1.equals(name2)) System.out.println("2ok"); //1 способ

        if (name1.compareTo(name2) == 0) System.out.println("yes"); //2 способ


        String data = "guy,gu7;y78,6868h_лт,лот;лт";
        String login = "ts ST";


        data.length();

        System.out.println(data.substring(5, 8));
        //System.out.println(data.substring(data.charAt(-10)));

        System.out.println(login.trim().toUpperCase());  //изменения формата

        System.out.println(Arrays.toString(data.split(",|;")));  //создание массива с помощью сплита
        System.out.println(Arrays.toString(data.split("[,;]")));


        String summa = new String("2446464.646469");
        double m = 0;
        m = Double.parseDouble(summa);
        int a = Integer.parseInt("8776");

        double res = 0.1 * m;

        System.out.println("результат =" + res);


        System.out.printf("res = %-10.2f,a2 = %7x\r\n", res, a);  //варианты форматирования - выделение знаков, приведение к 16 системе (х), знаки после разделителя

        String resString = String.format(new Locale("rus"), "res = %-10.2f,a2 = %7x\r\n", res, a); //системный разделитель
        System.out.println(resString);


        char[] char1 = resString.toCharArray();
        char key = 5555;
        //
        for (int i = 0; i < char1.length; i++) char1[i] ^= key;

        System.out.println(new String(char1));   //вывод массива знаков в шифре


        for (int i = 0; i < char1.length; i++) char1[i] ^= key;  //обратный декодинг
        System.out.println(new String(char1));


        String emails = "hello@omsk.mail.ru";

        String mask = "^.+@([a-zA-Z0-9]+\\.)+ru$";

        System.out.println(emails.matches(mask));  //соответствие регексу в mask


        System.out.println(emails.contains("@")); //первый способ проверки на содержание boolean

        if (emails.indexOf("ru") != 1) System.out.println("okkkkk"); //второй способ проверки на содержание

            String email = "kkk@mail.ru";
            //System.out.println(getDomain(email));



            String container = "";
            StringBuilder container2 = new StringBuilder();

            for (int i = 0; i <10 ; i++)

            {container2.append(""+ (char)(65+i));}  //для StringBuilder
                //container += " " + (char)(65+i);
            System.out.println(container);
            System.out.println(container2);










    }
}
