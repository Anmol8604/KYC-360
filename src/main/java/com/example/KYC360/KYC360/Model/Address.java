package com.example.KYC360.KYC360.Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@jakarta.persistence.Entity
@Data
public class Address {

    @Id
    @Column(name = "Address_ID")
    long id;

    String address, city, country;

    public Address(long id, String address, String city, String country) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public Address() {
    }
}
