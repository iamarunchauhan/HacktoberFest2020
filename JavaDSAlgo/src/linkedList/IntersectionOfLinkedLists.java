package linkedList;

public class IntersectionOfLinkedLists {

	static Node head1;
	static Node head2;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	int getNode() {
		
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		
		int d;
		
		if(c1>c2) {
			d = c1-c2;
			return intersectionNode(d, head1, head2);
			
		} else {
			d = c2-c1;
			return intersectionNode(d, head2, head1);
		}
		
	}
	
	int intersectionNode(int d, Node head1, Node head2) {
		
		Node curr1 = head1;
		Node curr2 = head2;
		
		int i;
		
		for(i = 0; i < d; i++) {
			if(curr1 == null)
				return -1;
			
			curr1 = curr1.next;
		}
		
		while(curr1 !=null && curr2 != null) {
			if(curr1.data == curr2.data)
				return curr1.data;
			
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		
		return -1;
	}
	
	
	
	int getCount(Node n) {
		
		Node curr = n;
		int count = 0;
		
		while(curr!=null) {
			
			count++;
			curr = curr.next;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		
		IntersectionOfLinkedLists list = new IntersectionOfLinkedLists();
		
		// creating first linked list 
		list.head1 = new Node(3); 
        list.head1.next = new Node(6); 
        list.head1.next.next = new Node(9); 
        list.head1.next.next.next = new Node(15); 
        list.head1.next.next.next.next = new Node(30); 
	
        // creating second linked list 
        list.head2 = new Node(8); 
        list.head2.next = new Node(15); 
        list.head2.next.next = new Node(13);
        
        System.out.println("The node of intersection is : " + list.getNode());
        
	}

}
