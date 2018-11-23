package ru.raiffeisen.training;


import ru.raiffeusen.training.Book;

import java.io.*;
import java.util.ArrayList;

public class App {

    public static ArrayList<Book> library;
    public static void feedLibrary(){
        library = new ArrayList<>(10);
        library.add(new Book(2015, "IT", "King"));
        library.add(new Book(2003, "test", "test"));
        library.add(new Book(1956, "LAL", "TRATATA"));
        library.add(new Book(1978, "BLA", "BLABLA"));
    };

    public static void main(String[] args) {
        feedLibrary();

        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book(2015, "IT", "King"));
        library.add(new Book(2003, "test", "test"));
        library.add(new Book(1956, "LAL", "TRATATA"));
        library.add(new Book(1978, "BLA", "BLABLA"));


        File lib = new File("c:\\training\\test1\\library.bin");
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(lib))) {
//
//            oos.writeObject(library);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        ArrayList<Book> library2 = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(lib))) {
            library2 = (ArrayList<Book>) ois.readObject();
            System.out.println(library2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}