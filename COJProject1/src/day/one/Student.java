package day.one;

public class Student {
	String Name;
	int Id;
	String Section;
	//void ("Name of the student"+Name+" "+"Section"+Section+" "+"Id"+Id+" ");
public static void main (String[]args) {
	Student s1=new Student();
	Student s2=new Student();
	s1.Id=01;
	s1.Name="Raj";
	s2.Section="10A";
	s2.Name="Ram";
	s2.Id=2;
	System.out.println(s1.Name+" "+s1.Id+" "+s2.Section);
	System.out.println(s2.Name+" "+s2.Id+" "+s2.Section);
}
	
}
