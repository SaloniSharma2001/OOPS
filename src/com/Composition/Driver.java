package com.Composition;

/*
* Composition is a more restricted form of Aggregation. Composition can be described as when one class which includes another class, is dependent on it in such a way that it cannot functionally exist without the class which is included. One class including another class is called a composition if the class included provides core functional meaning to the outer class. Composition is a design technique, not a feature of Java but we can achieve it using Java code.*/
public class Driver {
        public  static  void main(String[] args){
            // Java provides default constructor if and only if there is no constructor available/declared in the class.
      /* Line no. 7 throws error because class Car already contains 1 parameterized constructor hence java won't provide default constructor, in order to use that, we need to declare it explicitly.
       Car car = new Car();
       */
            Engine E = new Engine();
            E.mileage = 100;
            //Object Injection
            Car car = new Car(E);
            System.out.println(car);
        }

        /*if Car class does not have relationship with Engine class then Car does not have existence.*/
}

