package algorithmic.writtenTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * 	产生10个1—20之间的随机数，要求随机数不能重复(List和Set分别实现)
 * @author Administrator
 *
 */
public class AlgorithmicWrittenTest1 {

	public static void main(String[] args) {
		// List集合方式实现
		randomNumbers1();
		
		System.out.println("-----");
		
		// Set集合方式实现
		randomNumbers2();
		
		// 使用Java随机生成10个不重复的数字，数字范围在1-50、100-150之间
		randomNumbers3();
	}
	
	private static void randomNumbers1() {
		Random random = new Random();
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		while(count < 10) {
			int number = random.nextInt(20) + 1;
			if(!list.contains(number)) {
				list.add(number);
				count ++;
			}
		}
		for (Object data : list) {
			System.out.print(data + "  ");
		}
	}
	
	private static void randomNumbers2() {
		Random random = new Random();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		while(hashSet.size() < 10) {
			 int number = random.nextInt(20) + 1;
			 hashSet.add(number);
		}
		for (Integer data : hashSet) {
			System.out.print(data + "  ");
		}
	}
	
	private static void randomNumbers3() {
		Random random = new Random();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		while(hashSet.size() < 10) {
			 int number = random.nextInt(150) + 1;
			 if(((number > 1) && (number < 50)) || ((number > 100) && (number < 150))) {
					 hashSet.add(number);
			 }
		}
		for (Integer data : hashSet) {
			System.out.print(data + "  ");
		}
	}
}
