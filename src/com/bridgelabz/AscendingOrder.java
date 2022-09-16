/**
 * 
 */
package com.bridgelabz;


/**
 * @author Iam_A
 *
 */
public class AscendingOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12,98,87,65,23,99,34,65,45};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);

	}

}
}
