package com.traning3;
class Cat{
	void run() {System.out.println("go");
	}
}
class dog extends Cat{
	void eat() {System.out.println("eat");
}
public class Animal {
	public static void main(String[]args) {
		dog d=new dog();
		d.eat();
		d.run();
		
	}
}

}
