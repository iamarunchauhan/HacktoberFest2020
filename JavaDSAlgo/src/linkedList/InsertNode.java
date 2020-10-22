package linkedList;


public class InsertNode {

	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	
	public void push(int new_data) 
	{ 
		Node new_node = new Node(new_data); 

		new_node.next = head; 
		head = new_node; 
	} 
	

	public void append(int new_data) 
	{ 
		
		Node new_node = new Node(new_data); 

		if (head == null) 
		{ 
			head = new Node(new_data); 
			return; 
		} 

		new_node.next = null; 

		Node last = head; 
		while (last.next != null) 
			last = last.next; 

		last.next = new_node; 
	} 

	
	/* Inserts a new node after the given prev_node. */
    public void insertAfter(Node prev_node, int new_data) 
    { 
        if (prev_node == null) 
        { 
            System.out.println("The given previous node cannot be null"); 
            return; 
        } 
  
        Node new_node = new Node(new_data); 
  
        new_node.next = prev_node.next; 
  
        prev_node.next = new_node; 
    } 

	public void printList() 
	{ 
		Node n = head; 
		while (n != null) { 
			System.out.print(n.data + " "); 
			n = n.next; 
		} 
	} 
	
	
	public static void main(String[] args) {
		InsertNode llist = new InsertNode(); 

		llist.head = new Node(2); 
		Node second = new Node(4); 
		
		Node third = new Node(6);
		
		llist.head.next = second; // Link first node with the second node 
		second.next = third; 
		
		System.out.println("LinkedList before Insertion");
		llist.printList();
		
		System.out.println();
		llist.push(12);
		
		System.out.println("LinkedList after Insertion at head - ");
		llist.printList();
		
		System.out.println();
		llist.append(30);
		
		System.out.println("LinkedList after Insertion at last - ");
		llist.printList();
		
		llist.insertAfter(llist.head.next.next.next, 19);
		System.out.println();
		
		System.out.println("LinkedList after Insertion of 19 at 4th postion - ");
		llist.printList();
		
	}

}
