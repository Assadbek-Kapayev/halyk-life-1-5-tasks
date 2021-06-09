package com.company.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Aspirant("John", "Smith", "1903", 5, "new IT tech");
        System.out.println(student1.getScholarship());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                students.add(new Aspirant("John" + i, "Smith" + i, "190" + i, Math.random() * 6, "new IT tech"));
            } else {
                students.add(new Student("John" + i, "Smith" + i, "50" + i, Math.random() * 6));
            }
        }

        for (Student student: students) {
            System.out.println("Name: " + student.getFirstName() + ", average mark: " + student.getAverageMark() + ", scholarship: " + student.getScholarship());
        }
    }
}
