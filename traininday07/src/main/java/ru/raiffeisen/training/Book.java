package ru.raiffeisen.training;

public class Book implements Comparable<Book>{


    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String author, title;

    public Book(int year, String author, String title) {
        this.year = year;
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " + title + ", by " + author + ", year " + year;
    }

    @Override
    public int compareTo(Book o) {
        return this.year - o.year;
    }
}
