/*Binary Tree Creation in Java*/

package tree;

class Node {
	int data;
	Node left, right;
	
	public Node(int item){
		
		data = item;
		left = right = null;
	}
}

public class BinaryTree {

	Node root;
	
	BinaryTree(int item){
		root = new Node(item);
	}
	
	BinaryTree(){
		root = null;
	}
	
	
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		
		//Root Node created
		bt.root = new Node(1);
		
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		
		bt.root.left.left = new Node(4);
	}

}
