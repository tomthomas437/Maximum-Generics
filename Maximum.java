package com.generics;

public class Maximum {
	
	public <T extends Comparable<T>> void GenMax(T first, T second, T third) {
		T max = first;
		if (second.compareTo(max) > 0) {	
			max = second;
		}
		 if (third.compareTo(max) > 0) {
			max = third;
		}  System.out.println(" \n ----------------------------- \n The largest value is " + max);
   } 
	
}




