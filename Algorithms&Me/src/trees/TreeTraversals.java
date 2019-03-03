package trees;

class Node {

	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class TreeTraversals {
	static Node root;

	public TreeTraversals() {
		root = null;
	}

	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		TreeTraversals tree = new TreeTraversals();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(12);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(9);
		tree.root.right.right = new Node(14);

		System.out.println("Inorder traversal::");
		tree.inorder(root);
		System.out.println("\nPostorder traversal::");
		tree.postOrder(root);
		System.out.println("\nPreOrder traversal::");
		tree.preOrder(root);
	}

	public Node insert(Node node) {
		if (root == null)
			return null;
		if (node.data < root.data) {
			insert(root.left);

		} else
			insert(root.right);
		return root;
	}

	public Node search(Node node) {
		if (root == null)
			return null;
		if (node.data == root.data)
			return root;
		if (node.data < root.data)
			return search(root.left);
		else
			return search(root.right);
	}

	public void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print("\t" + root.data);
		inorder(root.right);

	}

	public void postOrder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		inorder(root.right);
		System.out.print("\t" + root.data);

	}

	public void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print("\t" + root.data);
		inorder(root.left);
		inorder(root.right);

	}

}
