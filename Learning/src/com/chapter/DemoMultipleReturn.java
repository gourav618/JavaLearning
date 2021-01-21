package com.chapter;

import java.util.Arrays;
import java.util.List;

import javafx.util.Pair;

class Test{
	//returning multiple values when type same
	int [] getSumSub(int a,int b) {
		int ans[] = new int[2];
		ans[0] = a+b;
		ans[1] = a-b;
		
		return ans;
	}
	
	//if return type are different and only 2 -->use pair
	
	public Pair<Integer,String> getTwo(){
		return new Pair<Integer,String>(10,"Pair returning!!");
	}
}

//We can encapsulate all returned types into a class and then return an object of that class.
class multiple{
	int mul,add;
	double div;
	multiple(int mul,int add,double div){
		this.mul = mul;
		this.add = add;
		this.div = div;
	}
}

public class DemoMultipleReturn {
	
	// Returning multiple values of different 
    // types by returning an object 
	static multiple operation(int a,int b) {
		return new multiple(a*b,a+b,a/b);
	}
	
	//returning Mutliple value as List<Object>
	static List<Object> getDetails(){
		String name = "Gourav";
		int age = 24;
		char gender = 'M';
		
		return Arrays.asList(name,age,gender);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		
		int r[] = t.getSumSub(10, 5);
		System.out.println("Sum of no: "+r[0]);
		System.out.println("Subtraction of no: "+r[1]);
		
		Pair<Integer,String> p = t.getTwo();
		System.out.println(p.getKey()+" "+p.getValue());
		
		multiple m = operation(10,20);
		System.out.println(m.add+" "+m.div+" "+m.mul);
		
		List<Object> o = getDetails();
		System.out.println(o);
	}

}
