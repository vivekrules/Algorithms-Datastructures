package linkedlist;

/**
 * @author Vivek Singh
 *
 */
public class LinkedListDeletion {

	static Node head;

	public static void main(String args[]) {

		LinkedListDeletion list = new LinkedListDeletion();

		list.pushNode(10);
		list.pushNode(20);
		list.pushNode(30);
		list.pushNode(40);

		System.out.println("Printing the linked list elements:");
		list.printList(head);

		System.out.println("\n Deleting Node with given key::");
		list.deleteNodeWithKey(30);
		list.printList(head);

		System.out.println("\n Deleting the node at the given position::");
		list.deleteNodeWithPosition(2);
		System.out.println("Printing the linked list after deletion::");
		list.printList(head);
	}

	private void printList(Node head2) {

		Node temp = head2;
		while (temp != null) {
			System.out.print("\t" + temp.data);
			temp = temp.next;
		}
	}

	private Node pushNode(int i) {
		Node new_node = new Node(i);
		new_node.next = head;
		head = new_node;
		return head;
	}

	private Node deleteNodeWithKey(int key) {

		Node temp = head;
		if (temp.data == key) {
			head = temp.next;
			temp = null;
		}
		Node temp2 = temp.next;
		while (temp2 != null && temp != null) {
			if (temp2.data == key) {
				temp.next = temp2.next;

			}
			temp2 = temp2.next;
			temp = temp.next;
		}
		return head;
	}

	private Node deleteNodeWithPosition(int position) {
		Node temp = head;
		int pos = 1;
		if (position == pos) {
			head = head.next;
			return head;
		}

		Node temp2 = head.next;
		while (temp2 != null && temp != null) {
			if (position == pos) {
				temp.next = temp2.next;
				temp2 = null;
				return head;
			}
			temp2 = temp2.next;
			temp = temp.next;
			pos++;

		}
		return head;
	}
}
