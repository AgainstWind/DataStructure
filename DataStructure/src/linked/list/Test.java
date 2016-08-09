package linked.list;

public class Test {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();
		
		list1.setFirst(true);
		list1.setObj("test1");
		list2.setObj("test2");
		list3.setObj("list3");
		
		list1.setNext(list2);
		list2.setNext(list3);
		
		System.out.println(list1.toString()+list1.getNext().toString()+list2.getNext().toString());
		
		System.out.println(list3.getNext().toString());
	}

}
