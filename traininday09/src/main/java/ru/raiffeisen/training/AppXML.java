package ru.raiffeisen.training;


import ru.raiffeusen.training.Book;

import javax.xml.bind.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class AppXML {

    public static void main(String[] args) {


        Book book =  new Book(2003, "test", "test");

        try (FileOutputStream fos = new FileOutputStream("c:\\training\\test1\\book.xml")){
            JAXBContext context = JAXBContext.newInstance(Book.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(book,fos);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
