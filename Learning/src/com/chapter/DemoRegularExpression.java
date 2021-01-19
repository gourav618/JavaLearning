package com.chapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pattern = "[a-zH]+";
		String check = "Happy Learning";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m =p.matcher(check);
		
		while(m.find()) {
			System.out.println(check.substring(m.start(), m.end()));
		}
		
		
		String s2 = "I will in the room in 10 minutes.";
		//match all words "in" (considering the word is not at the boundary of another word)
		Pattern p1 = Pattern.compile("\\bin\\b");
		Matcher m1 = p1.matcher(s2);
		while(m1.find()) {
			System.out.println(s2.substring(m1.start(), m1.end()));
			//System.out.println("PATTERN MATCHES: "+m.group() +" at "+m.start());
		}
	}

}
