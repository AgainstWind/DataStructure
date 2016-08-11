package tree;

public class Node<T> {
	
	private T obj;
	private Node leftNode=null;
	private Node rightNode=null;
	private Node parentNode=null;
	private static boolean isRoot = false;

	public Node(T obj, Node leftNode, Node rightNode, Node parentNode) {
		this.obj = obj;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.parentNode = parentNode;
	}

	public Node() {	}

	public Object getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public Node getParentNode() {
		return parentNode;
	}

	public void setParentNode(Node parentNode) {
		this.parentNode = parentNode;
	}

	public static boolean isRoot() {
		return isRoot;
	}

	public static void setRoot(boolean isRoot) {
		Node.isRoot = isRoot;
	}
	
	public String toString (){
		String rv="";
		rv+=obj.toString();
		if(this.leftNode!=null){
			rv+="--left:"+leftNode.toString();
		}
		if(this.rightNode!=null){
			rv+="--right:"+rightNode.toString();
		}
		return rv;
	}
	
	public void printf(){
		System.out.println(this.toString());
	}
}
