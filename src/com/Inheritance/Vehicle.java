package com.Inheritance;

class Vehicle {

    //Instance Variables
    String name = "Truck";
    String color = "Red";
    String model;

    String type;

    //Default constructor
    public Vehicle() {
    }
    //Parameterized constructors

    public Vehicle(String model) {
        this.model=model;
    }
    public Vehicle(String name, String color, String model, String type) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.type = type;
    }

    //Member method
    @Override
    public String toString() {
        return "Vehicle{" +
                "Name='" + name + '\'' +
                ", Color='" + color + '\'' +
                ", Model='" + model + '\'' +
                ", Type='" + type + '\'' +
                '}';
    }
}
