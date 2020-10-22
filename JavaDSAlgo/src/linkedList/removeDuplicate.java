package linkedList;

import java.util.*;

public class removeDuplicate {

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
	
	public void removeDuplicate() {
		
		Node curr = head;
		
		while(curr!=null) {
			
			Node temp = curr;
			
			while(temp!=null && temp.data == curr.data) {
				temp = temp.next;
			}
			
			curr.next = temp;
			curr = curr.next;
		}
	}
	
	
	public void printList() {
		Node node = head; 
        while (node != null) 
        { 
            System.out.print(node.data+" "); 
            node = node.next; 
        }
	}
	
	public static void main(String[] args) {
		
		removeDuplicate mylist = new removeDuplicate();
		
		mylist.addNode(10);
		mylist.addNode(11);
		mylist.addNode(11);
		mylist.addNode(11);
		mylist.addNode(12);
		mylist.addNode(15);
		mylist.addNode(15);
		
		System.out.println("Elements in a Linked List are : ");
		mylist.printList();
		
		mylist.removeDuplicate();
		
		System.out.println("\nElements in a Linked List are removal of duplicate  : ");
		mylist.printList();

	}

}
