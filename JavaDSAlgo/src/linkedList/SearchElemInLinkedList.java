//Java Program to check whether an Element is present in a Linked List or Not

package linkedList;

public class SearchElemInLinkedList {

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
	
	
	//Passing the element to be searched in this Method
	public boolean SearchElem(int key) {
		
		Node curr = head;
		while(curr.next!=null) {
			if(curr.data == key)
				return true;	//Return true if element is found
			curr = curr.next;
		}
		
		return false; //Return false if element is not found
	}
	
	//Main Method
	public static void main(String[] args) {
		
		SearchElemInLinkedList mylist = new SearchElemInLinkedList();
		
		//Adding Node
		mylist.addNode(10); 
		mylist.addNode(25);
		mylist.addNode(30);
		
		int element = 30;
		
		boolean result = mylist.SearchElem(element);
		
		//System.out.println(result);
		
		if(result == true) 
			System.out.println("Element "+element+" is present in a Linked List");
		else
			System.out.println("Element "+element+" is not present in a Linked List");
		
	}

}
