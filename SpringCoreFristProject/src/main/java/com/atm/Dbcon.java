package com.atm;

public class Dbcon {
	
	private int id;
	private String name;
	private String LastName;
	
	
//    public Dbcon() {
//		super();
//       }
	
	
	public int getId() {
		return id;
	}
	public Dbcon() {
	super();
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
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Dbcon [id=" + id + ", name=" + name + ", LastName=" + LastName + "]";
	}
    
	
}
