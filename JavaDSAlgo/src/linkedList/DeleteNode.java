package linkedList;

public class DeleteNode {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void push(int data) {
		Node new_node = new Node(data);
		
		new_node.next = head;
		head = new_node;
	}
	
	public void delete(int key) {
		Node curr = head;
		Node prev = null;
		
		if(curr.next!=null && curr.data == key) {
			head = curr.next;
			return; 
		}
		
		if(curr.next!=null && curr.data != key) {
			prev = curr;
			curr = curr.next;
		}
		
		if (curr == null) return;
		
		prev.next = curr.next;
		
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
	
		DeleteNode mylist = new DeleteNode();
		mylist.push(10);
		mylist.push(20);
		mylist.push(30);

		System.out.println("\nCreated Linked List - "); 
        mylist.printList(); 
        
        mylist.delete(20);
        
        System.out.println("\nLinked List after Deletion at position 2:"); 
        mylist.printList();
	}

}
