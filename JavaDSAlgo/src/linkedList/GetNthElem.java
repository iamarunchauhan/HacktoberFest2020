// Program in Java to find the nth element in a Linked List

package linkedList;

public class GetNthElem {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void addNode(int data) {
		
		Node newNode = new Node(data);
		
		newNode.next = head;
		
		head = newNode;
	}
	
	public int getNode(int position) {
		
		Node curr = head;
		
		int count = 0;
		while(curr!=null) {
			if(count == position)
				return curr.data;
			count = count + 1;
			curr = curr.next;
		}
		
		assert(false);
		return 0;
	}
	
	public static void main(String[] args) {
	
		GetNthElem mylist = new GetNthElem();
		
		mylist.addNode(5);
		mylist.addNode(7);
		mylist.addNode(9);
		mylist.addNode(11);
		mylist.addNode(13);
		mylist.addNode(15);

		System.out.println("Element at index 4 is : "+mylist.getNode(4));
	}

}
