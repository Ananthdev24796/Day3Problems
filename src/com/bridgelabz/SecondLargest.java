/**
 * 
 */
package com.bridgelabz;

import java.util.Arrays;

/**
 * @author Iam_A
 *
 */
public class SecondLargest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,45,67,87,98,47};
		int size =a.length;
		Arrays.sort(a);
		int result = a[size-2];
		System.out.println("Second Largest Number in Given Array:"+result );

	}

}
