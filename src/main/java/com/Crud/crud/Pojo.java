package com.Crud.crud;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="crud")
public class Pojo {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pojo() {
		super();
	}
	public Pojo(int id, String name) {
		super();
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Pojo [id=" + id + ", name=" + name + "]";
	}
}