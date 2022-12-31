package com.abstraction;

public class Square extends Shape {
    int side;
    int square;
    public void calculateArea(){
    square=side*side;
    System.out.println("Square is"+square);
    }
    Square( int side){
       this.side=side;
    }

}

