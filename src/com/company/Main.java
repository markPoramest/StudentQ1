package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        String name = in.next();
        String sex = in.next();
        float gpa = in.nextFloat();
        Student s1 = new Student(id,name,sex,gpa);
        s1.printInfo();
        s1.Exam(44);
        s1.printInfo();
    }
}
