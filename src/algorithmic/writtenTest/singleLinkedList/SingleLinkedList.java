package algorithmic.writtenTest.singleLinkedList;

/**
 * java实现单向链表
 * @author Administrator
 *
 */
public class SingleLinkedList implements List{

	// 头结点不存储数据
	private Node head = new Node();
	private int size;

	@Override
	public int size() {
		return size;
	}

	@Override
	public Object get(int i) {
		// 
		Node p = head;
		for(int j = 0; j < i; j++) {
			p = p.next;
		}
		return p.data;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Object e) {
		// 
		return false;
	}

	@Override
	public int indexOf(Object e) {
		// 
		return 0;
	}

	@Override
	public void add(int i, Object e) {
		// 找到要添加位置的前继结点
		Node p = head;
		for(int j = 0; j < i; j++) {
			p = p.next;
		}
		
		// 创建一个结点
		Node newNode = new Node();
		newNode.data = e;
		//newNode.next = null;
		
		// 指明新节点的直接后继
		newNode.next = p.next;
		
		// 
		p.next = newNode;
		
		size++;
		
	}

	@Override
	public void add(Object e) {
		// 
		this.add(size, e);
	}

	@Override
	public boolean addBefore(Object obj, Object e) {
		// 
		return false;
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		// 
		return false;
	}

	@Override
	public Object remove(int i) {
		// 
		return null;
	}

	@Override
	public boolean remove(Object e) {
		// 
		return false;
	}

	@Override
	public Object replace(int i, Object e) {
		// 
		return null;
	}
}
