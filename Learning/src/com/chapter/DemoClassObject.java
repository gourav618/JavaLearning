package com.chapter;

class Demo{
	int i;
	
	//default contructor ,even not written it added by default in java
	Demo(){
		i = 100;
	}
	
	//parameterized
	Demo(int value){
		i = value;
	}
	//constructor overloading
	Demo(int value,int value1){
		i = value;
	}
	
	void printMessage() {
		System.out.println("welcome to class through Object!!");
	}
}

public class DemoClassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = new Demo();
		Demo d1 = new Demo(400);
		
		System.out.println("Default Contructor: "+d.i);
		System.out.println("Parameterized Constructor: "+d1.i);
		d.printMessage();

	}

}
