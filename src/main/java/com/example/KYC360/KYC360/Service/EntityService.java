package com.example.KYC360.KYC360.Service;


import com.example.KYC360.KYC360.Model.Entity;
import com.example.KYC360.KYC360.Repository.EntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityService {
    @Autowired
    EntityRepo entity;


}
