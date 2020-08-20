package com.algo.ds.sorting;

import java.util.Arrays;
/*
 * Time complexity(Best case = 0(n))
 * Time Complexity(Worst case = 0(n2)) 
 * Space Complexity(o(n)
 *  
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] a = new int[] { 15, 16, 6, 8, 5 };
		int b= a.length;
		System.out.println(Arrays.toString(bubbleSort(a,b)));
	}

	public static int[] bubbleSort(int[] a, int n) {		
		for (int i = 0; i < n - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
		}
		return a;
	}
	
}
