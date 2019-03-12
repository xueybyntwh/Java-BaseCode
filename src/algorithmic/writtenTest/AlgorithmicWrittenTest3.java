package algorithmic.writtenTest;

import java.util.Arrays;

/**
 * 	二分法查找:
 * 
 * @author Administrator
 *
 */
public class AlgorithmicWrittenTest3 {

	public static void main(String[] args) {

		int[] arr = { 7, 8, 9, 80, 12, 20, 30, 40, 100, 10, 50 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int index = binarySeach(arr, 1000);
//		System.out.println(index + "-->" + arr[index]);
		System.out.println(index);
	}

	public static int binarySeach(int[] arr, int value) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (value == arr[mid]) {
				return mid;
			}
			if (value > arr[mid]) {
				low = mid + 1;
			}
			if (value < arr[mid]) {
				high = mid - 1;
			}
		}
		return -1;
	}
}
