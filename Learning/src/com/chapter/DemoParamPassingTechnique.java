package com.chapter;

//Call by Value 

//Callee 
class CallByValue { 

 // Function to change the value 
 // of the parameters 
 public static void Example(int x, int y) 
 { 
     x++; 
     y++; 
 } 
}

//Call by Reference 

//Callee 
class CallByReference { 

 int a, b; 

 // Function to assign the value 
 // to the class variables 
 CallByReference(int x, int y) 
 { 
     a = x; 
     b = y; 
 } 

 // Changing the values of class variables 
 void ChangeValue(CallByReference obj) 
 { 
     obj.a += 10; 
     obj.b += 20; 
 } 
} 

public class DemoParamPassingTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a = 10; 
        int b = 20; 
  
        // Instance of class is created 
        CallByValue object1 = new CallByValue(); 
  
        System.out.println("Value of a: " + a 
                           + " & b: " + b); 
  
        // Passing variables in the class function 
        object1.Example(a, b); 
  
        // Displaying values after 
        // calling the function 
        System.out.println("Value of a: "
                           + a + " & b: " + b); 
        
        //--------------------------------------------//
        // Instance of class is created 
        // and value is assigned using constructor 
        CallByReference object 
            = new CallByReference(10, 20); 
  
        System.out.println("Value of a: "  + object.a   + " & b: " + object.b); 
  
        // Changing values in class function 
        object.ChangeValue(object); 
  
        // Displaying values 
        // after calling the function 
        System.out.println("Value of a: " + object.a   + " & b: " + object.b);

	}

}
