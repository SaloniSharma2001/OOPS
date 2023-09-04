package com.Constructor;

public class CopyConstructor {
    String name;
    int money;
    int id;

    public CopyConstructor(){}
    public CopyConstructor(String name, int money, int id){
        this.name = name;
        this.money =  money;
        this.id = id;
        System.out.println("Hi, I am parameterized constructor.");
    }

    @Override
    public String toString() {
        return "CopyConstructor{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", id=" + id +
                '}';
    }

    // Copy Constructor implementation, which copies value from other object
    public CopyConstructor(CopyConstructor copied){
        this.name = copied.name;
        this.money = copied.money;
        this.id = copied.id;
        System.out.println("Hi, I am copy constructor.");
    }
}
