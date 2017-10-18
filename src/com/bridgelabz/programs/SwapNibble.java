package com.bridgelabz.programs;
import java.util.Scanner;

public class SwapNibble {

	
	public static void nibble()
	{
		int value;
	    String binary;

	    Scanner sc=new Scanner(System.in);	
	    System.out.println("enter decimal number");
	    value=sc.nextInt();
	    binary=Integer.toBinaryString(value);
	    System.out.println(binary);
	}
	public static void main(String[] args) {
		nibble();
	}

}
