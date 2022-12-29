package com.neosoft.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	
	@Id
	@Column(name="e_id")
	private int id;
	@Column(name="e_name")
	private String name;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="emp_projects",joinColumns= {@JoinColumn(name="e_id")},inverseJoinColumns= {@JoinColumn(name="p_id")})
	private List<Project> projects;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, List<Project> projects) {
		super();
		this.id = id;
		this.name = name;
		this.projects = projects;
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
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", projects=" + projects + "]";
	}
	
}
