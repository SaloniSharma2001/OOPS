package com.Inheritance;

public class Main {

    public static void main(String args[]) {
        Car c = new Car("XY", "20km/sec");
        //Here name refers to child class variable ("Due to shadowing property") and color refers to parent class variable.
        System.out.println(c.name + " " + c.color);
        //Value of the name in parent class has been assigned to name of child class hence the value of parent class name will be printed.
        Car c1 = new Car();
        System.out.println(" " + c1.name);

        Car c2 = new Car("C2", "Black", "BMW", "Auto", "85km/sec");
        //Here too even though we have assigned the name in super(), c2.name will call child class instance variable "name' only due to shadow property hence we are getting null for no value assigned to it;
        System.out.println(" " + c2.name + " " + c2.color + " " + c2.model + " " + c2.type + " " + c2.maxSpeed);
    }

}












