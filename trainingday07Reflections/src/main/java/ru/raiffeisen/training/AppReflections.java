package ru.raiffeisen.training;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@SuperClass
//@Resource
@LOgger(level = LoggingLevel.Full)
class Data {
    int a, b, c;
    private int d = 0, e, f;

    public void _startA() {
        System.out.println("_StartA");
    }

    public void startB() {
        System.out.println("StartB");
    }

    public void startC() {
        System.out.println("StartC");
    }

    private void startD(){
        System.out.println("startD private...");
    }

    public int getD() {
        return d;
    }

    private static void startE() {
        System.out.println("StartE private");
    }

    public static void startF() {
        System.out.println("StartF");
    }
}

public class AppReflections {


    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {

        Data data = new Data();
        Class<?> c = Data.class;
        System.out.println("d="+ data.getD());
        Method m1 = c.getDeclaredMethod("startD");
        m1.setAccessible(true);

        //change private fields
        Field f1 = data.getClass().getDeclaredField("d");
        f1.setAccessible(true);
        f1.set(data,100);
        for (Field f: c.getDeclaredFields()) {
            System.out.println(f.getName());
        }


        Class c2 = data.getClass();


        Class c3 = Class.forName("ru.raiffeisen.training.Data");






        boolean flag = false;
        for (Annotation ann : c.getAnnotations()){
            System.out.println(ann.toString());

            if (c.isAnnotationPresent(LOgger.class)) {
                LOgger l = c.getAnnotation(LOgger.class);
                switch (l.level())
                {
                    case OFF:
                        System.out.println("OFF");break;

                    case Warnings:
                        System.out.println("WArnings");break;
                }
            }


            //  if(c.isAnnotationPresent(SuperClass.class)){f}

//            if (ann.toString().equals("@ru.raiffeisen.training.SuperClass()")) flag = true;
//            System.out.println("OK annotation" + ann);

        }
        //if (flag)
        if(c.isAnnotationPresent(SuperClass.class))
        for (Method m : c2.getDeclaredMethods()) {
            System.out.println(m.getName() + "режим : " + m.getModifiers());


            if (m.getModifiers() == 1) {
                if (m.getName().startsWith("start")) {m.invoke(data);}
                m.invoke(data);  //запуск метода при соответствии флажку
            }
        }


    }
}
