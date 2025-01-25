package com.example.demo.Communication;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Entity.*;

@FeignClient(name="FANTASTIC1-SERVICE")
public interface CitizenFeignClient {
	
	@GetMapping("/fantastic/fox/getAll")
	 public ResponseEntity<List<Citizen>> getAllCitizens();
	
	
	@GetMapping("/fantastic/fox/ports")
	public String getPortDetails ();
	
}
