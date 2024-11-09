package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "vaccination")
public class Vaccination {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String vaccinationCenterName;
	
	private String vaccinationCenterAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVaccinationCenterName() {
		return vaccinationCenterName;
	}

	public void setVaccinationCenterName(String vaccinationCenterName) {
		this.vaccinationCenterName = vaccinationCenterName;
	}

	public String getVaccinationCenterAddress() {
		return vaccinationCenterAddress;
	}

	public void setVaccinationCenterAddress(String vaccinationCenterAddress) {
		this.vaccinationCenterAddress = vaccinationCenterAddress;
	}

	@Override
	public String toString() {
		return "Vaccination [id=" + id + ", vaccinationCenterName=" + vaccinationCenterName
				+ ", vaccinationCenterAddress=" + vaccinationCenterAddress + "]";
	}

	public Vaccination(int id, String vaccinationCenterName, String vaccinationCenterAddress) {
		super();
		this.id = id;
		this.vaccinationCenterName = vaccinationCenterName;
		this.vaccinationCenterAddress = vaccinationCenterAddress;
	}

	public Vaccination() {
		super();
	}
	
	
	
	
	
	

}
