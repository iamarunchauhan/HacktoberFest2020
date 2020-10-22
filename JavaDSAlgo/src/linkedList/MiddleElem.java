//Program in Java to find Middle Element in a Linked List

package linkedList;

import java.util.*;

public class MiddleElem {

Node head;
	
	//Node class for data & next
	class Node{
		int data;
		Node next;
		
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	//Method for adding Node into our Linked List
	public void addNode(int data) {
		 
		Node newNode = new Node(data);
		
		newNode.next = head;
		head = newNode;
	}	
	
	void middleElem() {
		
		Node slowPtr = head;
		Node fastPtr = head;
		
		if(head!=null) {
			while(fastPtr!=null && fastPtr.next!=null) {
				fastPtr = fastPtr.next.next;
				slowPtr = slowPtr.next;
			}
			
			System.out.println("Middle element in a Linked List is : "+slowPtr.data);
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
		MiddleElem mylist = new MiddleElem();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in a Linked List : ");
		
		int numElem = sc.nextInt();
		
		System.out.println("Enter elements one by one");
		for(int i = numElem; i > 0; --i) {
			
			int elem = sc.nextInt();
			mylist.addNode(elem);
			
		}
		
		mylist.printList();
		System.out.println();
		mylist.middleElem();
	
	}
}
