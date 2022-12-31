package com.methodCalling;

public class B {

        // javac A.java
        // java A

        // main method is called by JVM
        public static void main(String[] args) {

            displayMessage(); // calling a method - displayMessage()
//		To call Non Static Method
//		1. Create object of Class in which method exist.
//		2. Using create Object, we can call method from that class.

            B b = new B();
            b.displayMessage();
        }

        public static void displayMessage() {
            System.out.println("Message from Class A");
        }
    }


