package com.example.KYC360.KYC360.Repository;

import com.example.KYC360.KYC360.Model.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NameRepo extends JpaRepository<Name, Integer> {
}
