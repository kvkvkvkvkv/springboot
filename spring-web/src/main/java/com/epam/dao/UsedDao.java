package com.epam.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.epam.model.User;

@Repository
public class UsedDao {
	
	private static List<User> users= new ArrayList<User>();
	private int count = 3;
	
	static {
		users.add(new User(1,"abc",new Date()));
		users.add(new User(2,"abcd",new Date()));
		users.add(new User(3,"abcde",new Date()));
	}
	
	public List<User> findall() {
		return users;
	}
	
	public User save(User user) {
		if(user.getId() == null)
			user.setId(++count);
		users.add(user);
		return user;
	}
	
	public User find(int id) {
		User chosenUser = null;
		for( User user : users) {
			if(user.getId() == id)
				chosenUser = user;
		}
		return chosenUser;
	}
	
	public User deleteById(int id) {
		User chosen = null;
		Iterator<User> iterator = users.iterator();
		while( iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId() == id) {
				iterator.remove();
				chosen = user;
			}
		}
		return chosen;
	}
		
}
