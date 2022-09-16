/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class DuplicateElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,17,27,37,47,57,17,7,77,67,87,97,17,77};
		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}

	}

}
