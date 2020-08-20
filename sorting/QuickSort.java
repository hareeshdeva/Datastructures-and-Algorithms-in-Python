package com.algo.ds.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] inputArray = new int[] { 4, 6, 1, 2, 7, 3, 5, 9 };
		quickSort(inputArray, 0, inputArray.length - 1);
		System.out.println(Arrays.toString(inputArray));
	}

	private static void quickSort(int[] inputArray, int startindex, int endIndex) {
		if(startindex<endIndex) {
			int location = partition(inputArray,startindex,endIndex);
			quickSort(inputArray,startindex,location-1);
			quickSort(inputArray,location + 1,endIndex);
		}
	}

	private static int partition(int[] inputArray, int lb, int ub) {
		int pivot = inputArray[lb];
		int start = lb;
		int end = ub;
		while (start < end) {
			while (inputArray[start] <= pivot) {
				start++;
			}
			while (inputArray[end] >= pivot) {
				end--;
			}
			if (start < end) {
				int temp = inputArray[start];
				inputArray[start] = inputArray[end];
				inputArray[end] = temp;
			}
		}
		
		int temp2 = inputArray[lb];
		inputArray[lb] = inputArray[end];
		inputArray[end] = temp2;
	
		return end;		
	}

}
