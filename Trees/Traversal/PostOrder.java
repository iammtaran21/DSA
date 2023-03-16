class Node {
		int key;
		Node left, right;
		public Node(int item)
		{key = item;
		left = right = null;
		}
}

class BinaryTree_POST {
	// Root of Binary Tree
	Node root;
	BinaryTree_POST() { root = null; }
	void printPostorder(Node node)
	{
		if (node == null)
			return;
		printPostorder(node.left);

		printPostorder(node.right);
		
		System.out.println(node.key + " ");
	}

	// Wrappers over above recursive functions
	void printPostorder() { printPostorder(root); }

	// Driver code
	public static void main(String[] args){
		BinaryTree_POST tree = new BinaryTree_POST();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		// Function call
		tree.printPostorder();
	}

}