package com.app;
// A sample Java program to sort a subarray 
// in descending order using Arrays.sort(). 
import java.util.Arrays; 
import java.util.Collections; 

public class Sorting 
{ 
	public static void main(String[] args) 
	{ 
		Integer[]chr= {12,56,2,4,88,22,44,88};
		//Accending
		Arrays.toString(chr);
		System.out.println("Asending"+Arrays.toString(chr));

		//deCending order
		Arrays.sort(chr, Collections.reverseOrder());
		System.out.println("Decending"+Arrays.toString(chr));
	} 
} 
