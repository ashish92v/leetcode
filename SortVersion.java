package com.test;

public class SortVersion {

	public static void main(String args[]) {
		String version1 = "1.0.1";
		String version2 = "1.0";
		
		compCheck(version1, version2);
		
	}
	
	public static int compCheck(String version1, String version2) {
		String[] s = version1.split(".");
		String[] s2 = version2.split(".");
		int len = Math.min(s.length,s2.length);
		
		if(s.length>s2.length) {
			
		}
		
		for(int i=0;i<len;i++) {
			if(Integer.parseInt(s[i]) > Integer.parseInt(s2[i])) {
				return 1;
			}else if(Integer.parseInt(s[i]) > Integer.parseInt(s2[i])) {
				return -1;
			}else {
				return 0;
			}
		}
		
		return 0;
		
	}
}
