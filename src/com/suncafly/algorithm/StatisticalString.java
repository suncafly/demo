package com.suncafly.algorithm;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StatisticalString {


	
	public static void main(String[] args) {
		
		String str = "afffbaaaaba";
		char c[] = str.toCharArray();
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for (int i = 0; i < c.length; i++) {
			char v = c [i];
			if(map.containsKey(v)){
				map.put(v, map.get(v) + 1);
			}else{
				map.put(v, 1);
			}
		}
		
		System.out.println(map.toString());
		
		//65-90 97-122
		List<String> lst = new LinkedList<String>();
		lst.add("a");
		lst.add("c");
		lst.add("b");
		lst.add("a");
		System.out.println(lst.toString());
		
	}
}
