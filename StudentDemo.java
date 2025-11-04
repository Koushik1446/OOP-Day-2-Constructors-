package com.codegnan.oopexamples;

public class StudentDemo {
    public static void main(String[] args) {
        // Object using default constructor
        Student student1 = new Student();
        System.out.println("Student 1 Details:");
        student1.displayDetails();
        System.out.println("Total Marks: " + student1.calculateTotal());
        System.out.println("Average Marks: " + student1.calculateAverage());
        System.out.println();

        // Object using parameterized constructor
        int[] marks = {85, 90, 78};
        Student student2 = new Student("Alice", 101, marks);
        System.out.println("Student 2 Details:");
        student2.displayDetails();
        System.out.println("Total Marks: " + student2.calculateTotal());
        System.out.println("Average Marks: " + student2.calculateAverage());
    }
}
