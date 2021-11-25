package com.generics;

public class Maximum {
	
	public void IntMax(Integer first, Integer second, Integer third) {
		int max = first;
		if (second.compareTo(max) > 0) {	
			max = second;
		}
		 if (third.compareTo(max) > 0) {
			max = third;
		}  System.out.println("The maximum number is " + max);
   } 
	
	public void floatMax(Float first, Float second, Float third) {
		Float fmax = first;
		if (second.compareTo(fmax) > 0) {	
			fmax = second;
		}
		 if (third.compareTo(fmax) > 0) {
			fmax = third;
		}  System.out.println("The maximum number is " + fmax);
   } 
}



