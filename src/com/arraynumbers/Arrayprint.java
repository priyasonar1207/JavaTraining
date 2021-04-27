package com.arraynumbers;

public class Arrayprint {
	
	public void printArrayData()
	
	{
		int [] Age = {4,12,14,15,18,20};
		

		   
		   System.out.println("Accessing Elements of Array:");
		   System.out.println("First Element: " + Age[0]);
		   System.out.println("Second Element: " + Age[1]);
		   System.out.println("Third Element: " + Age[2]);
		   System.out.println("Fourth Element: " + Age[3]);
		   System.out.println("Fifth Element: " + Age[4]);
		   System.out.println("Fifth Element: " + Age[5]);
			
				
	}

	public static void main(String[] args) {
		
		Arrayprint objArrayprint=new Arrayprint();
		objArrayprint.printArrayData();

	}

}
