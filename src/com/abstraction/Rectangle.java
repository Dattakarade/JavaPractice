package com.abstraction;

public class Rectangle extends Shape{

        int lenght, width;
        int Area;
        public void calculateArea(){
            Area =lenght*width;
            System.out.println("Area of Rectangle is"+Area);
        }
        Rectangle( int lenght, int width){
            this.lenght=lenght;
            this.width=width;

        }
    }


