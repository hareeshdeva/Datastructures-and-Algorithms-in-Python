package com.algo.ds.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = selectionSort(new int[] { 8, 9, 2, 3, 1 });
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	private static int[] selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
		return a;
	}
}