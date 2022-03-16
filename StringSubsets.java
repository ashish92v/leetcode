package com.test;

import java.util.ArrayList;
import java.util.List;

public class StringSubsets {

	public static void main(String args[]) {
	    String word = "abc";
        char[] ch = word.toCharArray();
         StringBuilder sb = new StringBuilder();
         List<List<Character>> finalR = new ArrayList<>();
         List<Integer> lista = new ArrayList<>();
        
         countVowel(0, ch, 0, new ArrayList(), finalR);
       finalR.stream().forEach(i-> {
    	   int count = 0;
    	   StringBuilder newS = new StringBuilder();
    	 
    	   i.forEach(j-> {
    		   newS.append(j);
    	   });
    	   String newWord = newS.toString();
    	   if(newWord.contains("a") || newWord.contains("i") || newWord.contains("e") || newWord.contains("o") || newWord.contains("u")){
    		   lista.add(Integer.valueOf(count));
   		}
    	   
       });
       
       System.out.println(lista.size());
     
    }
    
    public static void countVowel(int index, char[] ch, int count, List<Character> result,
    		List<List<Character>> finalR){
       
    	finalR.add(new ArrayList(result));
    
        
        for(int i=index;i<ch.length;i++){
        	
        	if(result.size()>0 && result.get(result.size()-1)==ch[i]) {
        		continue;
        	}
        		
                result.add(ch[i]);
                countVowel(i+1, ch, count, result,finalR);
               result.remove(result.size()-1);
            }
            
		
	}
	
}

