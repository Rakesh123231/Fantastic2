package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Vaccination;
import com.example.demo.ServiceImpl.VaccinationServiceImpl;

@RestController
@RequestMapping("/ap1/v1")
public class VaccinationController {

	@Autowired
	VaccinationServiceImpl servImpl;
	
	@GetMapping("/getAll")
	
	public ResponseEntity<List<Vaccination>> getAllCenters() {
	
		System.out.println("herer");
		List <Vaccination> vaccList = servImpl.getAll();
		
		return new ResponseEntity(vaccList , HttpStatus.OK);
		
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<Vaccination> createVaccinationCenter (@RequestBody Vaccination vc){
		
		Vaccination vacc = servImpl.createCenter(vc);
		
		return new ResponseEntity(vacc , HttpStatus.OK);
		
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Vaccination> updateCitizen ( @RequestBody Vaccination cs){
		Vaccination updatedCit = servImpl.createCenter(cs);
		return new ResponseEntity<>(updatedCit , HttpStatus.OK);
		
		
		
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteCitizen (@PathVariable int id) {
		Optional<Vaccination> cz = servImpl.findByCitizenId(id);
		servImpl.deleteCitizen(cz.get());
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
}
