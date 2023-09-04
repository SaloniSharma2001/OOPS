package com.Constructor;

public class Saloni {
    int money;
    String bestFriend;

    //This is user defined default constructor, if user doesn't define any constructor Java compiler provides a default constructor.
    public Saloni(){
        System.out.println("Hi, this is Saloni's default constructor");
    }

    //Parameterized constructor
    public Saloni(int money){
        this.money = money;
    }
    //Constructor overloading
    public Saloni(int money, String bestFriend){
        this.money = money;
        this.bestFriend = bestFriend;
    }

    @Override
    public String toString() {
        return "Saloni{" +
                "money=" + money +
                ", bestFriend='" + bestFriend + '\'' +
                '}';
    }
}
