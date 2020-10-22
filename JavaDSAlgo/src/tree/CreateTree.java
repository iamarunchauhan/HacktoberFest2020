/*A Java Program to create a tree & perform inorder, preorder and postorder travsersal*/

package tree;

import java.util.Scanner;

public class CreateTree {

	static class Node {
		
		int data;
		Node left, right;
		
		public Node(int item) {
			this.data = item;
		}
	}
	
	static Scanner sc = null;
	
	static Node constructTree() {
		Node root = null;
		
		System.out.println("Enter Data : ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for : " + data);
		root.left = constructTree();
		
		System.out.println("Enter right for : " + data);
		root.right = constructTree();
		
		return root;
		
	}
	
	static void inOrder(Node root) {
		
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data +" ");
		inOrder(root.right);
	}
	
	static void preOrder(Node root) {
		
		if(root == null) return;
		
		System.out.print(root.data +" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void postOrder(Node root) {
		
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data +" ");
	}
	
	
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		Node root = constructTree();
		
		System.out.println("InOrder Traversal ");
		inOrder(root);
		System.out.println();
	
		System.out.println("PreOrder Traversal ");
		preOrder(root);
		System.out.println();
	
		System.out.println("PostOrder Traversal ");
		postOrder(root);
		System.out.println();

	}

}
