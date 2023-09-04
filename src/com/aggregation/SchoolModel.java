package com.aggregation;

public class SchoolModel {
    String schoolName;
    AddressModel address;
    PrincipalModel principal;

    public SchoolModel(String schoolName, AddressModel address, PrincipalModel principal) {
        this.schoolName = schoolName;
        this.address = address;
        this.principal = principal;
    }

    @Override
    public String toString() {
        return "SchoolModel{" +
                "schoolName='" + schoolName + '\'' +
                ", address=" + address +
                ", principal=" + principal +
                '}';
    }
}
