/****************************************************************************** 
 *  Purpose: to sort an integer array using bubble sort.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   16-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.util.Scanner;

public class Bubblesort {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[])
	{
		System.out.println("enter size of array");
		int size = scanner.nextInt();
		int intArray[] = new int[size];
		Utility.bubbleForInt(intArray,size);	
	}
}