package ru.raiffeisen.training;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class AppCollections {
    public static void main(String[] args) {

        ArrayList aList = new ArrayList();
        aList.add(new A(5));
        aList.add("878");
        aList.add(4545.86);
        aList.add(54545);

        ArrayList<Integer> aList2 = new ArrayList<>(50);
        aList2.add(878);
        aList2.add(9867);
        aList2.add(5666);

        aList2.add(1, 11);

        System.out.println(aList2);
        System.out.println("size = " + aList2.size());

        //System.out.println(aList2.get(10));

        Object[] arr = aList2.toArray();
        Integer[] arr1 = new Integer[aList2.size()];
        aList2.toArray(arr1);
        System.out.println(Arrays.toString(arr1));


        ArrayList<Integer> arrayList = new
                ArrayList<>(aList2);

        System.out.println(arrayList);


//        for (Object o : aList) {
//            System.out.println(o);


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("AA");
        linkedList.add("BB");
        linkedList.add("DD");

        LinkedList<Integer> linkedList1 = new LinkedList<>(aList2);

    }
}



