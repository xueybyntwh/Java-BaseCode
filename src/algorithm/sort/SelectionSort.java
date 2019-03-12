package algorithm.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 3, 4 };
		System.out.println("排序前： " + Arrays.toString(arr));
		
		int pos;
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			pos = 0;
			for(int j = 0; j < arr.length - i; j++) {
				if(arr[j] > arr[pos]) {
					pos = j;
				}
			}
			temp = arr[pos];
			arr[pos] = arr[arr.length - 1 -i];
			arr[arr.length - 1 -i] = temp;
		}
		System.out.println("排序后： " + Arrays.toString(arr));
	}
}
