package org.test;

public class Var {

	
	private void empId()
	{
		//local variable 
	int empId = 100;
	System.out.println(empId);

	}
	public static void main(String[] args)
	{
		int empId = 20;
		
	Var v1 = new Var();
	//Var v2 = new Var();
	v1.empId();
	System.out.println(empId);
	
	}
}
