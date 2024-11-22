package com.Crud.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ServiceClass {
	@Autowired
	IUser iu;
	public Pojo addUser(Pojo user) {
		return iu.save(user);
	}
	public List<Pojo> getAllStud(){
		List<Pojo> students=iu.findAll();
		return students;
	}
	public List<Pojo> getStud(@PathVariable List id){
		List<Pojo> student= iu.findAllById(id);
		return student;
	}
	public Pojo updateStud(@PathVariable int id){
		Pojo student=iu.findById(id).get();
		student.setName("saravana");
		iu.save(student);
		return student;
	}
	public Pojo deletestud(@PathVariable int id) {
		Pojo student=iu.findById(id).get();
		iu.delete(student);
		return student;
	}
}