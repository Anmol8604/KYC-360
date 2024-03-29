package com.example.KYC360.KYC360.Controller;

import com.example.KYC360.KYC360.Model.Address;
import com.example.KYC360.KYC360.Model.Entity;
import com.example.KYC360.KYC360.Model.Name;
import com.example.KYC360.KYC360.Repository.AddressRepo;
import com.example.KYC360.KYC360.Repository.EntityRepo;
import com.example.KYC360.KYC360.Repository.NameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/KYC360")
public class Controller {

    @Autowired
    NameRepo nameRepo;
    @Autowired
    AddressRepo addressRepo;
    @Autowired
    EntityRepo entityRepo;

    @GetMapping("/getNames")
    public List<Name> getNames(){
        return nameRepo.findAll();
    }

    @GetMapping("getSingleName/{id}")
    public Optional<Name> getName(@PathVariable("id") int id){
        return nameRepo.findById(id);
    }

    @DeleteMapping("/delName/{id}")
    public void delSingleName(@PathVariable("id") int id){
        nameRepo.deleteById(id);
    }
    @DeleteMapping("/delName")
    public void delName(){
        nameRepo.deleteAll();
    }
    @PostMapping("/addName")
    public void addName(@RequestBody Name name){
        nameRepo.save(new Name(name.getId(), name.getFirst(), name.getMiddle(), name.getLast()));
    }

    @GetMapping("/getAddress's")
    public List<Address> getAddress(){
        return addressRepo.findAll();
    }

    @GetMapping("getAddress/{id}")
    public Optional<Address> getSingleAdd(@PathVariable("id") int id){
        return addressRepo.findById(id);
    }

    @DeleteMapping("/delAddress/{id}")
    public void delSingleAddress(@PathVariable("id") int id){
        addressRepo.deleteById(id);
    }
    @DeleteMapping("/delAddress")
    public void delAddress(){
        addressRepo.deleteAll();
    }

    @PostMapping("/addAddress")
    public void addName(@RequestBody Address address){
        addressRepo.save(new Address(address.getId(), address.getAddress(), address.getCity(), address.getCountry()));
    }

    @GetMapping("/getEntity")
    public List<Entity> getEntity(){
        return entityRepo.findAll();
    }

    @GetMapping("getEntity/{id}")
    public Optional<Entity> getSingleEntity(@PathVariable("id") int id){
        return entityRepo.findById(id);
    }

    @DeleteMapping("/delEntity/{id}")
    public void delSingleEntity(@PathVariable("id") int id){
        entityRepo.deleteById(id);
    }

    @DeleteMapping("/delEntity")
    public void delEntity(){
        entityRepo.deleteAll();
    }

    @PostMapping("/addEntity")
    public void addEntity(@RequestBody Entity entity){
        entityRepo.save(new Entity(entity.getId(), entity.getGender(), entity.isDeceased(), entity.getFirst(), entity.getMiddle(), entity.getLast(), entity.getAddress(), entity.getCity(), entity.getCountry()));
        nameRepo.save(new Name(entity.getId(), entity.getFirst(), entity.getMiddle(), entity.getLast()));
        addressRepo.save(new Address(entity.getId(), entity.getAddress(), entity.getCity(), entity.getCountry()));
    }
}
