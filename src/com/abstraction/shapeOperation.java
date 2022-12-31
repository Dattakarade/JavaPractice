package com.abstraction;

public class shapeOperation extends Shape {


   public void drawShape(){
       System.out.println("in drawShape method of shapeOperation class");
    }

    @Override
    public void calculateArea() {
        System.out.println("in calculate area method of Shape operation class");
    }


        }
