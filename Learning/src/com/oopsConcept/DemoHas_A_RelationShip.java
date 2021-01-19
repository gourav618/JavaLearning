package com.oopsConcept;

class Name{
	String first,last;
	
	public Name(String first,String last) {
		this.first = first;
		this.last = last;
	}
}

class EmployeeInfo{
	int id;
	Name name;  //Has-A relation Ship
	
	EmployeeInfo(int id,Name name){
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println("id: "+this.id);
		System.out.println("name: "+name.first+" "+name.last);
	}
}

public class DemoHas_A_RelationShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//name is loosely coupled
		Name n = new Name("Gourav","Sharma");
		EmployeeInfo e = new EmployeeInfo(1,n);
		e.display();

	}

}
