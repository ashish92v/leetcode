package com.test;

import java.util.Arrays;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
			List<String> list= Arrays.asList("abcde","abcrt","abc","abd","ac");
			
			int temp = Integer.MAX_VALUE;
			int index =0;
			
			for(int i=0;i<list.size();i++){
				
				if(temp<list.get(i).length()) {
					temp = Math.min(temp, list.get(i).length() );
					index = i;
				}
				
			}
			
			String word = list.get(index);
			String newWord ="";
			
			for(int i =0;i<list.size();i++) {
				
				 newWord =  getMinimumString(word, list.get(i), false);
				
			}
			System.out.println(newWord);
			
	}
	
	public static String getMinimumString(String word, String firstValue, boolean flag) {
		
		while(!flag) {
			if(firstValue.startsWith(word)) {
				flag = true;
			}else {
				word = word.substring(0,word.length()-1);
			}
		}
			return word;
		
	}

}
