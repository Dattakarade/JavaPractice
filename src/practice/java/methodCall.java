package practice.java;

public class methodCall {
    // Method definition performing a Call to another Method
    public static void main(String[] args) {
        Method1(); // Method being called.
        Method2();
    }

    // Method definition to call in another Method
    public static void Method1() {
        System.out.println("Hello World!");
    }

    // Method definition performing a Call to another Method
    public static void Method2() {
        System.out.println("Welcome to Java Programming");
    Method1(); // Method being called.
    }
}