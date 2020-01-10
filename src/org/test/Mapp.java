package org.test;

import java.util.*;

public class Mapp {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
//		Map<Integer, String> m = new LinkedHashMap<>();
//		Map<Integer, String> m = new TreeMap<>();
//		Map<Integer, String> m = new Hashtable<>();
		m.put(900, "java");
		m.put(8330, "sql");
		m.put(30, "As");
		String s = m.get(30);
		System.out.println(s);
		Set<Integer> s1 = m.keySet();
		System.out.println(s1);
Collection<String> s2 = m.values();
System.out.println(s2);
for (String s4 : s2) {
	System.out.println(s1);
	
}
	
	}

}
