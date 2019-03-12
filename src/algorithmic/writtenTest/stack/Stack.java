package algorithmic.writtenTest.stack;

public interface Stack {

	// 判断是否为满栈
	public boolean isFull();
	
	// 判断堆栈是否为空
	public boolean isEmpty();
	
	// 栈数组扩容
	public void increData();
	
	// 返回堆栈的大小
	public int getSize();
	
	// 数据元素入栈
	public void push(Object obj);
	
	// 数据元素出栈
	public Object pop();
	
	// 取栈顶元素
	public Object peek();
}
