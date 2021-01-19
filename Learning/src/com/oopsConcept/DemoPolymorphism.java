package com.oopsConcept;

class Man{
	void pay() {
		System.out.println("paying bill");
	}
}

class Millionre extends Man{
	void pay() {
		System.out.println("Millionre paying bill and giving tip also");
	}
}

//Super keyword demo
class vechile{
	String noOfWheels = "vechile move because of wheel";
}
class bike extends vechile{
	String noOfWheels = "Has 2 wheels";
	bike(){
	System.out.println(noOfWheels);
	//parent class invoked 
	System.out.println(super.noOfWheels);
	}
}

//run time polymorphism i.e method over riding
public class DemoPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//millionre can be assign to man but not the other way around
		Man m = new Millionre();
		m.pay();
		
		//Super keyword
		bike b = new bike() ;
	}

}
