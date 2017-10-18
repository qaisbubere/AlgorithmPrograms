/****************************************************************************** 
 *  Purpose: to sort a string array using insertion sort.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   16-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.util.Scanner;

public class InsertionSort {
	
		static Scanner scanner= new Scanner(System.in);
		
		public static void main(String[] args) {
		
		System.out.println("enter size of array");
		int size = scanner.nextInt();
		String stringarray[] = new String[size];		
		String stringarray1[] = Utility.insertionForString(size,stringarray);
		for(int i =0;i<size;i++)
		{
		System.out.println(stringarray1[i]);
		}
	}

}
