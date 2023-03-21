package com.techpalle.model;

public class Student 
{
	private int id;
	private String name ;
	private String email;
	private String qual;
	private String pass;
	private long mob;
	
	
	public Student(String name, String email, String qual, String pass, long mob) {
		super();
		this.name = name;
		this.email = email;
		this.qual = qual;
		this.pass = pass;
		this.mob = mob;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	
	
	
}
