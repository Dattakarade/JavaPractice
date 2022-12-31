package com.abstraction;

public interface Rapid extends Car {
    int Accelerate;
    double Break;

    public void calculateArea(){
        circle =3.14*(radius*radius);
        System.out.println("Area of circle is"+circle);
    }
    Circle( int radius){
        this.radius=radius;

    }
}

}
