package com.bridgelabz.programs;
import java.util.Scanner;
public class VendingMachine {

	static int amount,remaining,notes = 0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount");
		amount = sc.nextInt();
		remaining = amount;
		
		while(remaining != 0)
		{
		if(amount>=1000)
		{
		amount = amount-1000;
		remaining = amount;
		System.out.print("1000 ");
		notes++;
		}
		
		else if(amount >=500 && amount<1000)
		{
			amount = amount -500;
			remaining =amount;
			System.out.print("500 ");
			notes++;

		}
		
		else if(amount >= 100 && amount<500)
		{
			amount = amount -100;
			remaining =amount;
			System.out.print("100 ");
			notes++;

		}
		
		else if(amount >= 50 && amount<100)
		{
			amount = amount -50;
			remaining =amount;
			System.out.print("50 ");
			notes++;

		}
		
		else if(amount >= 10 && amount<50)
		{
			amount = amount -10;
			remaining =amount;
			System.out.print("10 ");
			notes++;

		}
		
		else if(amount >= 5 && amount<10)
		{
			amount = amount -5;
			remaining =amount;
			System.out.print("5 ");
			notes++;

		}
		
		else if(amount >= 2 && amount<5)
		{
			amount = amount -2;
			remaining =amount;
			System.out.print("2 ");
			notes++;

		}
		
		else if(amount >= 1 && amount<2)
		{
			amount = amount -1;
			remaining =amount;
			System.out.print("1 ");
			notes++;
		}
		
		}
		System.out.println();
		if(notes==1)
		System.out.println(notes+" note is needed");
		else
		System.out.println(notes+" notes are needed");
	}

}
