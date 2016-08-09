package linked.list;

public class LinkedList {
	private static boolean first = false;
	private Object obj;
	private LinkedList next=null;
	
	public LinkedList(Object obj, LinkedList next) {
		this.obj = obj;
		this.next = next;
	}

	public LinkedList(){}
	
	public static boolean isFirst() {
		return first;
	}

	public static void setFirst(boolean first) {
		LinkedList.first = first;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public LinkedList getNext() {
		return next;
	}

	public void setNext(LinkedList next) {
		this.next = next;
	}
	
	public boolean hasNext(){
		if(next == null){
			return false;
		}else
			return true;
	}
	
	public String toString(){
		return obj.toString();
	}
		
}
