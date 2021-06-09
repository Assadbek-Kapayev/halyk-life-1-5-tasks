package com.company.task2;

public class Person {
    private String fullName;
    private int age;

    public Person() {}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println("Такой-то " + fullName + " двигается");
    }

    public void talk() {
        System.out.println("Такой-то " + fullName + " говорит");
    }
}
