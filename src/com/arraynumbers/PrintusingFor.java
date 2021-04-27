package com.arraynumbers;

public class PrintusingFor {

	public void printArrayData()
		
		{
			int [] Age = {4,12,14,15,18,20};
			

			 for (int i = 0; i < Age.length; i++) {
		         System.out.println(Age[i] + " ");
		       
		       }
		    }
		      
		public static void main(String[] args) {
			
			PrintusingFor  objPrintusingFor =new PrintusingFor();
			objPrintusingFor.printArrayData();

		}

	}
