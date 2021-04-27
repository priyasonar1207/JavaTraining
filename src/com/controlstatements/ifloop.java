package com.controlstatements;

public class ifloop {
	
	
public void verifyCollegeName(String strClgName)
		{
			if(strClgName.equals("Colonel's Academy"))
			{
				System.out.println("Going to Colonel's Academy");
			}
			else
			{
				System.out.println("Invalid College Name");
			}
		}
		
		
		public static void main(String[] args)
		
		{
			ifloop objifloop = new ifloop();
			objifloop.verifyCollegeName("Colonel's Academy");
			}
	}


	

