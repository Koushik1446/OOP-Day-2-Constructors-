package com.codegnan.oopexamples;


public class Student {
 // Instance Variables
 String name;
 int rollNumber;
 int[] marks;

 // Default Constructor
 public Student() {
     this.name = "Unknown";
     this.rollNumber = 0;
     this.marks = new int[]{0, 0, 0};
 }

 // Parameterized Constructor
 public Student(String name, int rollNumber, int[] marks) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.marks = marks;
 }

 // Method to display student details
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Marks: ");
     for (int i = 0; i < marks.length; i++) {
         System.out.println("Subject " + (i + 1) + ": " + marks[i]);
     }
 }

 // Method to calculate total marks
 public int calculateTotal() {
     int total = 0;
     for (int mark : marks) {
         total += mark;
     }
     return total;
 }

 // Method to calculate average marks
 public double calculateAverage() {
     return calculateTotal() / 3.0;
 }
}