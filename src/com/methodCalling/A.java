package com.methodCalling;

public class A {
        //void - nothing
        public void showMessage(String s) {
            System.out.println("MESSAGE FROM CLASS B");
            System.out.println(s);
        }

        public String getMessage() {
            String message = "Returned message from Class B";
            return message;
        }
    }


