package com.Constructor;

public class Check {
    int x;
    int y;
    int z;
    public Check(){
       //this(5);
       this(8,10);
    }
    public Check(int x){
        this(6,7);
    }
    public Check(int x, int y){
        this(8,9,10);
    }
    public Check(int x,int y, int z){
        System.out.println("Hi, I am 3 parameter constructor");
    }
}
