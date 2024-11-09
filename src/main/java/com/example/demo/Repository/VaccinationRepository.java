package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Vaccination;

@Repository
public interface VaccinationRepository  extends JpaRepository<Vaccination, Integer>{

}
