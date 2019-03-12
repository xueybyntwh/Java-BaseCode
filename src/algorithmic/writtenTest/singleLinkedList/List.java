package algorithmic.writtenTest.singleLinkedList;

public interface List {
	
	/**
	 * 	返回线性表的大小,即数据元素的个数。
	 * @return
	 */
	public int size();
	
	/**
	 * 	 返回线性表中序号为 i 的数据元素
	 * @param i
	 * @return
	 */
	public Object get(int i);

	/**
	 * 	 如果线性表为空返回 true，否则返回 false。
	 * @return
	 */
	public boolean isEmpty();

	/**
	 * 	 判断线性表是否包含数据元素 e
	 * @param e
	 * @return
	 */
	public boolean contains(Object e);

	/**
	 * 	 返回数据元素 e 在线性表中的序号
	 * @param e
	 * @return
	 */
	public int indexOf(Object e);

	/**
	 * 	 将数据元素 e 插入到线性表中 i 号位置
	 * @param i
	 * @param e
	 */
	public void add(int i, Object e);

	/**
	 * 	 将数据元素 e 插入到线性表末尾
	 * @param e
	 */
	public void add(Object e);

	/**
	 * 	 将数据元素 e 插入到元素 obj 之前
	 * @param obj
	 * @param e
	 * @return
	 */
	public boolean addBefore(Object obj, Object e);

	/**
	 * 	 将数据元素 e 插入到元素 obj 之后
	 * @param obj
	 * @param e
	 * @return
	 */
	public boolean addAfter(Object obj, Object e);

	/**
	 * 	 删除线性表中序号为 i 的元素,并返回之
	 * @param i
	 * @return
	 */
	public Object remove(int i);

	/**
	 * 	 删除线性表中第一个与 e 相同的元素
	 * @param e
	 * @return
	 */
	public boolean remove(Object e);

	/**
	 * 	 替换线性表中序号为 i 的数据元素为 e，返回原数据元素
	 * @param i
	 * @param e
	 * @return
	 */
	public Object replace(int i, Object e);

	
}

