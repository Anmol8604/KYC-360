package com.example.KYC360.KYC360.Service;

import com.example.KYC360.KYC360.Repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;
}
