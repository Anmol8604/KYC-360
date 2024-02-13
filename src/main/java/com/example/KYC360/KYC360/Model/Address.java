package com.example.KYC360.KYC360;

public class Address {
    String Address, City, Country;
    public Address(String address, String city, String country) {
        Address = address;
        City = city;
        Country = country;
    }

    public void setAddress(String address){
        Address = address;
    }
    public void setCity(String city){
        City = city;
    }
    public void setCountry(String country){
        Country = country;
    }
    public String getAddress() {
        return Address;
    }
    public String getCity() {
        return City;
    }
    public String getCountry() {
        return Country;
    }
}
