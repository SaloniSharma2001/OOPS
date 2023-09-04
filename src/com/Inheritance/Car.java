package com.Inheritance;

///Car (Child class) inheriting parent class Vehicle ("single inheritance")
class Car extends Vehicle{

    //A duplicate name of instance variable in child class as of parent class
    String name;

    //New instance variable introduced in child class
    String maxSpeed;

    //Default constructor and using this.name we are accessing child class instance variable "Name" and using super.Name we are accessing parent class instance variable and assigning its value to child class instance ("Use of this keyword and super keyword").
    public Car(){
        this.name = super.name;
    }

    //Use of "this" keyword to refer the instance variable of the current class.
    public Car(String name,String maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    //Use of this() and super()

    //use of super(), ("Rem it's super method and not super keyword")
    public Car(String name, String color, String model, String type, String maxSpeed){
        super(name,color, model,type);
        this.maxSpeed = maxSpeed;

    }
    //use of this(), ("Rem it's this method and not this keyword")
    public Car(String name, String color, String model,String maxSpeed){
        this(name,maxSpeed);
        super.color = color;
        super.model = model;
    }

    //Q. Can you use both this() and super() in a Constructor?
    //NO, because both super() and this() must be first statement inside a constructor. Hence, we cannot use them together.
    public Car(String name, String model,String maxSpeed){
        super(model);
        //this(name,maxSpeed);
        super.color = color;
        super.model = model;
    }


}
