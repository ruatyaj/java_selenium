package ru.raiffeisen.training;

/**
 * Hello world!
 */
public class App {

    private static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int a = 1, res;

        String statuText = "ok";


        try {
            //Class.forName("ru.raiffeise.home");
            if (a == 1)
                //throw new ClassCastException("My message////");
                res = div(123, (a - 1));
        } catch (IndexOutOfBoundsException ex) {
            statuText = "arrays false";

        } catch (ArithmeticException ex) {

            for (StackTraceElement st : ex.getStackTrace()) {
                System.out.println("file=" + st.getFileName() + st.getClassName() + st.getMethodName() + st.getLineNumber());
            }

            statuText = "div false";
            throw ex;
        } catch (Exception ex) {
            for (StackTraceElement st : ex.getStackTrace()) {
                System.out.println("file=" + st.getFileName() + st.getClassName() + st.getMethodName() + st.getLineNumber());
            }

            statuText = "div false";
        } finally {
            System.out.println("finnaly");
        }

        System.out.println(statuText);
        System.out.println("hello");


    }
}
