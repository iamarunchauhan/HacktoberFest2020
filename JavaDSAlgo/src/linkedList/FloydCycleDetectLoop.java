package linkedList;

import linkedList.MiddleElem.Node;

public class FloydCycleDetectLoop {

	Node head;
	  
    class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
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
    
    public void DetectLoop() {
    	
    	Node slowPtr = head;
		Node fastPtr = head;
		
		int flag = 0;
		
		while(slowPtr!=null && fastPtr!=null && fastPtr.next!=null) {
			
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			
			if(slowPtr == fastPtr) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 1)
			System.out.println("Loop Found");
		else
			System.out.println("Loop Not Found");
		
    }
    
	public static void main(String[] args) {
		
		FloydCycleDetectLoop mylist = new FloydCycleDetectLoop(); 
		  
		mylist.push(20); 
		mylist.push(4); 
		mylist.push(15); 
		mylist.push(10); 
  
		//Creating a cycle to check our functionality
		mylist.head.next.next.next.next = mylist.head; 
  
		mylist.DetectLoop();
	}

}
