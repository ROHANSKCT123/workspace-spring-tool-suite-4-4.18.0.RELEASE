package com.whatsapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whatsapp.demo.model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{

}
