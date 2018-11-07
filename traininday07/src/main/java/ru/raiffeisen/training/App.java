package ru.raiffeisen.training;


import java.util.*;

/*

@autor
пример JAVADoc
@version

 */

public class App {

    private static class MySorter implements Comparator<Double> {
        private boolean forward;

        public MySorter(boolean forward) {
            this.forward = forward;
        }

        ;

        public MySorter() {
            forward = true;
        }

        @Override
        public int compare(Double o1, Double o2) {
            return (int) (Math.abs(o1 - o2) * (forward ? 1 : -1));
        }
    }


    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>(20);

        arrayList.add(45.66);
        arrayList.add(78.65656);
        arrayList.add(78.66);
        arrayList.add(-12.66);


        ArrayList<Integer> arrayList1 = new ArrayList<>(20);

        arrayList1.add(3);
        arrayList1.add(10);
        arrayList1.add(13);

        //arrayList1.remove(3); //конфликт индекса и объекта

        arrayList1.remove(new Integer(3));

        //arrayList.remove(45.66);

        //System.out.println(arrayList);


        arrayList.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (int) (o1 - o2);  //простая сортировка
            }
        });

        arrayList.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (int) (Math.abs(o1 - o2));  //по модулю || o1*o1-o2*o2
            }
        });
        System.out.println(arrayList);

        //Collections.shuffle(arrayList);  //случайным образом
        Collections.sort(arrayList, new MySorter(false)); //использование созданной сортировк
        //Collections.sort(arrayList);  //сортировка по возрастанию (статический сполсоб)
        //Collections.reverse(arrayList); //обратная сортировка

        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        arrayList.sort((Double x, Double y) -> {
            return (int) (x - y);
        });

        arrayList.sort((o1, o2) -> (int) (o1 - o2));  //функция сортировки

        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book(2015, "IT", "King"));
        library.add(new Book(2003, "test", "test"));
        library.add(new Book(1956, "LAL", "TRATATA"));
        library.add(new Book(1978, "BLA", "BLABLA"));

        Collections.sort(library); //сортировка с реализованным комапаратором
        Collections.sort(library, (b1, b2) -> (b1.getAuthor().compareTo(b2.getAuthor()))); //сортировка с функцией лямбда
        System.out.println(library);


        //AFD54646

        ArrayList<String> codes = new ArrayList<>();
        codes.add("WAE475647");
        codes.add("YTR46645");
        codes.add("RTY464646");
        codes.add("JHG87666");

        codes.sort(new Comparator<String>() {
            @Override
//            public int compare(String o1, String o2) {
//                return (o1.substring(3).compareTo(o2.substring(3)));  //сравнивает строки
//            }
//        });

            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.substring(3)) - Integer.parseInt(o2.substring(3));  //сравнивает числа
            }
        });
        System.out.println(codes);

        //множества
        Set<Integer> set= new LinkedHashSet<>();  //в множестве нет индексов
        set.add(25);
        set.add(354);
        set.add(25);
        set.add(1);

        for (int a: set) {
            System.out.println(set);
        }

        set.remove(25);
        System.out.println(set);


        ArrayList<Integer> arrayList3 = new ArrayList<>();

        arrayList3.add(3);
        arrayList3.add(10);
        arrayList3.add(13);
        arrayList3.add(0);
        arrayList3.add(13);

        arrayList3 = new ArrayList<>(new HashSet<>(arrayList3)); //производится удаление дубликатов в массиве integer
        System.out.println(arrayList3);


        //словари maps

        Map map = new HashMap();  //объект любого типаб в качестве ключей исп-ся любые типы и объекты
        Map<Integer,String> map2 = new HashMap<>();

        map2.put(45,"6hh");
        map2.put(34,"test");
        map2.put(-23,"guest");
        map2.put(87,"hey");
        map2.put(45,"FFRDF");

        for (int id:map2.keySet()){     //ключи должны быть уникальны (индексы)
            System.out.println(map2.get(id));
        }

        System.out.println(map2.values());

    }
}
