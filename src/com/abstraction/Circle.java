package com.abstraction;

public class Circle extends Shape{
    int radius;
    double circle;
    public void calculateArea(){
        circle =3.14*(radius*radius);
        System.out.println("Area of circle is"+circle);
    }
    Circle( int radius){
        this.radius=radius;

    }
}
