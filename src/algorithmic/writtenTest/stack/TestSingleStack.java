package algorithmic.writtenTest.stack;

public class TestSingleStack {

	public static void main(String[] args) {
		SingleStack singleStack = new SingleStack();
		singleStack.push(1);
		singleStack.push(2);
		Object pop = singleStack.pop();
		System.out.println(pop);
	}

}
