package com.inheritance;

public class Bank {

    double interestRate = 4;
    double amount;
    double calInterest;
    double time;

    Bank(double amount, double time){
        this.amount=amount;
        this.time=time;

    }
    public void calculateInterestRate() {
        calInterest = ((amount*time*interestRate)/100);
        System.out.println("Bank"+calInterest);
    }
}
//===================================================================================







//Parent class - Bank
  //      variable - interestRate = 4;
    //    method - calculateInterest(); calculate intereset based on 4%

      //  3 Child class - ex Axis, HDFC, ICICI
        //variable - interestRate = 5.5;
        //method - calculateInterest(); calculate intereset based on child class value

//Main class -
  //      Main Method(){
    //    Axis a = new Axis();
      //  a.calculateInterest();
        //}