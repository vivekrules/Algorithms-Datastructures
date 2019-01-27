package linkedlist;

public class LinkedListLength {

	public static Node head;

	public static void main(String args[]) {

		LinkedListLength obj = new LinkedListLength();// modify the code to
														// accept user input at
														// run time
		// write test cases for each method before pushing code to the github
		// repo

		obj.insertAtHead(head, 10);
//		obj.insertAtHead(head, 20);
//		obj.insertAtMiddle(head, 30);
		obj.insertAtEnd(head, 40);
		obj.insertAtEnd(head, 50);
		System.out.println("The given linked list is:" + "Head->");
		obj.printList(head);
		System.out.print("->NULL");
		System.out.println("The length of the linked list is::" + obj.findLength(head));

	}

	private Node insertAtEnd(Node head2, int i) {
		if (head2 != null) {
			Node temp = head2;
			while (temp.next != null) {
				temp = temp.next;
			}
			Node new_node = new Node(i);
			temp.next = new_node;
			return head2;

		}
		return null;

	}

	private void printList(Node head2) {
		Node temp = head2;
		while (temp.next != null)
			System.out.println(temp.data + "->");
		temp = temp.next;
	}

	private int findLength(Node head2) {
		Node temp = head2;
		int counter = 0;
		while (temp.next != null) {
			temp = temp.next;
			counter++;

		}

		return counter;
	}

	private Node insertAtMiddle(Node head2, int i) {//complete this method

		Node temp = head2;

		return null;

	}

	private Node insertAtHead(Node head, int i) {
		Node new_node = new Node(i);
		if (head == null) {
			head = new_node;
			return head;
		}

		new_node.next = head;
		head = new_node;
		return head;

	}
}
