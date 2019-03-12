package algorithmic.writtenTest.stack;

import java.util.Arrays;

/**
 * 	用数组实现一个栈(Stack)，至少有入栈方法push和出栈方法pop？
 * @author Administrator
 *
 */
public class SingleStack implements Stack{

	private Object[] data;
	
	private int size = 0;
	
	public SingleStack() {
		data = new Object[0];
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void push(Object obj) {
		if(isFull()) {
			increData();
		}
		size++;
		data[size - 1] = obj;
	}

	@Override
	public Object pop() {
		Object obj = data[size - 1];
		data[size - 1] = null;
		size--;
		return obj;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFull() {
		// 当数组长度与栈内元素个数相同时 或者数组长度为零并且元素个数也为零是栈为满栈
		return data.length == size || (data.length == 0 && size == 0);
	}

	@Override
	public void increData() {
		data = Arrays.copyOf(data, data.length + 10);
	}
	
}


