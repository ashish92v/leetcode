package com.test;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

	public static void main(String args[]) {
		System.out.println(Integer.bitCount(0));
		System.out.println(Integer.bitCount(3));
		int turnedOn = 1;
		readBinaryWatch(turnedOn);
		
	}
	
	 public static List<String> readBinaryWatch(int turnedOn) {
	       
	       List<String> result = new ArrayList<>();
	       for(int hour=0;hour<12;hour++){
	           for(int min=0;min<60;min++){
	        	   System.out.println("hour: "+hour+" "+"min: "+min+" "+Integer.bitCount(hour)+Integer.bitCount(min));
	              // main condition we need to add hour and mins bitcounts
	        	   // what is bit count ?
	        	   // it is number of 1-bits in 2's compliment binary
	        	   if(Integer.bitCount(hour)+Integer.bitCount(min)==turnedOn){
	                   String newTime= hour+":";
	                   // if min less than 10 then append 0, e;g 7:0
	                   if(min<10){
	                       newTime+="0";
	                   }
	                   // now append minute, e;g 7:02
	                   newTime+=min;
	                   result.add(newTime);
	               }
	           }
	       }
	       return result;
	    }
}
