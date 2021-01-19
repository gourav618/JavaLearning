package com.oopsConcept;

//Interface Dcelaration
interface Money {
	void operation();
}

//Implementation -->this class must implement inherited abstract method or make the class abstract itself
class debit implements Money{
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("Money debited from account");
	}
}

class credit implements Money{
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("Money credited to account");
	}
}

//Extend an Interface with another interface
interface Walkable{
	void walk();
}

interface Runnable extends Walkable{
	void run();
}

class InterfaceExtended implements Runnable{
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Interface: Walkable");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Interface: Runnable");
	}
}

//Using Interface
public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Money d = new credit();
		d.operation();
		
		InterfaceExtended e = new InterfaceExtended();
		e.walk();
		e.run();

	}

}
