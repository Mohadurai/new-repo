package org.test;

public class VarIns
{
	
	//instance variable
	static int emId = 10; 
	private void emId() 
	{
		emId = 12;
		System.out.println("aa"+emId);
			}
	public static void main(String[] args)
	{
		VarIns vi = new VarIns();
		vi.emId = 20;
		System.out.println(vi.emId);
		vi.emId();
		System.out.println("b"+emId);
		System.out.println("c"+emId);
	}
}
