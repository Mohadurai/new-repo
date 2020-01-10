package org.test;

public class stringg {
	public static void main(String[] args) {
		String s1 = "mohan";
		String s2 = "tech";
		String s3 = "9865232819";
		String s4 = "j a v a i s b e s t ";
		
		//length 
		int a = s1.length();
		System.out.println(a);
		
		int a1 = s3.length();
		System.out.println(a1);
		
		int a2 = s4.length();
		System.out.println(a2);
		
		
		String b = s1.concat(s2);
		System.out.println("ma   " + b);
		
		boolean c = s1.equals(s2);
		System.out.println("ma   " + c);
		int d = s1.codePointCount(0, 3);
		System.out.println(d);
	}

}
