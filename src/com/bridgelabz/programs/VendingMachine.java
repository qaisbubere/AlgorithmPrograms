/****************************************************************************** 
 *  Purpose: program for money vending machine.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   16-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import java.util.Scanner;

public class VendingMachine {

	static int amount,remaining,notes = 0;
	static int thousandNotes=0, fiveHundredNotes=0, hundredNotes=0, fiftyNotes=0, tenNotes=0, fiveNotes=0, twoNotes=0, oneNotes=0;; 

	public static void main(String[] args) {
	dispenseCash();
	individualNotesRequired();
	}
	
	
	/*
	 * method to calculate notes required to dispense the entered amount
	 */
	public static void dispenseCash()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter amount");
		amount = scanner.nextInt();
		remaining = amount;
		
		while(remaining != 0)
		{
			if(amount>=1000)
			{
				amount = amount-1000;
				remaining = amount;
				System.out.print("1000 ");
				notes++;
				thousandNotes++;
			}
			
			else if(amount >=500 && amount<1000)
			{
				amount = amount -500;
				remaining =amount;
				System.out.print("500 ");
				notes++;
				fiveHundredNotes++;
			}
			
			else if(amount >= 100 && amount<500)
			{
				amount = amount -100;
				remaining =amount;
				System.out.print("100 ");
				notes++;
				hundredNotes++;
			}
			
			else if(amount >= 50 && amount<100)
			{
				amount = amount -50;
				remaining =amount;
				System.out.print("50 ");
				notes++;
				fiftyNotes++;
			}
			
			else if(amount >= 10 && amount<50)
			{
				amount = amount -10;
				remaining =amount;
				System.out.print("10 ");
				notes++;
				tenNotes++;
			}
			
			else if(amount >= 5 && amount<10)
			{
				amount = amount -5;
				remaining =amount;
				System.out.print("5 ");
				notes++;
				fiveNotes++;
			}
			
			else if(amount >= 2 && amount<5)
			{
				amount = amount -2;
				remaining =amount;
				System.out.print("2 ");
				notes++;
				twoNotes++;
			}
			
			else if(amount >= 1 && amount<2)
			{
				amount = amount -1;
				remaining =amount;
				System.out.print("1 ");
				notes++;
				oneNotes++;
			}
		
		}
		System.out.println();
		if(notes==1)
		System.out.println(notes+" note is needed");
		else
		System.out.println(notes+" notes are needed");
		
	}
	
	
	/*
	 * method to display count of each notes required to dispense the cash
	 */
	public static void individualNotesRequired()
	{
		System.out.println("1000 :"+thousandNotes);
		System.out.println("500  :"+fiveHundredNotes);
		System.out.println("100  :"+hundredNotes);
		System.out.println("50   :"+fiftyNotes);
		System.out.println("10   :"+tenNotes);
		System.out.println("5    :"+fiveNotes);
		System.out.println("2    :"+twoNotes);
		System.out.println("1    :"+oneNotes);
	}
	
}
