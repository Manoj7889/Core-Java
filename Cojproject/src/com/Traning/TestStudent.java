package com.Traning;
 class Student{
	int Id;
	String Name;
	char Grade;
	float percentage;   
	 void insert(int i,String n, char g,float p) {
		 Id=i;
		 Name=n;
		 Grade=g;
		 percentage=p;
	 }
	void display() {System.out.println("My Id :"+Id+" Name "+Name+" percentage "+percentage+" Grade "+Grade);
	
}

public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.insert(01,"Mahesh",'B',69.5f );
		s2.insert(02,"Ram", 'A', 98.2f);
		s1.display();
		s2.display();
	}
		
		
	}

}
