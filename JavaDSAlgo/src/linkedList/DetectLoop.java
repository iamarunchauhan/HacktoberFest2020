// Program in Java to check whether Loop is present or not

package linkedList;

import java.util.HashSet;

public class DetectLoop {

	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	static void addNode(int data) {
		
		Node newNode = new Node(data);
		
		newNode.next = head;
		
		head = newNode;
	}
	
	static boolean findLoop(Node h) {
	
		HashSet<Node> hs = new HashSet<Node>(); //Using Hashing for Loop Detection
		
		while(h!=null) {
			
			if(hs.contains(h))
				return true;
			
			hs.add(h);
			h = h.next;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		DetectLoop mylist = new DetectLoop();
		
		mylist.addNode(15);
		mylist.addNode(24);
		mylist.addNode(39);
		mylist.addNode(47);
		mylist.addNode(61);
		
		//It will create a loop between 2nd & 5th node
		head.next.next.next.next = head.next; 
		
		if(mylist.findLoop(head) == true)
			System.out.println("Loop found");
		else 
			System.out.println("Loop not found");
	}

}
