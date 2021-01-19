package com.chapter;

public class AccesModifierTest {
	
	final int number = 10;  //Instance Variable since it is at class level

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld h = new HelloWorld();
		//since public
		h.nonStaticTest();
		
		//Not Visisble throws error
		//h.modifierTest();
		
		//same package so protected Accesible
		h.modifierTest1();
		
		//throws error since cannot change
		//number = 11;
		
		String a = "abce";
		String b = new String(a);
		if(a == b)
			System.out.println(a);
		else
			System.out.println((a == b)+" "+a.equals(b));
	}

}
