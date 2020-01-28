package com.epam.services;

import java.util.Set;

import com.epam.model.Owner;
import com.epam.services.map.AbstractMap;

public class OwnerMapService extends AbstractMap<Owner, Long> implements OwnerService{

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findByID(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object, object.getId());
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
