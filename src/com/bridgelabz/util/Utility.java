/****************************************************************************** 
 *  Purpose: to create various methods in utility class.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   6-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {

	static int choice, size;
	static Scanner scanner = new Scanner(System.in);
	static long startTime,stopTime;
	static int timeArray[] = new int[6];
	static int elapseTime;
	
	/*
	 * method for searching an integer element using binary search
	 */
	public int binarySearchForInt(int intarray[],int size)
	{
		int elementFound=0;
		startTime = System.currentTimeMillis();	
		System.out.println("this is binary searching of integer");
		System.out.println("enter integer elements");
		
		for(int i=0; i<size; i++)
		{
			intarray[i]=scanner.nextInt();
		}
		
		Arrays.sort(intarray);
		
		for(int i:intarray)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println();
		System.out.println("enter a value to be searched");
		int search = scanner.nextInt();
		
		int min = 0;
		int max = intarray.length - 1;
		int mid = (min + max) /2;
		
		
		if(search <= intarray[max] && search >= intarray[min])
		{
		while(elementFound != 1)
		{
			
			if(search == intarray[mid])
			{
				System.out.println("your element is at index "+mid);
				System.out.println();
				elementFound = 1;	
			}
			
			else if (search < intarray[mid])
			{
				max = mid-1;
				mid = (min+max)/2;	
			}
			
			else
			{
				min = mid+1;
				mid = (min + max) /2;
			}
			}	
		}
		
		else
		{
			System.out.println("element not present in this list \n");
			return mid;
		}
		System.out.println();
		stopTime = System.currentTimeMillis();	
		elapseTime= (int) (stopTime - startTime);
		timeArray[0] = elapseTime;
		return mid;
	}
	
	
	/*
	 * method for searching a string element using binary search
	 */
	public void binarySearchForString(String stringarray[],int size)
	{
		int elementFound=0;
		startTime = System.currentTimeMillis();	
		System.out.println("this is binary searching of string");
		System.out.println("enter string elements");
		for(int i=0; i<size; i++)
		{
			stringarray[i] = scanner.next();
		}
		
		Arrays.sort(stringarray);
		
		for(int j=0; j<size; j++)
		{
		System.out.print(stringarray[j]);
		System.out.print(" ");
		}
		
		System.out.println();
		System.out.println("enter the element to be searched");
		String search = scanner.next();
		
		int min = 0;
		int max = stringarray.length - 1;
		int mid = (min + max) /2;
		
		if((search.compareTo(stringarray[max])<=0) && (search.compareTo(stringarray[min])>=0))
		{
		while(elementFound != 1)
		{
			if(search.compareTo(stringarray[mid])==0)
			{
				System.out.println("element found at "+mid);
				elementFound = 1;
				
			}
			else if(search.compareTo(stringarray[mid]) > 0)
			{
				min = mid+1;
				mid = (min+max)/2;
			}
			
			else
			{
				max = mid -1;
				mid = (min+max)/2;
			}
			}
		}
		
		else
		{
			System.out.println(search + " is not present in the list.\n");
		}
		stopTime = System.currentTimeMillis();	
		elapseTime= (int) (stopTime - startTime);
		timeArray[1] = elapseTime;	
	}
	
	
	/*
	 * to sort the integer elements using insertion sort
	 */
	public void insertionForInt(int intarray[],int size)
	{
	startTime = System.currentTimeMillis();	
	System.out.println("this is insertion sort for integer elements");
	System.out.println("enter elements");
	for(int i=0;i<size;i++)
	{
		intarray[i]= scanner.nextInt();
	}
	
	for(int i=1;i<size;i++)
	{
		for(int j=i ;j>0; j--)
		{
			if(intarray[j-1] > intarray[j])
			{
				int temp = intarray[j-1];
				intarray[j-1] = intarray[j];
				intarray[j] = temp;
			}
		}
	}
	
	System.out.println("sorted elements are ");
	for(int i=0; i<size;i++)		
	{
		System.out.print(intarray[i]);
		System.out.print(" ");
	}
	System.out.println();
	stopTime = System.currentTimeMillis();	
	elapseTime= (int) (stopTime - startTime);
	timeArray[2] = elapseTime;
	}
	
	
	/*
	 * to sort the string elements using insertion sort
	 */
	public static  String[] insertionForString(String stringarray[],int size)
	{
	startTime = System.currentTimeMillis();	
	System.out.println("this is insertion sort for string elements");
	System.out.println("enter elements");
	for(int i=0;i<size;i++)
	{
		stringarray[i] = scanner.next();
	}
	
	for(int i=1;i<size;i++)
	{
		for(int j=i ;j>0; j--)
		{
			if(stringarray[j-1].compareTo(stringarray[j])>0)
			{
				String temp = stringarray[j-1];
				stringarray[j-1] = stringarray[j];
				stringarray[j] = temp;
			}
		}
	}
	
	System.out.println("sorted elements are ");
	for(int i=0;i<size;i++)
	{
		System.out.print(stringarray[i]);
		System.out.print(" ");
	}
	System.out.println();
	stopTime = System.currentTimeMillis();	
	elapseTime= (int) (stopTime - startTime);
	timeArray[3] = elapseTime;
	return stringarray;
	}
	
	
	/*
	 * to sort the integer elements using bubble sort
	 */
	public static int[] bubbleForInt(int intarray[],int size)
	{
	startTime = System.currentTimeMillis();	
	System.out.println("this is bubble sort for integer elements");
	System.out.println("enter integer elements");
	for(int i=0; i<size; i++)
	{
		intarray[i]=scanner.nextInt();
	}
	
	
	for(int i=0; i<size; i++)
	{
		for(int j=i+1; j<size; j++)
		{
			if(intarray[i] > intarray[j])
			{
				int temp = intarray[i];
				intarray[i] = intarray[j];
				intarray[j] = temp;
			}

		}
	}
	
	System.out.println("sorted elements are");
	for(int i=0;i<size;i++)
	{
		System.out.print(intarray[i]);
		System.out.print(" ");
	}
	System.out.println();
	stopTime = System.currentTimeMillis();	
	elapseTime= (int) (stopTime - startTime);
	timeArray[4] = elapseTime;
	return intarray;
	}
	
	
	/*
	 * to sort the string elements using bubble sort
	 */
	public void bubbleForString(String stringarray[],int size)
	{
		startTime = System.currentTimeMillis();	
		System.out.println("this is bubble sort for sring elements");
		System.out.println("enter string elements");
		for(int i=0; i<size; i++)
		{
			stringarray[i]=scanner.next();
		}
		
		
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(stringarray[i].compareTo(stringarray[j])>0)
					
				{
					String temp = stringarray[i];
					stringarray[i] = stringarray[j];
					stringarray[j] = temp;
				}

			}
		}
		
		System.out.println("sorted elements are ");
		for(int i=0; i<size; i++)
		{
			System.out.print(stringarray[i]+" ");
			System.out.print(" ");
		}
		System.out.println();
		stopTime = System.currentTimeMillis();	
		elapseTime= (int) (stopTime - startTime);
		timeArray[5] = elapseTime;
	}
	
	
	/*
	 * to print the elapsed time between all methods calls.
	 */
	public void timePrint()
	{
		System.out.println("elapse time for all the methods called \n is given below in descending order");
		for(int i=timeArray.length-1; i>=0; i--)
		{
			System.out.println(timeArray[i]+" miliseconds");
		}
	}
	
	public static void main(String[] args) 
	{
	System.out.println("enter size of array");
	size = scanner.nextInt();
	int intarray[] = new int[size];
	String stringarray[] = new String[size];
	Utility u = new Utility();
	u.binarySearchForInt(intarray,size);
	u.binarySearchForString(stringarray,size);
	u.insertionForInt(intarray,size);
	u.insertionForString(stringarray,size);
	u.bubbleForInt(intarray,size);
	u.bubbleForString(stringarray,size);
	u.timePrint();
	}

}