package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortMethodsTest {

	
	public static void main(String args[])  {
		
		String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
		List<List<String>>  res = groupAnagrams(strs);
		System.out.println(res);
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) throw new UnsupportedOperationException{

        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        
        for(int i=0;i<strs.length;i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sb = new String(ch);
            
            if(map.containsKey(sb)){
                List<String> list = (List<String>) map.get(sb);
                list.add(sb.toString());
                map.put(sb,list);
            }else{
                List<String> list = Arrays.asList(strs[i]);
                map.put(sb, list);
            }
        }
        
        for(List<String> st: map.values()){
            result.add(st);
        }
        
        
        return result;
    }
    
	
}
