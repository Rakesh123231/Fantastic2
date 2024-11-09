package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Vaccination;
import com.example.demo.Repository.VaccinationRepository;
import com.example.demo.Service.VaccinationService;

@Service
public class VaccinationServiceImpl implements VaccinationService {
	
	
	@Autowired
	VaccinationRepository vaccRepo;

	@Override
	public List<Vaccination> getAll() {
		// TODO Auto-generated method stub
		return vaccRepo.findAll();
	}

	@Override
	public Vaccination createCenter(Vaccination vc) {
		// TODO Auto-generated method stub
		
		return vaccRepo.save(vc);
		
	}

	@Override
	public Optional<Vaccination> findByCitizenId(int id) {
		// TODO Auto-generated method stub
		Optional<Vaccination> citizen = vaccRepo.findById(id);
		
		if(citizen.isPresent()) {
		return citizen;
		}
		return null;	}

	@Override
	public void deleteCitizen(Vaccination cz) {
		// TODO Auto-generated method stub
		
		vaccRepo.delete(cz);
		
	}

}
