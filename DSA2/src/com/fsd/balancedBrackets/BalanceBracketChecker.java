package com.fsd.balancedBrackets;

import java.util.*;

public class BalanceBracketChecker {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
    	String str = scn.nextLine();
          
	 
		// String str = "{(}[]";
		
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i <str.length(); i++) {
			
			if(str.charAt(i) == '{' || str.charAt(i) =='[' || str.charAt(i) == '(') {
				st.push(str.charAt(i));
				
			}else if (!st.empty() && (
					(str.charAt(i) == ']' && st.peek() == '[') ||
					(str.charAt(i) == '}' && st.peek()=='{' ) ||
					(str.charAt(i) == ')' && st.peek() == '('))) {
				st.pop();
				
			} else {
				st.push(str.charAt(i));
			}
		}
	
	  if(st.empty()) {
		System.out.println("The entered String has Balanced Brackets");
		
	  }else {
		System.out.println("The entered String do not contain Balanced Brackets"); 
	  }
	  }

}
