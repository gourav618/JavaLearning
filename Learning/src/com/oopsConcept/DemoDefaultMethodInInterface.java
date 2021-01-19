package com.oopsConcept;

//From java 8 we can add default implemetation for interface method
interface Welcome{
	
	//default method
	default void say() {
		System.out.println("Hello from interface default Method");
	}
	
	//abstract method
	void hello(String msg);  //if this method made private then cannot be called
	
	//static method
	public static void display() {
		System.out.println("calling static interface method");
	}
}

public class DemoDefaultMethodInInterface implements Welcome{
	//Implementation of abstract method
	@Override
	public void hello(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoDefaultMethodInInterface d = new DemoDefaultMethodInInterface();
		d.say();
		//if this method made private then cannot be called
		d.hello("Happy Learning!!");
		
		/*
		d.display(); //-->can't call this from here
		*/
	}

}
