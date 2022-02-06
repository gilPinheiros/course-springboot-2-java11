package com.exercicio.course.resoucers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Gilmar", "gil@gmail.com", "3483-4859", "123456");
		return ResponseEntity.ok().body(u);
	}
}
