package trees;

public class TreeDeletion {

	static Node root;

	public TreeDeletion() {
		root = null;
	}

	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		TreeDeletion tree = new TreeDeletion();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(12);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(9);
		tree.root.right.right = new Node(14);

		System.out.println("Inorder traversal of the contructed tree::");
		tree.inorder(root);
		System.out.println("\n Deleting the tree:");
		root=tree.delete(root);
		System.out.println("Invoking inorder traversal again:");
		tree.inorder(root);
		System.out.println("Root reference="+root);

	}

	public void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print("\t" + root.data);
		inorder(root.right);

	}

	public Node delete(Node rootRef) {
		if (rootRef == null)
			return null;
		delete(rootRef.left);
		delete(rootRef.right);

		return rootRef = null;
	}

}
