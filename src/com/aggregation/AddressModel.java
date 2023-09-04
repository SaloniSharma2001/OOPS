package com.aggregation;

public class AddressModel {
    String stateName;
    String cityName;
    String pincode;
    public AddressModel(){

    }

    public AddressModel(String stateName, String cityName, String pincode) {
        this.stateName = stateName;
        this.cityName = cityName;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "AddressModel{" +
                "stateName='" + stateName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
