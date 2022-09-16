/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class SmallestElementOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {10,15,98,69,4,56,78,43,29,2};
		int min =a[0];
		for(int i =0 ; i<a.length;i++) {
			// To Find Smallest Number 
			if(a[i]<min)
				min = a[i];
		}
		System.out.println("Smallest Number is :"+min);
	}

	}


