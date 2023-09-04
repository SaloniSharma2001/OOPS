package com.runTime;

public class Animal {
    public Animal animal(){
        System.out.println("Hii I am parents");
       return new Animal();
    }
    public Animal animal2(){
        System.out.println("Hii I am parents method 2");
        return new Animal();
    }

    public float sum(float x, float y){
        return x+y;
    }
}
