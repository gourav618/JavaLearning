package com.oopsConcept;

//parent class
class Manager{
	int salary = 10000;
}

//subclass inheriting parent
class Employee extends Manager{
	
}

public class DemoInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		//var inherited from parent
		e.salary = 1000;
		System.out.println("employee salary: "+e.salary);
		
		Manager m = new Manager();
		System.out.println("manager salary: "+m.salary);

	}

}
