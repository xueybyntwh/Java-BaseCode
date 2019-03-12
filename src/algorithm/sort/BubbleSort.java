package algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 6, 2, 9, 0, 7, 4, 5, 8 };
		System.out.println("无序数组： " + Arrays.toString(arr));
		bubbleSort(arr);
	}

	/**
	 * 
	 * 	排序过程：
	 * 	第一趟排序：第一位和第二位比，第二和第三位比，第三位和第四位比，第四位和第五位比，以此类推 . . .
	 * 	第二趟排序：第一位和第二位比，第二和第三位比，第三位和第四位比，第五位不用比，第一趟已经排出第五位是最大的。
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {

		boolean flag;
		int num = 0;// 排序趟数

		for (int i = 0; i < arr.length - 1; i++) { // 外层循环是排序的趟数
			flag = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {// 内层循环是当前趟数需要比较的次数
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
			num++;
		}
		System.out.println("有序数组： " + Arrays.toString(arr));
		System.out.println("num = " + num);
	}

}
