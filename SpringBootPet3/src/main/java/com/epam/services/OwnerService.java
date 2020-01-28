package com.epam.services;

import org.springframework.stereotype.Service;

import com.epam.model.Owner;

@Service
public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName();
}
