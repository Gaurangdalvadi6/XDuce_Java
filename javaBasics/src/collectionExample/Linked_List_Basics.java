package collectionExample;
// 15/4/2024
public class Linked_List_Basics {
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next= null;
		}
	}
	public static Node head;
	public static Node tail;
	
	public void addFirst(int data) {  // O(1)
		// step-1 create node
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			return;
		}
		// step-2 - newNode next = head
		newNode.next=head; // link
		
		// step-3 - head = newNode
		head = newNode;
	}
	
	public void addLast(int data) {  // O(1)
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			return;
		}
		// step 2 - tail next = head
		tail.next = newNode;
		
		// step 3 tail = neWNode
		tail = newNode;
	}
	
	public void print() {        // O(n)
		if (head == null) {
			System.out.println("Linked List is empty");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		Linked_List_Basics ll = new Linked_List_Basics();

		ll.print();
		ll.addFirst(2);
		ll.print();
		ll.addFirst(1);
		ll.print();
		ll.addLast(3);
		ll.print();
		ll.addLast(4);
		ll.print();
		
		
	}
}
