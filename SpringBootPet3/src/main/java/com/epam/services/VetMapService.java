package com.epam.services;

import java.util.Set;

import com.epam.model.Vet;
import com.epam.services.map.AbstractMap;

public class VetMapService extends AbstractMap<Vet, Long> implements VetService {
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public Vet findById(Long id) {
		return super.findByID(id);
	}

	@Override
	public Vet save(Vet object) {
		return super.save(object, object.getId());
	}

}
