package com.epam.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set; 

public abstract class AbstractMap<T,ID> {
	
	protected Map<ID, T> map = new HashMap<>();
	
	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}
	
	public T findByID(ID id) {
		return map.get(id);
	}
	
	public T save(T obj,ID id) {
		map.put(id, obj);
		return obj;
	}
	
	public void deleteById(ID id) {
		map.remove(id);
	}
	
	public void delete(T object) {
		map.entrySet().removeIf(element -> element.getValue().equals(object));
	}
}
