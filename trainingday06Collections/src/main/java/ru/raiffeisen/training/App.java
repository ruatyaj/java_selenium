package ru.raiffeisen.training;


class A {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public A(int data) {
        this.data = data;
    }
}


class B<T> {

    private T data;


    public void getInfo() {
        System.out.println(data.getClass().getCanonicalName());
    }

    public B(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}


class C <K,V> {
}


public class App {
    public static void main(String[] args) {

        B b = new B(new Object());

        B<Integer> b2 = new B<>(2);
        B<A> b3 = new B<>(new A(6));


        b3.getInfo();
        System.out.println(b3.getData().getData());


        int a = 89;
        Integer h = 86; //упаковка в обертку

        int a3 = 3+ a;  //распаковка


    }
}
