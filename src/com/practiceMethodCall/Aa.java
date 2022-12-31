package com.practiceMethodCall;

import java.util.ArrayList;

public class Aa {
     int a,b,c;

    public  void add(int x,int y){
        int z=x+y;
        System.out.println(z);
    }
    public int add(int x,int y,int z){
        int a=(x+y)-z;
        return a;
    }
    public static void display(){
        System.out.println("In Display method");
    }

    public static void main(String[] args) {

         Aa obj=new Aa();
       obj.add(10,50);
       obj.add(30,40);
       System.out.println( obj.add(100,20,40));
       display();

        ArrayList arr=new ArrayList();


    }
}
