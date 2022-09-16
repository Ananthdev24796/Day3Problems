/**
 * 
 */
package com.bridgelabz;

import java.util.Arrays;

/**
 * @author Iam_A
 *
 */
public class FrequencyOfEachElement {

	/**
	 * @param args
	 */
	public static  void freq(int[] a,int n) {
		boolean[] visited =new boolean[n];
		Arrays.fill(visited, false);
		
		
		for(int i =0;i<n;i++) {
			
			// To skip the element if it is processed 
			if(visited[i] == true)
				continue;
			// To check count
			int count =1;
			for (int j =i+1;j<n;j++) {
				if (a[i] == a[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(a[i]+"visited"+count+"Times");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={10,20,30,40,50,10,20,30,40,10,20,30,10,20,10,20,10};
		int n = a.length;
		freq(a,n);
		
		

	}

}
