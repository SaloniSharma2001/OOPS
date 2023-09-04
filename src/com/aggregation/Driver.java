package com.aggregation;


public class Driver {
    public  static  void main(String[] args){
        //Here onject addressModel and principalModel is being injected to class SchoolModel.
        AddressModel addressModel = new AddressModel("WB","Kolkata","700102");
        PrincipalModel principalModel = new PrincipalModel("Saloni Sharma",addressModel,22);
        SchoolModel school = new SchoolModel("Assitive Public School",addressModel,principalModel);
        System.out.println(school.schoolName);
        System.out.println(school.address.stateName+" ,"+school.address.cityName+" ,"+school.address.pincode);
        System.out.println(school.principal.name+" ,"+school.principal.addressModel.cityName+" ,"+school.principal.age);
        System.out.println(school);
    }
}
