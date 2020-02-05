package com.epam.controller;
import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.epam.dao.UsedDao;
import com.epam.exception.UserNotFound;
import com.epam.model.User;

@RestController
public class UserContoller {

	@Autowired
	private UsedDao userDao;

	@GetMapping("alluser")
	public List<User> allUsers() {
		return userDao.findall();
	}

	@GetMapping("alluser/{id}")
	public EntityModel<User> getOne(@PathVariable int id) {
		User user = userDao.find(id);

		EntityModel<User> entityModel = new EntityModel<User>(user);
		WebMvcLinkBuilder links = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).allUsers());
		entityModel.add(links.withRel("all-user"));


		if(user == null)
			throw new UserNotFound("id -"+id);
		//return user;
		return entityModel;

	}

	@PostMapping("alluser")
	public ResponseEntity<User> create(@Valid @RequestBody User user) {
		User saved = userDao.save(user);

		URI location = ServletUriComponentsBuilder.
				fromCurrentRequestUri().
				path("/{id}").
				buildAndExpand(saved.getId()).toUri();

		return ResponseEntity.created(location).build();
	}

	@DeleteMapping("alluser/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable int id) {
		User user = userDao.deleteById(id);


		if(user == null)
			throw new UserNotFound("id -"+id);

		return ResponseEntity.noContent().build();
	}


}
