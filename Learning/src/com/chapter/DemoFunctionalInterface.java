package com.chapter;

import java.lang.Thread;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Java program to demonstrate lamda expressions to implement 
//a user defined functional interface. 

@FunctionalInterface
interface Square 
{ 
 int calculate(int x); 
} 

public class DemoFunctionalInterface {

	public static void main(String[] args) {
	
		// Java program to demonstrate functional interface
		// create anonymous inner class object 
        new Thread(new Runnable() 
        { 
        	 @Override
             public void run() 
             { 
                 System.out.println("New thread created"); 
             }
        }).start(); 
        
        // lambda expression to create the object 
        new Thread(()-> 
           {System.out.println("New thread created");}).start(); 
        
        int a = 5; 
        
        // lambda expression to define the calculate method 
        Square s = (int x)->x*x; 
  
        // parameter passed and return type must be 
        // same as defined in the prototype 
        int ans = s.calculate(a); 
        System.out.println(ans); 
        
        // create a list of strings 
        List<String> names = 
            Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2"); 
  
        // declare the predicate type as string and use 
        // lambda expression to create object 
        Predicate<String> p = (s1)->s1.startsWith("G"); 
  
        // Iterate through the list 
        for (String st:names) 
        { 
            // call the test method 
            if (p.test(st)) 
                System.out.println(st); 
        }

	}

}
