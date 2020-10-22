package linkedList;

public class ReverseLinkedList {

	static Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	Node reverse(Node node) {
		Node prev = null;
		Node curr = node;
		Node next = null;
		
		while(curr!=null) {
			next = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = next;
		}
		node = prev;
		return node;
	}
	
	
	void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
	
	public static void main(String[] args) {
		
		ReverseLinkedList mylist = new ReverseLinkedList();
		mylist.head = new Node(55);
		mylist.head.next = new Node(72);
		mylist.head.next.next = new Node(81);
		mylist.head.next.next.next = new Node(87);
		
		System.out.println("Given Linked list"); 
        mylist.printList(head); 
        
        head = mylist.reverse(head); 
        System.out.println(""); 
        
        System.out.println("Reversed linked list "); 
        mylist.printList(head);

	}

}
