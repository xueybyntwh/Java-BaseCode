package algorithmic.writtenTest;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 将一个整型十进制数转化为二进制数(不能用Java的类库？
 * 
 * @author Administrator
 *
 */
public class AlgorithmicWrittenTest2 {

	public static void main(String[] args) {

		String binary = decimalToBinary1(15);

		System.out.println(binary);

		decimalToBinary2(15);
		decimalToBinary3(15);
	}

	private static void decimalToBinary3(int i) {
		// 给出一个十进制数
		int t = i;
		int m;
		// String s = "";
		Deque stack = new LinkedList(); // 利用栈输出
		do {
			// 十进制数作为被除数除以2
			m = t % 2;
			// s = m + s;
			stack.push(m);
			t /= 2;
		} while (t > 0);
		System.out.print(i + "----->");
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}

	private static void decimalToBinary2(int d) {
		// 给出一个十进制数
		int t = d;
		int m;
		String s = "";
		// 循环操作取余数倒排列
		do {
			// 十进制数作为被除数除以2
			m = t % 2;
			s = m + s;
			//
			t /= 2;
		} while (t > 0);
		// 输出
		System.out.println(d + "----->" + s);
	}

	private static String decimalToBinary1(int d) {
		String s = "";
		do {
			int f = d % 2;
			if (f == 1) {
				s = "1" + s;
			} else if (f == 0) {
				s = "0" + s;
			}
			d /= 2;
		} while (d != 0);
		return s;
	}
}
