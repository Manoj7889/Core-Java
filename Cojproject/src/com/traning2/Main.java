package com.traning2;

public class Main {
	public static void main(String[]args) {
		Address address=new Address(1926, "tanner","durham","NC","2356-856245");
		Employe employe=new Employe( 12, "Ram", address, 874565214);
		
	 System.out.println("Employee Details:");
     System.out.println("ID :"+employe.getId());
     System.out.println("Name :"+employe.getName());
     System.out.println("Phone: "+employe.getPhoneNumber());
     System.out.println("Address: "+address.gethouseNumber());
     System.out.println("Street: " + address.getStreet());
     System.out.println("City: " + address.getCity());
     System.out.println("State: " + address.getCity());
     System.out.println("Zip Code: " + address.getPostalcode());
	}
}



