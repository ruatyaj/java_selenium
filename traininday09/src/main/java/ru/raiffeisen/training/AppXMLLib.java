package ru.raiffeisen.training;


import ru.raiffeusen.training.Book;
import ru.raiffeusen.training.Library;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class AppXMLLib {

    public static void main(String[] args) {
        App.feedLibrary();

        Library library = new Library(App.library);
        Library library2 = null;


        try (FileOutputStream fos = new FileOutputStream("c:\\training\\test1\\library2.xml")) {
            JAXBContext context = JAXBContext.newInstance(Library.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(library, fos);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileInputStream fis = new FileInputStream("c:\\training\\test1\\library.xml")) {
            JAXBContext context = JAXBContext.newInstance(Library.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            library2 = (Library) unmarshaller.unmarshal(fis);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println(library2.getBooks());
    }
}
