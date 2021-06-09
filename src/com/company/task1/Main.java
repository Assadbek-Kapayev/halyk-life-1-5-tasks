package com.company.task1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("8 747 775 5533", "Redmi note 8", 200);
        Phone phone2 = new Phone("8 747 334 8923", "Iphone 10", 180);
        Phone phone3 = new Phone("8 747 832 2348", "Samsung A50", 220);

        System.out.println("Number: " + phone1.getNumber() + "model: " + phone1.getModel() +
                "weight: " + phone1.getWeight());
        System.out.println("Number: " + phone2.getNumber() + "model: " + phone2.getModel() +
                "weight: " + phone2.getWeight());
        System.out.println("Number: " + phone3.getNumber() + "model: " + phone3.getModel() +
                "weight: " + phone3.getWeight());

        phone1.receiveCall("Tom", phone2.getNumber());
        phone3.receiveCall("Lucy", phone1.getNumber());
        phone2.receiveCall("Mary");

        phone1.sendMessage(phone2.getNumber(), phone3.getNumber());
    }
}
