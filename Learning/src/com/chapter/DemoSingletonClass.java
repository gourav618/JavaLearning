package com.chapter;

class Singleton{
	static Singleton instance = null;
	int x = 10;
	
	//private constructor can't be accessed from outside
	private Singleton() { }
	
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		
		return instance;
	}
}

public class DemoSingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		a.x = a.x + 10;
		System.out.println("value of a.x: "+a.x);
		System.out.println("value of b.x: "+b.x);
		
		//We changed value of a.x, value of b.x also got updated because both ‘a’ and ‘b’ refer to same object, i.e., they are objects of a singleton class.

	}

}
