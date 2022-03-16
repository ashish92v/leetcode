package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentCourse {
	
	public static void main(String args[]) {
		
		 String[][] studentCoursePairs1 = {
			      {"58", "Linear Algebra"},
			      {"94", "Art History"},
			      {"94", "Operating Systems"},
			      {"17", "Software Design"},
			      {"58", "Mechanics"},
			      {"58", "Economics"},
			      {"17", "Linear Algebra"},
			      {"17", "Political Science"},
			      {"94", "Economics"},
			      {"25", "Economics"},
			      {"58", "Software Design"}
			    };
		 
		Map<String, String> map =  computeSubject(studentCoursePairs1);
		System.out.println(map);
		 
	}
	

	  public static Map<String, String> computeSubject(String[][] studentSubjectPair){
		    int entries = studentSubjectPair.length;
		    HashMap<String, List<String>> map = new HashMap<>();
		    
		    for(String[] pair:studentSubjectPair ){
		      String id = pair[0];
		      String subject = pair[1];
		          
		      if(map.containsKey(id)){
		        List<String> existingSub = map.get(id);
		        existingSub.add(subject);
		         map.put(id, existingSub);
		      }else{
		        List<String> existingSub = new ArrayList<>();
		        existingSub.add(subject);
		        map.put(id, existingSub);
		      }
		  }
		    //return map;
		    
		   List<String> student = new ArrayList<>();
		   Map<String, String> processedMap = new HashMap<>(); 
		    
		    for(Map.Entry<String, List<String>> reslt : map.entrySet()){
		   
		      Set<String> set = new HashSet<>();
		      Set<String> idSet = new HashSet<>();
			  StringBuilder finalSb = new StringBuilder();
			  
			  for(String subj:reslt.getValue() ){
					set.add(subj);
	            }
		           
		        for(Map.Entry<String, List<String>> reslt2Entry : map.entrySet()){
		           StringBuilder sb = new StringBuilder();

		           sb.append(reslt.getKey());
		            sb.append(reslt2Entry.getKey());
		           
		          if((reslt.getKey()!=reslt2Entry.getKey() || reslt2Entry.getKey()!=reslt.getKey())){
		             sb.append(reslt.getKey());
		             sb.append(reslt2Entry.getKey());
		          
		          
				   for(String subj2:reslt2Entry.getValue() ){
		              if(set.contains(subj2)){
							finalSb.append(subj2);
		              }
		           }
		            
		             
		            }
		          
		          processedMap.put(sb.toString(),finalSb.toString() );
		          }
		        }
		          
		          return processedMap;
		    
		}
}
