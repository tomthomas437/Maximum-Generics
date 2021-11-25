package com.generics;
import java.util.Scanner;

public class TestMax {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			Maximum max = new Maximum();
			
			System.out.print(" Please enter the first value: ");
			float first = scan.nextFloat();
			
			System.out.print(" Please enter the second value: ");
			float second = scan.nextFloat();
			
			System.out.print(" Please enter the third value: ");
			float third = scan.nextFloat();
			
			max.floatMax(first, second, third);
			
			scan.close();
		}

	}

