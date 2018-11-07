package ru.raiffeisen.training;

import java.util.Arrays;

enum Answers {Yes, No, DoNotKnow};

enum FileMode {Read, Write, ReadWrite, Append;}

interface IFileMode {
    int Read = 0;
    int Write = 0;
}

public class App {

    private static  void openFile (String name,FileMode fm){}

    public static void main(String[] args) {
        Answers answers = Answers.Yes;
        int mode = IFileMode.Read;

        System.out.println(Arrays.toString(Answers.values()));

        for (Answers a : Answers.values()) {

            System.out.println(a + ":" + (int) (a.ordinal()));
        }

        FileMode fileMode = FileMode.Append;

        switch (fileMode) {
            case Read:
                System.out.println("read");
                break;
            case Write:
                System.out.println("write");
                break;
        }

        openFile("ggg",FileMode.Read);

    }
}
