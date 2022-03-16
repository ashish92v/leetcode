package com.test;

public class ValidAnagram {

	public static void main(String args[]) {
		System.out.println(0 - 'a');
		isAnagram("anagram", "nagaram");
	}
	
	public static boolean isAnagram(String s, String t) {
	    if (s.length() != t.length()) {
	        return false;
	    }
	    int[] table = new int[26];
	    System.out.println("s.charAt(i)"+('n'-'a'));
	    for (int i = 0; i < s.length(); i++) {
	        table[s.charAt(i) - 'a']++;
	    }
	    for (int i = 0; i < t.length(); i++) {
	        table[t.charAt(i) - 'a']--;
	        if (table[t.charAt(i) - 'a'] < 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
