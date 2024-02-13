package com.example.KYC360.KYC360.Model;
import jakarta.persistence.*;
import lombok.Data;
@jakarta.persistence.Entity
@Data
public class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    long id;
    String gender;
    boolean deceased;
    String first, middle, last;
    String address, city, country;
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id", referencedColumnName = "Name_Id")
//    Name name;
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id", referencedColumnName = "Address_ID")
//    Address alladdress;
    public Entity(Long id, String gender, Boolean deceased, String first, String middle, String last, String address, String city, String country) {
        this.id = id;
        this.gender = gender;
        this.deceased = deceased;
        this.first = first;
        this.middle = middle;
        this.last = last;
        this.address = address;
        this.city = city;
        this.country = country;
    }
    public Entity() {}
}