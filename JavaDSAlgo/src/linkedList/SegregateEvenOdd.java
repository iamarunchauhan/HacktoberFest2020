package linkedList;

import linkedList.removeDuplicate.Node;

public class SegregateEvenOdd {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	
	public void segregateEvenOdd() { 
        
        Node evenStart = null; 
        Node evenEnd = null; 
        Node oddStart = null; 
        Node oddEnd = null; 
        Node currentNode = head; 
          
        while(currentNode != null) { 
            int element = currentNode.data; 
              
            if(element % 2 == 0) { 
                  
                if(evenStart == null) { 
                    evenStart = currentNode; 
                    evenEnd = evenStart; 
                } else { 
                    evenEnd.next = currentNode; 
                    evenEnd = evenEnd.next; 
                } 
                  
            } else { 
                  
                if(oddStart == null) { 
                    oddStart = currentNode; 
                    oddEnd = oddStart; 
                } else { 
                    oddEnd.next = currentNode; 
                    oddEnd = oddEnd.next; 
                } 
            } 
                        // Move head pointer one step in forward direction 
            currentNode = currentNode.next;     
        } 
          
          
        if(oddStart == null || evenStart == null) { 
            return; 
        } 
          
        evenEnd.next = oddStart; 
        oddEnd.next = null; 
        head=evenStart; 
    }
	
	void addNode(int data) {
		
		Node newNode = new Node(data);
		
		newNode.next = head;
		
		head = newNode;
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
		
		SegregateEvenOdd llist = new SegregateEvenOdd();
		
		llist.addNode(10); 
        llist.addNode(11); 
        llist.addNode(13); 
        llist.addNode(12); 
        llist.addNode(14); 
        llist.addNode(15); 
        llist.addNode(16); 
		
		System.out.println("Elements in a linked list are : ");
		llist.printList();

		llist.segregateEvenOdd();
		
		System.out.println("\nElements in a linked list after segregation are : ");
		llist.printList();
		
	}

}
