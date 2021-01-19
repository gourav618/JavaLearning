package com.chapter;

public class HelloWorld {
	
	//can't be called without creating Object
	public void nonStaticTest() {
		System.out.println("Non Static Method");
	}
	
	public static void staticTest() {
		System.out.println("Static Method");
	}
	
	private static void modifierTest() {
		System.out.println("private Modifier Test");
	}
	
	protected static void modifierTest1() {
		System.out.println("protected Modifier Test");
	}

	//public-->Access Modifier -->gives visibility
	//static--> i.e static method so,we dont need to create Object to invoke this method
	//String []args --> for command line argument
	public static void main(String []args) {
		
		HelloWorld h = new HelloWorld();
		
		h.nonStaticTest();
		staticTest(); //called without creating Object
		//Same class so accessible
		modifierTest();
		modifierTest1();
		System.out.println("Hello World!!");
	}
}
