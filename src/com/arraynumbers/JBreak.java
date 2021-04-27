package com.arraynumbers;

public class JBreak {

public static void main(String[] args) {
	

	int  Age[] = new int[4];
		
		Age[0]=10;	
		Age[1]=20;	
		Age[2]=30;	
		Age[3]=40;
		
		for (int i = 0; i <=Age.length; i++)
        {
			
           if (i == 2) {
               break;
           }      
           System.out.println(Age[i]);
	       }
		
}}
	      
