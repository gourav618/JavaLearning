package com.chapter;

class complex{
	
	private double re,im;
	
	//normal parameterized constructor
	public complex(double re,double im){
		System.out.println("normal constructor called");
		this.re = re;
		this.im = im;
	}
	
	//copy constructor
	complex(complex c){
		System.out.println("copy constructor called!!");
		re = c.re;
		im = c.im;
	}
	
	//over ride the toString of object class
	@Override
	public String toString() {
		return "("+re+"+"+im+"i"+")";
	}
}

public class DemoConstructorAndCoprConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		complex c = new complex(10,60);
		
		//copy constructor called
		complex c1 = new complex(c); //if no copy constructor then this will throw error
		
        // Note that following doesn't involve a copy constructor call as  
        // non-primitive variables are just references. 
        complex c2 = c1;    
  
        System.out.println(c1); // toString() of c2 is called here 

	}

}
