package linkedList;

import java.util.*;

public class LengthOfLoop {
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	static Node newNode(int key)  
	{  
	    Node temp = new Node(key); 
	      
	    return temp;  
	} 	
	
	static int countLegth(Node n) {
		int count = 1;
		Node temp = n;
		
		while(temp.next!=n) {
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	static int detectLoop(Node mynode) {
		
		Node slowPtr = mynode;
		Node fastPtr = mynode;
		
		while(slowPtr!=null & fastPtr!=null && fastPtr.next!=null) {
			
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			
			if(slowPtr == fastPtr)
				return countLegth(slowPtr);
		}
	
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		Node head = newNode(1);  
	    head.next = newNode(2);  
	    head.next.next = newNode(3);  
	    head.next.next.next = newNode(4);  
	    head.next.next.next.next = newNode(5); 
		
		/* Create a loop for testing */
	    head.next.next.next.next.next = head.next;

	    System.out.println(detectLoop(head)); 
	}

}
