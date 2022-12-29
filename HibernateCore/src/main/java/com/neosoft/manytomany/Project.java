package com.neosoft.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	@Column(name="p_id")
	private int id;
	@Column(name="p_name")
	private String name;
	@ManyToMany(mappedBy="projects")
	private List<Emp> emps;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int id, String name, List<Emp> emps) {
		super();
		this.id = id;
		this.name = name;
		this.emps = emps;
	}
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
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", emps=" + emps + "]";
	}

}
