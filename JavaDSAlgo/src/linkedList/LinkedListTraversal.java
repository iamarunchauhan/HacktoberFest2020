package linkedList;

class LinkedListTraversal { 
	Node head; // head of list 

	//Made static so that main class can access it
	static class Node { 
		int data; 
		Node next; 
		
		Node(int d) //Using Parameterized constructor
		{ 
			data = d; 
			next = null; 
		} 
	} 

	/* Print data of LinkedList*/
	public void printList() 
	{ 
		Node n = head; 
		while (n != null) { 
			System.out.print(n.data + " "); 
			n = n.next; 
		} 
	} 
	
	/* Returns count of nodes in linked list */
    public int getCount() 
    { 
        Node temp = head; 
        int count = 0; 
        while (temp != null) 
        { 
            count++; 
            temp = temp.next; 
        } 
        return count; 
    } 

	
	public static void main(String[] args) 
	{ 
		
		LinkedListTraversal llist = new LinkedListTraversal(); 

		llist.head = new Node(2); 
		Node second = new Node(4); 
		
		/* Here null in fourth next added by constructor not need to add explicitly */
		Node third = new Node(6);
		Node fourth = new Node(12);

		llist.head.next = second; // Link first node with the second node 
		second.next = third; // Link second node with the third node 
		third.next = fourth; // Link third node with the fourth node 

		/* Calling printList function here */
		llist.printList(); 
		
		System.out.println("\nNode count in our LinkedList is : "+llist.getCount());
	} 
}

