package com.loops;

public class Calculator {


    public static void main(String args[]) {
        int ans = 1;


        switch (ans) {
            case 1:
                System.out.println(20 + 10);
                break;

            case 2:
                System.out.println(20 - 10);
                break;

            case 3:
                System.out.println(20 * 10);
                break;

            case 4:
                System.out.println(20 / 10);
                break;

            default:
                System.out.println("Invalid Entry");
                break;
        }
    }
}
