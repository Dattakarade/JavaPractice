package com.inheritance;

    public class HDFC extends Bank {
        double interestRate = 5.5;
        double amount =2000;
        double calInterest;
        double time = 4;

        HDFC(double amount, double time) {
            super(amount, time);
        }

        public void calculateInterestRate() {
            super.calculateInterestRate();
            calInterest = (amount * time * interestRate) / 100;
            System.out.println("interest Rate of HDFC Bank"+calInterest);
        }
    }

