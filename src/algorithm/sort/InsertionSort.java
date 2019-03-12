package algorithm.sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 3, 4 };
		System.out.println(Arrays.toString(arr));
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			temp = arr[i];
			while (i >= 1 && arr[i - 1] > temp) {
				arr[i] = arr[i - 1];
				i--;
			}
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
