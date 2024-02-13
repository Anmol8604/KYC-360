package com.example.KYC360.KYC360.Repository;

import com.example.KYC360.KYC360.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
}
