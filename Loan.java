package com.codegnan.oopexamples;


	public class Loan {
	    int loanId;
	    String customerName;
	    double loanAmount;
	    String loanType;

    // Default constructor
    public Loan() {
        this(0, "Unknown", 0.0, "Unknown");
    }

    // Constructor with loanId and customerName
    public Loan(int loanId, String customerName) {
        this(loanId, customerName, 0.0, "Unknown");
    }

    // Constructor with loanId, customerName, loanAmount
    public Loan(int loanId, String customerName, double loanAmount) {
        this(loanId, customerName, loanAmount, "Unknown");
    }

    // Full constructor
    public Loan(int loanId, String customerName, double loanAmount, String loanType) {
        this.loanId = loanId;
        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.loanType = loanType;
    }

    // Method to get interest rate based on loan type
    public double getInterestRate() {
        if (this.loanType.equalsIgnoreCase("Home")) {
            return 8.0;
        } else if (this.loanType.equalsIgnoreCase("Car")) {
            return 9.0;
        } else if (this.loanType.equalsIgnoreCase("Personal")) {
            return 11.0;
        } else {
            return 0.0;
        }
    }

    // Method to calculate total payable amount
    public double calculateTotalPayable() {
        double interestRate = this.getInterestRate();
        return this.loanAmount + (this.loanAmount * interestRate / 100);
    }

    // Method to display loan details
    public void displayLoanDetails() {
        System.out.println("Loan Details:");
        System.out.println("Loan ID: " + this.loanId);
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Loan Amount: " + this.loanAmount);
        System.out.println("Loan Type: " + this.loanType);
        System.out.println("Total Payable: " + this.calculateTotalPayable());
    }
}

