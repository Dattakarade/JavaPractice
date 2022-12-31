package com.inheritance;

public class ICICI extends Bank {
    double interestRate = 5.5;
    double amount = 3000;
    double calInterest;
    double time = 6;

    ICICI(double amount, double time) {
        super (amount, time);
    }

    public void calculateInterestRate() {
        super.calculateInterestRate();
        calInterest = (amount * time * interestRate) / 100;
        System.out.println("interest Rate of ICICI Bank"+calInterest);
    }

}
