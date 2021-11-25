package com.generics;
import java.util.Scanner;

public class TestMax {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			MaxInteger max = new MaxInteger();
			
			System.out.print(" Please enter the first value: ");
			int first = scan.nextInt();
			
			System.out.print(" Please enter the second value: ");
			int second = scan.nextInt();
			
			System.out.print(" Please enter the third value: ");
			int third = scan.nextInt();
			
			max.IntMax(first, second, third);
			
			scan.close();
		}

	}

