package com.traning4;
class details{
	int id=01;
    String name;
	String location;
	static String company="versus";
	details(int i,String n,String l){
		 id=i;
		name=n;
	 location=l;
	}
	 void display(){System.out.println(id+" "+name+" "+location+" "+company);
	}
}

public class Employe {
	public static void main(String[] args) {
		details d1=new details(01,"ram","hyderbad");
		details d2=new details(22,"raj","vijawada");
		d1.display();
		d2.display();
		
	
		
	}
	

}

