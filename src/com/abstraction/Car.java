package com.abstraction;

public interface Car {

        public static void main(String args[]){
            Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()
            d.draw();
        }}


        Rapid R = new Rapid(4);
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
