package com.example.KYC360.KYC360.Model;


import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Name {

    @Id
    long id;
    String first, middle, last;

    public Name(long id, String first, String middle, String last) {
        this.id = id;
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public Name() {

    }
}
