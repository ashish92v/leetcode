package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRU extends LinkedHashMap<Integer, Integer>{
	int cap;
	
	public LRU(int cap) {
		super(cap, 0.72F, true);
		this.cap = cap;
	}

	@Override
	public boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
		return size()>cap;
		
	}
	
}

