package tree;

public class TreeTest {
	public Node root = new Node();
	public Node node1= new Node();
	public Node node2= new Node();
	public Node node3= new Node();
	public Node node4= new Node();
	public Node node5= new Node();
	public Node node6= new Node();
	
	public void SimpleBinaryTree() {
		
		root.setObj("root");
		node1.setObj("node1");
		node2.setObj("node2");
		node3.setObj("node3");
		node4.setObj("node4");
		node5.setObj("node5");
		node6.setObj("node6");
		root.setRoot(true);
		root.setLeftNode(node1);
		root.setRightNode(node2);
		node1.setLeftNode(node3);
		node1.setRightNode(node4);
		node3.setLeftNode(node5);
		node5.setRightNode(node6);
	}
	
	public void printf(){
		root.printf();
	}
	public static void main(String[] args) {
		TreeTest t = new TreeTest();
		t.SimpleBinaryTree();
		t.printf();
	}

}
