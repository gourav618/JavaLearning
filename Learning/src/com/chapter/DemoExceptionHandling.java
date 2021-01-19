package com.chapter;

//custom exception
class customException extends Exception{
	customException(String s){
		super(s);
	}
	
	customException(Exception e){
		super(e);
	}
}

class ThrowsDemo{
	//throws used in method signature
	public  int divide(int a,int b) throws RuntimeException{
		return a/b;
	}
}

//multiple catch block sample and finally
public class DemoExceptionHandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//try-catch-finally
		int denominator = 1; //goes to catch when 0
		
		try {
			System.out.println(29/denominator);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("it will run no matter what");
		}
		
		
		//throw key words
		try {
		int a=50,b=0;
		if(b==0)
			throw new Exception("Divide by Zero Exception");
		System.out.println("Result : "+a/b );
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//type exception unhandled(i.e exception type should be in try catch block as above) so we use runtimeexception(Eg below) -->uncomment below to see the exception
		//to handle above issue we add throws to method(main) -->method implemented to show this 
		/*
		int a=50,b=0;
		if(b==0)
			throw new Exception("Divide by Zero Exception");
		System.out.println("Result : "+a/b );
		*/
		
		int a=50,b=0;
		if(b==0)
			throw new RuntimeException("Divide by Zero Exception");
		System.out.println("Result : "+a/b );
		
		//throws sample
		ThrowsDemo d = new ThrowsDemo();
		d.divide(3, 0);
		
		//throwing custom exception
		try {
		if(b==0)
			throw new customException("Divide by 0 exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
