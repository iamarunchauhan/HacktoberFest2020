package circularLinkedList;

public class TraversalCLL {

	static class Node {
		int data;
		Node next;
	}
	
	static Node push(Node head, int d) {
		
		Node newNode = new Node();
		Node curr = head;
		newNode.data = d;
		newNode.next = head;
		
		if(head !=null) {
			
			while(curr.next != head) {
				curr = curr.next;
			}
			
			curr.next = newNode;
			
		} else {
			
			newNode.next = newNode;
		}
		
		head = newNode;
		return head;
	}
	
	
	static void printList(Node head) {
		
		Node temp = head;
		
		if(head!=null) {
			
			do {
				System.out.print(temp.data +" ");
				temp = temp.next;
			}
			while(temp.next != head);
		}
	}
	
	
	public static void main(String[] args) {
		
		Node head = null;
		
		head = push(head, 7);
		head = push(head, 9);
		head = push(head, 11);
		head = push(head, 13);
		head = push(head, 15);
		
		System.out.println("Elements in a Circular Linked List are : ");
		printList(head);
		
	}

}
