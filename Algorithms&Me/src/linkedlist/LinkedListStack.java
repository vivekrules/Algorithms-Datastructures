package linkedlist;

/**
 * @author Vivek Singh
 *
 */
public class LinkedListStack {

	static Node head;

	public static void main(String args[]) {

		LinkedListStack stck = new LinkedListStack();

		boolean isStackEmpty = stck.isEmpty(head);
		System.out.println("Is the stack empty?" + isStackEmpty);
		stck.push(40);
		stck.push(30);
		stck.push(20);
		stck.push(10);

		System.out.print("Check the top of the stack:" + stck.peek(head));
		System.out.println("\n Pop an element from the stack:" + stck.pop(head));
		System.out.println("Again checking the top element of the stack:" + stck.peek(head));
		isStackEmpty = stck.isEmpty(head);
		System.out.println("is the stack empty?" + isStackEmpty);

	}

	/**
	 * @param data
	 */
	private void push(int data) {

		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;

	}

	/**
	 * @param head2
	 * @return
	 */
	private int pop(Node head2) {

		Node temp = head;
		head = head.next;
		return temp.data;

	}

	private Object peek(Node head2) {

		if (head != null) {
			Node temp = head;
			return temp.data;
		}
		return null;
	}

	private boolean isEmpty(Node head) {
		if (head != null)
			return false;
		else
			return true;
	}

}
