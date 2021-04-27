package com.arraynumbers;

public class ArrayCopy {
	

	public static void main(String[] args) {
		
	int intArr1[]= {1,2,3,4,5};
	int intArr2[]= new int[intArr1.length];

	for (int i = 0; i < intArr1.length; i++) {     
        intArr2[i] = intArr1[i];     
    }      
      
      System.out.println("Elements of Arr1");
      
      for(int i=0; i<= intArr1.length; i++)
      {
    	  System.out.print(intArr1[i]);
    	  
      }
      
      System.out.println();
      
      
  System.out.println("Elements of Arr2");
      
      for(int i=0; i<= intArr2.length; i++)
      {
    	  
    	  System.out.println(intArr2[i]);
      }
	}

}
