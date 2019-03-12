package algorithmic.writtenTest;

/**
 * 	求1+2!+3!+...+20! 的和
 * @author Administrator
 *
 */
public class AlgorithmicWrittenTest7 {

	public static void main(String[] args) {
		factorialSum();
	}

	private static void factorialSum() {
		int sum = 0;
		int fac = 1;
		for(int i = 1; i <= 20; i++) {
			fac = fac * i;
			sum += fac;
		}
		System.out.println(sum);
	}
}
