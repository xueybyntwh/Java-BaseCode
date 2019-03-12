package algorithm.recursion;

/**
 * 	递归： 递归作为一种算法在程序设计语言中广泛应用，是指函数/过程/子程序在运行过程中直接或间接调用自身而产生的重入现象 
 * 	递归算法一般用于解决三类问题：
 * 	1)数据的定义是按递归定义的(Fibonacci斐波那契数列) 
 * 	2)问题解法按递归算法实现。(回溯)
 * 	3)数据的结构形式是按递归定义的.(树的遍历，图的搜素)
 *  
 * 	使用递归算法实现，求n！
 * 
 * @author xyb
 *
 */
public class RecursionTest1 {

	public static void main(String[] args) {
		// 递归算法实现 n！
		int recursion = recursion(5);
		System.out.println(recursion);

		// 非递归实现 n！
		int noRecuresion = noRecuresion(5);
		System.out.println(noRecuresion);

	}

	private static int recursion(int n) {
		if (n == 1) {
			return 1;// 递归头
		} else {
			return n * recursion(n - 1);// 递归体
		}
	}

	private static int noRecuresion(int n) {
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			if (i <= n) {
				sum *= i;
			}
		}
		return sum;
	}

}
