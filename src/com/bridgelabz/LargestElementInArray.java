/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class LargestElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,15,98,69,56,78,43,29,101};
		int max =a[0];
		for(int i =0 ; i<a.length;i++) {
			// To Find Largest Number 
			if(a[i]>max)
				max = a[i];
		}
		System.out.println("Largest Number is :"+max);
	}

}
