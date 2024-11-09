package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.Vaccination;

public interface VaccinationService {
	
	public List<Vaccination> getAll();
	
	public Vaccination createCenter(Vaccination vc);
	
	public Optional<Vaccination> findByCitizenId(int id);
	
	public void deleteCitizen (Vaccination cz);

	

}
