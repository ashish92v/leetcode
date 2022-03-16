package com.test;

public class StringIsPrefixOrNot {

	public static void main(String args[]) {
		
		String s = "iloveleetcode";
		String[] words = {"i","love","leetcode","apples"};
		isPrefixString(s, words);
	}
	
	
	public static boolean isPrefixString(String s, String[] words) {
	
		if(s.length()<words.length) return false;
		
		for(String word : words) {
			
			if(word.equals(s.subSequence(0, word.length()))) {
				s = s.substring(word.length());
				
				if(s.isEmpty()) {
					return true;
				}
			}
			
		}
		
		
		return false;
	}
	
}
