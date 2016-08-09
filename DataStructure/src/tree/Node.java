package tree;

public class Node {
	
	private Object obj;
	private Node leftNode;
	private Node rightNode;
	private Node parentNode;
	private static boolean isRoot = false;

	public Node(Object obj, Node leftNode, Node rightNode, Node parentNode) {
		this.obj = obj;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.parentNode = parentNode;
	}

	public Node() {	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
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
		return obj.toString();
	}
	
	public void printf(){
		System.out.println(this.toString());
	}
}
