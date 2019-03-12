package algorithmic.writtenTest;

/**
 * 用java编程写出1000-2000之间能被3整除的数？
 * 
 * @author Administrator
 *
 */
public class AlgorithmicWrittenTest5 {

	public static void main(String[] args) {
		isDivisible();
		isPrimeNumber();
	}

	// 用java编程写出1000-2000之间能被3整除的数？
	private static void isDivisible() {
		for (int i = 1000; i <= 2000; i++) {
			if (i % 3 == 0) {
				System.out.println(i); // 334 - 666(乘以3的数)
			}
		}
	}

	// 找出101到200自然数中的质数，for循环越少越好
	private static void isPrimeNumber() {
		for (int i = 101; i <= 200; i++) {
			boolean flag = true;
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i);
			}
		}
	}
}
