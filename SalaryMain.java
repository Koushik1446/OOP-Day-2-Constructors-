package com.codegnan.oopexamples;

import java.util.Scanner;

public class SalaryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Experience (in years): ");
        int experience = sc.nextInt();

        // Create employee object using full constructor
        Salary emp = new Salary(empId, name, salary, experience);
        emp.displayDetails();

        sc.close();
    }
}

