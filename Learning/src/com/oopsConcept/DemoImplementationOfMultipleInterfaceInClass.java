package com.oopsConcept;

interface Walk{
	void walk();
}

interface Run{
	void run();
}

class Animal implements Walk,Run{
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walk interface executed");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run interface executed");
	}
}

class Human extends Animal{
	
}

public class DemoImplementationOfMultipleInterfaceInClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal a = new Animal();
//		a.walk();
//		a.run();
		
		Walk h1 = new Human();
		Run h2 = new Human();
		h1.walk();
		h2.run();
	}

}
