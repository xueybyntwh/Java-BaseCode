package algorithmic.writtenTest;

/**
 * 	题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。(不能使用length()函数)
 * @author Administrator
 *
 */
public class AlgorithmicWrittenTest8 {

	public static void main(String[] args) {
		printlnStrLen();
		
	}

	private static void printlnStrLen() {
		String str = "aaabdeidmeg";
		str.length();
		char[] ch = str.toCharArray();//把取道的字符串变成一个char数组
		for (char c : ch) {
			System.out.println(c);
		}
	}
	
}
