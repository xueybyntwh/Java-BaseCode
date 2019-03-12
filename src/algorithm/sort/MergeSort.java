package algorithm.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 3, 4 };
		System.out.println("排序前： " + Arrays.toString(arr));
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("排序后： " + Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int i, int j) {
		
	}
}
