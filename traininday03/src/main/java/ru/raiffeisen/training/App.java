package ru.raiffeisen.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        Customer  customer1= new Customer();
        customer1.name = "LANA";
        customer1.age = 23;
        customer1.balance = 0.25;

        //customer1.setId(12);




        System.out.println(customer1.getcustomerinfo());


        Customer2 customer2 = new Customer2("Yura",45,8.45);

        Customer2 customer3 = new Customer2("la",21);
        System.out.println(customer3.getcustomerinfo());

        System.out.println("#" + Customer2.getcount());


        for (int i=0; i < 15; i++) {
            Thread.sleep(2);
            System.out.print(Util.getRandom(12,41)+ "\t");
        }
        System.out.println();
        for (int i=0; i < 15; i++) {
            Thread.sleep(2);
            System.out.print(Util.getRandom2(-100,100)+ "\t");
        }

        Util.getsymbols(6,"test");

        AccountDAta.test(2);
        AccountDAta.test("344");
        AccountDAta.test(0.567);

        AccountDAta.test(34, String.valueOf(11));  //преобразование данных

        A atype = new A(); //

        atype.data = "first";

        AccountDAta test1 = new AccountDAta();
        System.out.println(test1.atype.data);  //композиция
        System.out.println(test1.atype.c.valc); //3 вложения
    }
}
