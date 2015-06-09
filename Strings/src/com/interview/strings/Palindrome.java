package com.interview.strings;

public class Palindrome {

	String input;
	public static void main(String [] args) {
		System.out.println(isPalindrome("abbc"));
	}
	
	private static boolean isPalindrome(String s1){
		
		for(int i=0; i<s1.length()/2; i++){
			if(s1.charAt(i)!=s1.charAt(s1.length()-i-1)){
				// testing github commands
				return false;
			}
		}
		return true;
	}
	
	private Palindrome(String inp) {
		this.input = inp;
	}
	
}

//test comment from code
//test comment from code
//test comment from code