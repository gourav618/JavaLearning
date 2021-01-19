package com.chapter;

//String && StringBuffer && StringBuilder
public class DemoString {
	
	public static void stringSample() {
		System.out.println("=========String sample Start==========");
		String s1 = "Hello";
		String s2 = "Hello"; //"World";
		int i=10;
		
		//Int to string
		System.out.println(String.valueOf(i));
//		comparison -->the value 0 if the argument string is equal tothis string; a value less than 0 if this stringis lexicographically less than the string argument; 
//		and avalue greater than 0 if this string islexicographically greater than the string argument.
		System.out.println(s1.compareTo(s2));

		System.out.println(s1.equals(s2));
		
		//case Change
		System.out.println(s1.toUpperCase()+" "+s1.toLowerCase());
		
		System.out.println("length of s1: "+s1.length());
		//Substring
		System.out.println(s1.substring(2, 4));
		//replace
		System.out.println(s1.replace("l", "d"));
		//contains
		System.out.println(s1.contains("d"));
		//charAt\
		System.out.println(s1.charAt(2));
		
		System.out.println("=========String sample End==========");
		
	}
	
	public static void stringBufferSample() {
		System.out.println("=========StringBuffer sample Start==========");
		StringBuffer s1 = new StringBuffer("welcome");
		
		StringBuffer s2 = s1.append(" to the jungle!!");
		
		System.out.println(s2);
		//replace
		System.out.println(s2.replace(0, 7, "Here"));
		//delete
		System.out.println(s2.delete(s2.length()-1, s2.length()));
		
		System.out.println(s2.reverse());
		
		System.out.println("=========StringBuffer sample End==========");
		
	}
	
	public static void stringBufferReaderSample() {
		System.out.println("=========StringBuilder sample Start==========");
		
		StringBuilder s1 = new StringBuilder("welcome");
		
		StringBuilder s2 = s1.append(" to the jungle!!");
		
		System.out.println(s2);
		//replace
		System.out.println(s2.replace(0, 7, "Here"));
		//delete
		System.out.println(s2.delete(s2.length()-1, s2.length()));
		
		System.out.println(s2.reverse());
		
		System.out.println("=========StringBuilder sample End==========");
		
	}

	public static void main(String[] args) {
		
		stringSample();
		stringBufferSample();
		stringBufferReaderSample();
		
	}

}
