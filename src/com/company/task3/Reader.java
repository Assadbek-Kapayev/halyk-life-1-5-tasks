package com.company.task3;

import java.util.List;

public class Reader {
    private String fullName;
    private int readerTicketNumber;
    private String faculty;
    private String dateOfBirth;
    private String number;

    public Reader() {}

    public Reader(String fullName) {
        this.fullName = fullName;
    }

    public Reader(String fullName, int readerTicketNumber, String faculty, String dateOfBirth, String number) {
        this(fullName);
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getReaderTicketNumber() {
        return readerTicketNumber;
    }

    public void setReaderTicketNumber(int readerTicketNumber) {
        this.readerTicketNumber = readerTicketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void takeBook(int amountOfBook) {
        String str = "книги";
        if (amountOfBook == 1) str = "книгу";
        System.out.println(fullName + " взял " + amountOfBook + " " + str);
    }

    public void takeBook(String ...books) {
        String str = "книги";
        if (books.length == 1) str = "книгу";
        System.out.print(fullName + " взял " +  str + ": ");
        for(String nameOfBook: books) {
            System.out.print(nameOfBook + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book ...books) {
        String str = "книги";
        if (books.length == 1) str = "книгу";
        System.out.print(fullName + " взял " +  str + ": ");
        for(Book book: books) {
            System.out.print(book.getNameOfBook() + ", ");
        }
        System.out.println();
    }

    public void returnBook(int amountOfBook) {
        String str = "книги";
        if (amountOfBook == 1) str = "книгу";
        System.out.println(fullName + " вернул " + amountOfBook + " " + str);
    }

    public void returnBook(String ...books) {
        String str = "книги";
        if (books.length == 1) str = "книгу";
        System.out.print(fullName + " вернул " +  str + ": ");
        for(String nameOfBook: books) {
            System.out.print(nameOfBook + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book ...books) {
        String str = "книги";
        if (books.length == 1) str = "книгу";
        System.out.print(fullName + " вернул " +  str + ": ");
        for(Book book: books) {
            System.out.print(book.getNameOfBook() + ", ");
        }
        System.out.println();
    }
}
