package com.inheritance;

public class main {

    public static void main (String []args) {
        Axis a = new Axis(1000, 2);
        a.calculateInterestRate();
        HDFC h = new HDFC(2000, 2);
        h.calculateInterestRate();
        ICICI i = new ICICI(3000, 2);
        i.calculateInterestRate();

    }

}
