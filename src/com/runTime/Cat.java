package com.runTime;

public class Cat extends Animal{

    //Implementation changed override
   public Animal animal(){
       System.out.println("Hi I am child");
       return new Animal();
    }

    //Return type change override provided subtype of return type
    public Cat animal2(){
        System.out.println("Hii I am parents");
        return new Cat();
    }

    /*
    *  public Cat animal(){
        System.out.println("Hii I am parents");
        *   //This throws ClassCastException (Narrow Casting)
       return (Cat) new Animal();
    }
    * */

    public float sum(float x, float y){
        return x-y;
    }
}
