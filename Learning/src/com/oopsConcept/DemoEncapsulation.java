package com.oopsConcept;

class Employee1{
	//var encapsulated and it is access using public getter and setter
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class DemoEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e = new Employee1();
		
		e.setName("Gourav");
		System.out.println(e.getName());
	}

}
