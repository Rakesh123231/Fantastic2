package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Communication.CitizenFeignClient;
import com.example.demo.Entity.Citizen;

@Service
public class CitizenService {
	
	 @Autowired
	    private CitizenFeignClient citizenFeignClient;

	    public List<Citizen> getAllCitizen() {
	        ResponseEntity<List<Citizen>> listofCitizens = citizenFeignClient.getAllCitizens(); // Call Citizen Service
	        
	        return listofCitizens.getBody();
	    }
	    
	    
	    public String getPorts() {
	        String portNo = citizenFeignClient.getPortDetails(); // Call Citizen Service Ports
	        
	        return portNo;
	    }

}
