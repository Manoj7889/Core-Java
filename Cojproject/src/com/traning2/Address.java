package com.traning2;

public class Address {
		private int houseNumber;
		private String street;
		private String city;
		private String state;
		private String postalcode;
	
		
		public Address(int houseNumber,String street, String city, String state, String postalCode) {
	        this.houseNumber= houseNumber;
			this.street = street;
	        this.city = city;
	        this.state = state;
	        this.postalcode = postalCode;
		
	}
	

		public int gethouseNumber() {
			return houseNumber;
		}

		public String getStreet() {
			return street;
		}

		public String getCity() {
			return city;
		}

		public String getState() {
			return state;
		}

		public String getPostalcode() {
			return postalcode;
		}
		
	}

