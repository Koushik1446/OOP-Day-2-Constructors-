package com.codegnan.oopexamples;

import java.util.Scanner;

public class LoanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Loan ID: ");
        int loanId = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter Loan Type (Home / Car / Personal): ");
        String loanType = sc.nextLine();

        // Create Loan object using full constructor
        Loan loan = new Loan(loanId, customerName, loanAmount, loanType);
        loan.displayLoanDetails();

        sc.close();
    }
}
