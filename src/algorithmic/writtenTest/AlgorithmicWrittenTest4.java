package algorithmic.writtenTest;

/**
 * 	顺序查找：
 * 		顺序查找适合于存储结构为顺序存储结构或链式存储结构的线性表。
 * @author Administrator
 *
 */
public class AlgorithmicWrittenTest4 {

	public static void main(String[] args) {
		String[] str = {"A","B","C","D","E","F","G","H"};
		int index = sequentialSearch(str,"M");
		System.out.println(index);
	}

	private static int sequentialSearch(String[] str, String value) {
		int key = 0;
		while(key < str.length) {
			if(str[key] == value) {
				return key;
			}
			key ++;
		}
		return -1;
	}
}
