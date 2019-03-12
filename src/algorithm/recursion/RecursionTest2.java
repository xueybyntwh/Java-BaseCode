package algorithm.recursion;

/**
 * 	使用递归算法实现，平方相加1^2 + 2^2 + 3^2 +...+ n^2。
 * @author xyb
 *
 */
public class RecursionTest2 {

	public static void main(String[] args) {
		int m = 5;
		
		int sumOfSquares = sumOfSquares(m);
		System.out.println("非递归：  " + sumOfSquares);
		
		int sumSqua1 = recursiveSumSqua1(m);
		System.out.println("递归1：  " + sumSqua1);
		
		int sumSqua2 = recursiveSumSqua2(m);
		System.out.println("递归2：  " + sumSqua2);
		
	}

	// 第一种写法
	private static int recursiveSumSqua1(int n) {
		int sum = 0;
		if(n == 1) {
			sum = 1;
		}else {
			sum = n*n + recursiveSumSqua1(n - 1);
		}
		return sum;
	}
	
	// 第二种写法
	private static int recursiveSumSqua2(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * n + recursiveSumSqua2(n - 1);
		}
	}

	// 非递归算法
	private static int sumOfSquares(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (i + 1) * (i + 1);
		}
		return sum;
	}
}
