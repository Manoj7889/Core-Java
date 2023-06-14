package com.traning2;

public class Employe {
	private int Id;
	private String Name;
	private Address Address;
	private long PhoneNumber;
	
	public Employe( int Id, String Name, com.traning2.Address Address, long PhoneNumber) {
		this.Id=Id;
		this.Name=Name;
		this.Address=Address;
		this.PhoneNumber=PhoneNumber;
	}
	public int getId() {
		return Id;
	}
	
	public String getName() {
		return Name;
	}
	
	public Address getAddress() {
		return Address;
	}
	
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	
}

