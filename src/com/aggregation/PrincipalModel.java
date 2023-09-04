package com.aggregation;

public class PrincipalModel {
    String name;
    AddressModel addressModel;
    int age;

    PrincipalModel(){

    }
    PrincipalModel(String name,AddressModel addressModel,int age){
        this.name=name;
        this.addressModel=addressModel;
        this.age=age;
    }

    @Override
    public String toString() {
        return "PrincipalModel{" +
                "name='" + name + '\'' +
                ", addressModel=" + addressModel +
                ", age=" + age +
                '}';
    }
}
