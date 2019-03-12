package algorithmic.writtenTest.singleLinkedList;

public class TestSingleLinkedList {

	public static void main(String[] args) {
		
		List list = new SingleLinkedList();
		
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		
		list.add(3, 666);
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.get(4));
		System.out.println(list.toString());
	}
}
