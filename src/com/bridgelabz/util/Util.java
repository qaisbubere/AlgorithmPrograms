
/****************************************************************************** 
 *  Purpose: to create various methods in util class.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   6-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Util {
	static int count = 0, j, flag = 0,number,prime=0;
	static Scanner scanner = new Scanner(System.in);
	
	
	//to determine whether the given string is anagram or not
	public static boolean anagram() {
		boolean isAnagram = false;
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter first string");
		String string1 = scanner.nextLine();
		System.out.println("enter second string");
		String string2 = scanner.nextLine();
		String lower1 = string1.toLowerCase();
		String lower2 = string2.toLowerCase();
		char[] array1 = string1.toCharArray();
		char[] array2 = string2.toCharArray();

		if (array1.length == array2.length) 
		{
			for (int i = 0; i < array1.length; i++) {
				for (int j = i+1; j < array1.length; j++) {
					if (array1[i] > array1[j]) {
						char temp = array1[i];
						array1[i] = array1[j];
						array1[j] = temp;
					}
				}
			}

			for (int i = 0; i < array1.length; i++) {
				for (int j = i+1; j < array1.length; j++) {
					if (array2[i] > array2[j]) {
						char temp = array2[i];
						array2[i] = array2[j];
						array2[j] = temp;
					}
				}
			}

			for (int i = 0; i < array1.length; i++) {
				for (int j = i; j <=i; j++) {
					if (array1[i] == array2[j]) {
						count++;
						
					}
				}
			}
			if (count == array1.length) {
				isAnagram=true;

			} 
			else {
				isAnagram = false;

			}
		} 
		else 
		{
			isAnagram = false;
		}
		return isAnagram;
	}

	
	
	public static void palindrome() {
	}

	
	
	//to find out prime numbers between 0 and 1000
	public static void primeNumber() {
		boolean isprimeNumber = false;
		System.out.println("prime numbers between 1 and 1000 are");

		for (int i = 2; i <1000; i++) {
		if(calculation(i)==true)
		{
			System.out.println(i);
			prime++;
		}
		
	}
		System.out.println(prime+" numbers are prime");
	}

	public static boolean calculation(int number) 
	{
		boolean isPrime=false;
		int counter = 0;
		for (int i=1; i <=number; i++) {
			
			if (number % i == 0) {
				counter++;
			}
		}
			if(counter==2)
			{
				return true;
			}
			
			else
			return isPrime;
			

	}
	

	
	//to convert farehneit to celcius and vice-versa
	public static void temperatureConversion()
	{
			System.out.println("enter temperature in farenheit");
			double mTemperatureFarenheit = scanner.nextDouble();
			
			double mToCelcius = ((mTemperatureFarenheit - 32) / 1.8);
			double mToFarenheit = ((mToCelcius * 1.8) + 32);
			System.out.println("temperature in celcius is " + mToCelcius);
			System.out.println("temperature in farenheit is " +mToFarenheit);
		
	}
	
	
	
	//method to determine the day by accepting dates as input from user
	public static void dayOfWeek(){
		 int x , y0 , m0 , d0;
		 
		 System.out.println("enter day month and year");
		 int day = scanner.nextInt();
		 int month = scanner.nextInt();
		 int year = scanner.nextInt();
		
		y0 = year - (14-month) / 12;
		x = y0 + y0 / 4-y0 / 100+y0 / 400;
		m0 = month + 12 * ((14-month)/12) -2;
		d0 =(day+x+(31*m0) / 12) % 7;
		
		switch(d0)
		{
			case 0:
				System.out.println("it is sunday");
			break;
				
			case 1:
				System.out.println("it is monday");
			break;
				
			case 2:
				System.out.println("it is tuesday");
			break;
				
			case 3:
				System.out.println("it is wednesday");
			break;
				
			case 4:
				System.out.println("it is thursday");
			break;
				
			case 5:
				System.out.println("it is friday");
			break;
				
			case 6:
				System.out.println("it is saturday");
			break;
		}
			
	}
	
	
	
	//method to find out monthly payment to be paid towards loan taken
	public static void monthlyPayment()
	{
		System.out.println("enter principal loan amount, years , and rate of interest");
		float principal = scanner.nextFloat();
		float years = scanner.nextFloat();
		float rate = scanner.nextFloat();
		
		float n = 12 * years;
		float r = rate / (12*100);
		double x = Math.pow(1+rate,(-n));	
		
		double payment = (principal*r) / (1-x);
		System.out.println("monthly payment is: " + payment);
	}
	
	
	
	//method to find out square root of a number
	public static void squareRoot()
	{
		System.out.println("enter a non-negative number");
		int c = scanner.nextInt();
		double epsilon = 1e-15;    
		double t = c;
		
		 while (Math.abs(t - c/t) > epsilon*t) 
			{
		        t = (c/t + t) / 2.0;
		        }

		        
		System.out.println(t);
	}
	
	
	
	
	//method for conversion of decimal to binary
	public static void binary()
	{
		System.out.println("enter a decimal number");
		int decimal = scanner.nextInt();
		int length = Integer.valueOf(decimal).toString().length();
		int number = decimal;
		int index =0,j=0,elementCounter=0,gap=0;
		int array[] =  new int[length*4];
		
		while(number > 0)
		{
			array[index++]= number % 2;
			number = number / 2; 
			elementCounter++;
		
		}
		if(elementCounter == length*4)
		{
			for(int i=index-1;i>=0;i--)
			{
				System.out.print(array[i]);
			}
		}
	
		else
		{
				
			for (int i = elementCounter+1; i < array.length; i++)
			{
			    array[i]=0;
			}
			for(int i=elementCounter;i < array.length; i++)
			{
				System.out.print(array[i]);
				gap++;
				if(gap==4)
					System.out.print(" ");
			}
			gap =0;
			for(int i=index-1;i>=0;i--)
			{
				
				System.out.print(array[i]);
				gap++;
					if(gap==4)
					System.out.print(" ");
			}
		}
		
	}
	
	
	//to search a word from a file using binary search 
	public static void binarySearchFromFile() throws IOException
	{
		int elementFound=0;
		File file = new File("/home/bridgeit/Desktop/program.txt");
		
		if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
		
		//Write Content
        FileWriter writer = new FileWriter(file);
        writer.write("THIS,IS,MY,FIRST,FILE");
        writer.close();
        int length = (int) file.length();
        
        //read the contents
        FileReader fr = new FileReader("/home/bridgeit/Desktop/program.txt");
        BufferedReader br = new BufferedReader(fr);
        
        //splitting the contents
        String string = null;
        String[] splitted = new String[length];
        while ((string = br.readLine()) != null) 
        {
            splitted = string.split(",");
            for(String display:splitted)
            {
            System.out.print(" "+display);
            }
        }
        System.out.println();
        
        
        //sorting of elements
       Arrays.sort(splitted);
       System.out.println("sorted elements are ");
       for(String display:splitted)
       {
       System.out.print(" "+display);
       }
       System.out.println();
       
       
        //to search the element using binary search
        System.out.println("enter a word to search");
        String search = scanner.next();
       
        int min = 0;
		int max = splitted.length - 1;
		int mid = (min + max) /2;
		
		if((search.compareTo(splitted[max])<0) & (search.compareTo(splitted[min])>0))
		{
			while(elementFound != 1)
			{
				if(search.compareTo(splitted[mid])==0)
				{
					System.out.println("element found at "+mid);
					elementFound = 1;
					
				}
				else if(search.compareTo(splitted[mid]) < 0)
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

	
	
	
	public static void main(String[] args) throws IOException {
		System.out.println("1:anagram \n 2:palindrome \n 3:primenumber \n 4:temperature conversion \n 5:day of week \n 6:monthly payment \n 7:square root \n 8:binary \n 9:binary search from file");
		int choice = scanner.nextInt();
		switch(choice)
		{
		case 1:
			boolean isAnagram = anagram();
			if(isAnagram == true)
				System.out.println("it is anagram");
			else
				System.out.println("not an anagram");
			break;
		case 2:
			palindrome();
			break;
		case 3:
			primeNumber();
			break;
		case 4:
			temperatureConversion();
			break;
		case 5:
			dayOfWeek();
			break;
		case 6:
			monthlyPayment();
			break;
		case 7:
			squareRoot();
			break;
		case 8:
			binary();
			break;
		case 9:
			binarySearchFromFile();
			break;
		default:
			System.out.println("wrong choice");
			break;
		}
	

	}
}
