package com.inheritance;


    public class Axis extends Bank{
        double interestRate = 5.5;

        double calInterest;

        Axis(double amount, double time){
            super(100, 12);    }

         public void calculateInterestRate(){
           super.calculateInterestRate();
            calInterest = (amount*time*interestRate)/100;
            System.out.println("interest Rate of Axis Bank"+calInterest);
        }
    }

