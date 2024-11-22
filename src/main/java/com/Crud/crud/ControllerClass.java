package com.Crud.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerClass {
	@Autowired
	private ServiceClass su;
	@PostMapping("/user")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Pojo addUser(@RequestBody Pojo user) {
		return su.addUser(user);
	}
	@GetMapping("/all")
	public List<Pojo> getAllStud(){
		return su.getAllStud();
	}
	@GetMapping("/stud/{id}")
	public List <Pojo> getStud(@PathVariable List id){
		return su.getStud(id);
	}
	@PutMapping("/update/{id}")
	public Pojo updateStud(@PathVariable int id){
		return su.updateStud(id);
	}
	@DeleteMapping("/delete/{id}")
	public Pojo deletestud(@PathVariable int id) {
		return su.deletestud(id);
	}
}