package com.generics;
import java.util.Scanner;

public class TestMax {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			Maximum max = new Maximum();
			
			System.out.print(" Please enter the first String: ");
			String first = scan.next();
			
			System.out.print(" Please enter the second String: ");
			String second = scan.next();
			
			System.out.print(" Please enter the third String: ");
			String third = scan.next();
			
			max.StringMax(first, second, third);
			
			scan.close();
		}

	}

