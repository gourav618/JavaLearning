package com.oopsConcept;

//since we have abstract method we need to make class as abstract
abstract class mobile{
	//default constructor -->executed when object created
	mobile(){
		System.out.println("mobile is the base class");
	}
	//Abstract Method
	abstract void run();
	
	//may or maynot have all method as abstract
	void dialNumbers() {
		System.out.println("Nos are dialed from Nokia mobile");
	}
}

//need to Implement abstarct method of class mobile if here we dont want to add abstract 
class nokia extends mobile {
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("nokia is derived class");
	}
}

public class DemoAbstractMethodAndClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mobile m = new nokia();
		m.run();
		m.dialNumbers();

	}

}
