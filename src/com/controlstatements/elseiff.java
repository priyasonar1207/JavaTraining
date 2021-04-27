package com.controlstatements;

public class elseiff {
	

	public void verifyCollegeName(String strClgName)
	{
		if(strClgName.equals("Colonel's Academy"))
		{
			System.out.println("Colonel's Academy");
		}
		
		else if(strClgName.equals("Army Public School"))
		{
			System.out.println("Army Public School");
		}
		else
		{
			System.out.println("Invalid College Name");
		}
	}
	
	
	public static void main(String[] args)
	
	{
	elseiff elseiff = new elseiff();
	elseiff.verifyCollegeName("abc");
		}
}
