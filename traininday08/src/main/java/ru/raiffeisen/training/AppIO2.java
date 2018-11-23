package ru.raiffeisen.training;

import ru.raiffeusen.training.Utils;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;

//import java.io.
//import java.nio.
public class AppIO2 {

    public static void main(String[] args) {

        File file3 = new File("C:\\training\\text.txt");

        try (FileWriter fw = new FileWriter(file3, false)) {
            fw.write("TEST \r\n  LOLJIJI \r\n COOCKIE MONSTER");
            fw.write("FUNS");
            fw.write("\r\n");
            fw.write("ROFL");
            fw.write("\r\n");
            fw.write(new char[]{'2', '\u2eff', 'Ц'});
            fw.write("\r\n");
            fw.write("Date: " + new Date() + "\r\n");
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try (FileReader fr = new FileReader(file3)) {
            int ch;
            int count = 0;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
                count++;
            }

            long size = file3.length();
            Utils.echo("-", 75);
            System.out.println("File size in bytes " + size);  //размер файла
            System.out.println("Chars " + count);  //размер буфера


            Utils.echo("-", 75);
            char[] arr = new char[(int) size / 2];
            fr.read(arr);
            System.out.println(new String(arr));

        } catch (IOException ex) {
            System.out.println(ex);
        }

        //bytes

        File file4 = new File("C:\\training\\test.txt");
        try (FileOutputStream fos = new FileOutputStream(file4)) {
            String s1 = "TEST \r\n  LOLJIJI \r\n COOCKIE MONSTER \r\n";
            String s2 = "FUNS ROFL DATE  " + new Date() + "\r\n";
            String s3 = "ТЕРМИНАТОР ";

            fos.write(s1.getBytes("utf-8"));
            fos.write(s2.getBytes());
            fos.write(s3.getBytes("utf-8"));

        } catch (IOException ex) {
            System.out.println(ex);
        }


        try (FileInputStream fis = new FileInputStream(file4)) {
            byte[] arr = new byte[(int) file4.length()];
            fis.read(arr);

            String content = new String(arr);
            System.out.println(content);


        } catch (IOException ex) {
            System.out.println(ex);
        }


        //Random access file

        File file5 = new File("C:\\training\\newtest.txt");


        try (RandomAccessFile rws = new RandomAccessFile(file5, "rw")) {
            String s3 = "НЕЧТО НОВОЕ ";
            String s2 = "GOGA  " + new Date() + "\r\n";
            String s1 = "TEST \r\n  LOLJIJI \r\n COOCKIE MONSTER \r\n";

            rws.write(s3.getBytes());
            rws.write(s2.getBytes());


            rws.seek(0);
            int ch;
            while ((ch = rws.read()) != -1) {
                System.out.print((char) ch);
            }

            int pos = (int) rws.getFilePointer();
            System.out.println("Position: " + pos);

            Utils.echo("+", 75);
            rws.seek(0);
            rws.write("TEST".getBytes());
            rws.seek(0);

            byte[] arr = new byte[(int) file5.length()];
            rws.read(arr);

            String content = new String(arr);
            System.out.println(content);

        } catch (IOException ex) {
            System.out.println(ex);
        }


        File file6 = new File("C:\\training\\newtest2.txt");


        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file6))) {
        dos.writeDouble(-424.5656);
        dos.writeInt(3535);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (DataInputStream dis = new DataInputStream(new FileInputStream(file6))) {
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());


    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

