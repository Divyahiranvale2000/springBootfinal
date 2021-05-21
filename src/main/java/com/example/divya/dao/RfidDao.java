package com.example.divya.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.divya.entities.RfidData;

public interface RfidDao extends JpaRepository<RfidData, Integer> {

}
