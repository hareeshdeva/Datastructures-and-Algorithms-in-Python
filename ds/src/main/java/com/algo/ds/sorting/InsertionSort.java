package com.algo.ds.sorting;
/*
 * Time complexity(Best case = 0(n))
 * Time Complexity(Worst case = 0(n2)) 
 * Space Complexity(o(n)
 * 
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] a = insertionSort(new int[] { 8, 9, 2, 3, 1 });
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
		return array;
	}
}
