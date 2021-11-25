package com.generics;

public class Maximum <T extends Comparable<T>> {
	
	T first;
	T second;
	T third;
	
	public Maximum(T first, T second, T third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public void testMaximum() {
		T prntmax = testMaximum(this.first, this.second, this.third);
		 printMaximum(prntmax);
	}
	
	public static <T extends Comparable<T>> T testMaximum(T first, T second, T third) {
		T max = first;
		if (second.compareTo(max) > 0) {	
			max = second;
		}
		 if (third.compareTo(max) > 0) {
			max = third;
		}  System.out.println(" \n ----------------------------- \n The largest value is " + max);
		return max;
	}  
	
	public void printMaximum(T prntmax) {
		System.out.println(" largest value = " + prntmax);
	}
}




