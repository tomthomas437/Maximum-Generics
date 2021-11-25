package com.generics;

public class MaxInteger {
	
	public void IntMax(Integer first, Integer second, Integer third) {
		int max = first;    //considering first is max and assigning max to first
		if (second.compareTo(max) > 0) {	
			max = second;              //comparing with first max and if greater that assigning to max
		}
		 if (third.compareTo(max) > 0) {
			max = third;
		}  System.out.println("The maximum number is " + max);
   } 
}


