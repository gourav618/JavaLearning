package com.oopsConcept;

//method overloading-->can be on diff no of param and types
class MethoidOverload{
	public void display(int x) {
		System.out.println("Integer: "+x);
	}
	public void display(String s) {
		System.out.println("String: "+s);
	}
}

public class MethodOverLoading_OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method overloading initiated
		MethoidOverload ol = new MethoidOverload();
		ol.display(8);
		ol.display("Eight");

	}

}
