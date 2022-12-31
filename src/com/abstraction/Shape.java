package com.abstraction;

public abstract class Shape {
public static void main(String args []){
    Square s= new Square(4);
    Circle c= new Circle(2);
    Rectangle r = new Rectangle(4,5);
    shapeOperation sop = new shapeOperation();
    s.calculateArea();
    c.calculateArea();
    r.calculateArea();
    sop.calculateArea();
}
        //final int b = 20;
        //public void display(){
          //  System.out.println("This is display method");
      //  }
        abstract public void calculateArea();
    }

