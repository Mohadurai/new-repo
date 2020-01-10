package org.test;

public class VarStatic  
{
	//int emId = 30;
    static int emId = 20;
     
	private void emId()
	{ 
		int emId = 10;
		
      System.out.println("aa"+emId);		

	}
	public static void main(String[] args)
	{		
		VarStatic e2 = new VarStatic();
		VarStatic e1 = new VarStatic();
		System.out.println("bb"+emId);
		e1.emId();
		e2.emId = 200;
		System.out.println(emId);
		
	}

}
