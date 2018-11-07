package ru.raiffeisen.training.day02;

public class test2 {

    public static void main(String[] args) {


        //ссылки на объект
        User user;
        user = new User();
        User user3 = user;
        System.out.println(Integer.toHexString(user.hashCode()));
        System.out.println(user);
        System.out.println(user3);
        //user3 = new User();
        System.out.println(user3);
        System.out.println();


        C c = new C();
        C c1 = c;
        C c2 = c1;
        C c3 = c2;
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


        user3.name = "LOLLY";
        System.out.println(user3.name);
        user3.name = "seuper";
        System.out.println(user.name);

        User user1 = new User();
        user1.age = 23;
        User user2 = null;
        user2.age = 81;




    }
    }


