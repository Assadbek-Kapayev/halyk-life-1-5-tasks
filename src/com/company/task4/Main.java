package com.company.task4;

public class Main {
    public static void main(String[] args) {
        numbers(30, 100);
    }

    public static void numbers(int a, int b) {
        if (a > b) {
            System.out.println(b++);
            numbers(a, b);
        } else if (a < b) {
            System.out.println(a++);
            numbers(a, b);
        } else {
            System.out.println(a);
        }
    }
}
