package com.epam.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
	
	private PetType petType;
	private Owner owner;
	private LocalDate bday;
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBday() {
		return bday;
	}
	public void setBday(LocalDate bday) {
		this.bday = bday;
	}
}
