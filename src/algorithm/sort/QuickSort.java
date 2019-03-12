package algorithm.sort;

import java.util.Arrays;

/**
 * 
 * 	快速排序是一种划分交换排序。它采用了一种分治的策略。
 * 	基本思想是：
 * 	1、先从数列中取出一个数作为基准数。(简单起见可以取第一个数)
 * 	2、分区的过程是将比这个数的数全部放到他的右边，小于或等于它的数全放到左边。(分区)
 * 	3、再对左右区间重复第一步、和第二步，直到各区间只有一个数。(递归)
 * 
 * 	拓展：
 * 	在数组几乎有序时，快排性能不好（因为每趟排序后，左右两个子递归规模相差悬殊，大的那部分最后很可能会达到O(n^2)）。
 * 	解决：基准值随机地选取，而不是每次都取第一个数。这样就不会受“几乎有序的数组”的干扰了。但是对“几乎乱序的数组”
 * 	的排序性能可能会稍微下降，至少多了排序前交换的那部分，乱序时这个交换没有意义...有很多“运气”成分...
 * 
 * @author xyb
 *
 */
public class QuickSort {

	private static int partition(int[] arr, int low, int high) {
		// 指定左指针右指针
		int i = low;
		int j = high;

		// 将第一个值作为基准值,挖坑
		int x = arr[low];

		// 使用循环实现分区操作
		while (i < j) {
			// 从右向左移动j,找到第一个小于基准值的值arr[j]
			while (arr[j] >= x && i < j) {
				j--;
			}

			// 将右侧找到的小于基准值的数加入到左边的空位置(坑),做指针向中间移动一个位置i++;
			if (i < j) {
				arr[i] = arr[j];
				i++;
			}

			// 从左向右移动指针i,找到第一个大于基准值的值arr[i];
			while (arr[i] <= x && i < j) {
				i++;
			}

			// 将左侧找到的大于基准值的数加入到右侧的空位置(坑),右指针向中间移动一个位置j--;
			if (i < j) {
				arr[j] = arr[i];
				j--;
			}
		}

		// 使用基准值填坑,这就是基准值的最终位置
		arr[i] = x; // arr[j] = j;

		// 返回基准值的位置索引
		return i; // return j;
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// 分区操作,将一个数组分成两个分区,返回分区的界限索引
			int index = partition(arr, low, high);

			// 对左分区进行快排
			quickSort(arr, low, index - 1);

			// 对右分区进行快排
			quickSort(arr, index + 1, high);
		}
	}

	public static void quickSort(int[] arr) {
		// 定义首位置
		int low = 0;

		// 定义尾位置
		int high = arr.length - 1;

		// 排序
		quickSort(arr, low, high);
	}

	public static void main(String[] args) {
		// 定义一个无序数组
		int arr[] = { 72, 6, 57, 88, 60, 42, 83, 73, 48, 85 };

		// 输出无序数组
		System.out.println("无序数组：" + Arrays.toString(arr));

		// 快速排序
		quickSort(arr);

		// 输出有序数组
		System.out.println("有序数组：" + Arrays.toString(arr));
	}

}
