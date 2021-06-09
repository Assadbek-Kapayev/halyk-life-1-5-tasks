package com.company.task3;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В. В");

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь");
        reader1.takeBook(new Book("Приключения"), new Book("Энциклопедия")
            , new Book("Словарь"));
        reader1.returnBook(1);
        reader1.returnBook("Приключения");
        reader1.returnBook(new Book("Приключения"), new Book("Энциклопедия")
                , new Book("Словарь"));
    }
}
