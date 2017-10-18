package com.bridgelabz.programs;

import java.util.Arrays;
import java.util.Scanner;

public class FindingNumber {

	
	public static void search() throws InterruptedException
	{
		Scanner scanner = new Scanner(System.in);
		int numberFound = 0,answer;
		System.out.println("enter size of array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
		{
			array[i]=scanner.nextInt();
		}
		Arrays.sort(array);
		for(int i:array)
		{
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("now think of a number from "+array[0]+" to "+array[size-1]);
		Thread.sleep(3000);	
		System.out.println("\n i guess you would have thought till now...!!!");
		
		int min=0;
		int max=array.length-1;
		int mid =(min+max)/2;
		
	
				while(numberFound != 1)
				{
					System.out.println("is your number greater than "+array[mid]+" ?. \n 1 for yes.\n 2 for no");
					answer=scanner.nextInt();
					if(answer==1)
					{
						min=mid+1;
						mid=(min+max)/2;
					}
					else if(answer ==2)
					{
					System.out.println("is your number smaller than "+array[mid]+" ?. \n 1 for yes.\n 2 for no");
					answer = scanner.nextInt();
					if(answer == 1)
					{
						max = mid-1;
						mid=(min+max)/2;
					}
					else
					{
					System.out.println("your number is "+array[mid]);
					numberFound=1;
					}
					}
			/*	max=mid-1;
				mid=(min+max)/2;
			
			else
			{
				System.out.println("is your number between "+array[mid]+" and "+array[max]+" ?. \n press 1 for yes \n 2 for no ");
			answer = scanner.nextInt();

			}*/}	
		}
	
	

	public static void main(String[] args) throws InterruptedException {
		search();
	}

}
