
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

	static int choice, size, elementFound;
	static Scanner scanner = new Scanner(System.in);
	
	public static int binarySearchForInt()
	{
		System.out.println("enter size of array");
		size = scanner.nextInt();
		int intarray[] = new int[size];
		
		System.out.println("enter integer elements");
		for(int i=0; i<size; i++)
		{
			intarray[i]=scanner.nextInt();
		}
		
		Arrays.sort(intarray);
		
		for(int i:intarray)
		{
			System.out.print(i);
			System.out.println();
		}
		
		
		System.out.println("enter a value to be searched");
		int search = scanner.nextInt();
		
		int min = 0;
		int max = intarray.length - 1;
		int mid = (min + max) /2;
		
		
		if(search < intarray[max] && search > intarray[min])
		{
		while(elementFound != 1)
		{
			
		if(search == intarray[mid])
		{
			//System.out.println("your element is at index "+mid);
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
			int found = 0;
			System.out.println("element not present in this list");
			return mid;
		}
		return mid;
		
	}
	
	
	public static void binarySearchForString(String stringarray[])
	{
		System.out.println("enter string elements");
		for(int i=0; i<size; i++)
		{
			stringarray[i] = scanner.next();
		}
		
		Arrays.sort(stringarray);
		for(int j=0; j<size; j++)
		{
		System.out.println(stringarray[j]);
		}
		System.out.println("enter the element to be searched");
		String search = scanner.next();
		
		int min = 0;
		int max = stringarray.length - 1;
		int mid = (min + max) /2;
		
		if((search.compareTo(stringarray[max])<0) & (search.compareTo(stringarray[min])>0))
		{
		while(elementFound != 1)
		{
		if(search.compareTo(stringarray[mid])==0)
		{
			System.out.println("element found at "+mid);
			elementFound = 1;
			
		}
		else if(search.compareTo(stringarray[mid]) < 0)
		{
			max = mid-1;
			mid = (min+max)/2;
		}
		
		else
		{
			min = mid +1;
			mid = (min+max)/2;
		}
		}
		}
		
		else
		{
		System.out.println(search + " is not present in the list.\n");
		}
		
	
		
	}
	
	public static void insertionForInt(int intarray[])
	{
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
	
	for(int i=0; i<size;i++)		
	{
		System.out.print(intarray[i]);
		System.out.print(" ");
	}
	}
	
	public static  String[] insertionForString(int size,String stringarray[])
	{
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
	
	return stringarray;
	}
	
	public static int[] bubbleForInt(int size,int intarray[])
	{
	
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
	return intarray;
	}
	
	public static void bubbleForString(String stringarray[])
	{
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
		}
	}
	
	
	public static void switchChoice(int size,int intarray[], String stringarray[])
	{
		switch(choice)
		{
		case 1:
			binarySearchForInt();
			break;
		case 2:
			//binarySearchForString(stringarray);
			break;
		case 3:
			//insertionForInt(intarray);
			break;
		case 4:
			insertionForString(size,stringarray);
			break;
		case 5:
			bubbleForInt(size,intarray);
		case 6:
			//bubbleForString(stringarray);
			break;
			
		}

	}
	
	
	
	public static void main(String[] args) 
	{
	System.out.println(" 1:binary search integer \n 2:binary search string \n 3:inserion sort integer\n 4:insertion sort string \n 5:bubble sort integer \n 6:bubble sort string");
	choice = scanner.nextInt();
	System.out.println("enter size of array");
	size = scanner.nextInt();
	int intarray[] = new int[size];
	String stringarray[] = new String[size];
	switchChoice(size,intarray,stringarray);
	}

}
