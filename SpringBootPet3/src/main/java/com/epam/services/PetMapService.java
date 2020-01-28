package com.epam.services;

import java.util.Set;

import com.epam.model.Pet;
import com.epam.services.map.AbstractMap;

public class PetMapService extends AbstractMap<Pet, Long> implements PetService{

	@Override
	public Pet findById(Long id) {
		return super.findByID(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object, object.getId());
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
}
