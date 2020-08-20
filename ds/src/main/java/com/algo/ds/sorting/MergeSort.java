package com.algo.ds.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] a = new int[] { 4,3,2,1,-2,10,71,5};
		int lb = 0, ub = a.length - 1;
		mergeSort(a, lb, ub);
		System.out.println(Arrays.toString(a));
	}

	public static void mergeSort(int[] a, int lb, int ub) {
		if (lb < ub) {
			int mid = (lb + ub) / 2;
			mergeSort(a, lb, mid);
			mergeSort(a, mid + 1, ub);
			mergeArrays(a, lb, mid, ub);
		}
	}

	private static void mergeArrays(int[] a, int lb, int mid, int ub) {
		int[] b = new int[a.length];
		int i = lb;
		int j = mid + 1;
		int k = lb;
		while (i <= mid && j <= ub) {
			if (a[i] <= a[j]) {
				b[k] = a[i];
				i++;
				k++;
			} else {
				b[k] = a[j];
				j++;
				k++;
			}
		}
		if (i > mid) {
			while (j <= ub) {
				b[k] = a[j];
				j++;
				k++;
			}
		} else {
			while (i <= mid) {
				b[k] = a[i];
				i++;
				k++;
			}
		}
		for(int z =lb; z <= ub; z++) {
			a[z] = b[z];
		}
	}
}
