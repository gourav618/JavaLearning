package com.chapter;

class Student{
	String name;
	int marks;
	
	//default constructor
	public Student() {
		//calls the constructor with string param
		this("Meghan");
	}
	
	public Student(String name) {
		//calls the constructor with string and int param
		this(name,70);
	}
	
	public Student(String name,int marks) {
		//this keyword used to refer current object-->instance var
		this.name = name;
		this.marks = marks;
	}
	
	void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Marks: "+marks);
	}
}

//This sample class
class Message{
	
	Message(){
		//calls the parameterized constructor from default using this()
		this("Gourav");
		System.out.println("Welcome to this() keyword demo calling constructor");
	}
	
	Message(String name){
		System.out.println(name);
	}
}

public class DemoConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.display();
		
		//when object of class is created then default contructor called
		Message m = new Message();
		
	}

}
