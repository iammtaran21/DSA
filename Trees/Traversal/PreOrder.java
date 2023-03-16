// Java program for different tree traversals

/* Class containing left and right child of current
node and key value*/
class Node {
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

class BinaryTree_PRE {
	// Root of Binary Tree
	Node root;

	BinaryTree_PRE() { root = null; }

	/* Given a binary tree, print its nodes in preorder*/
	void printPreorder(Node node)
	{
		if (node == null)
			return;

		/* first print data of node */
		System.out.println(node.key + " ");

		/* then recur on left subtree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}

	// Wrappers over above recursive functions
	void printPreorder() { printPreorder(root); }

	// Driver code
	public static void main(String[] args)
	{
		BinaryTree_PRE tree = new BinaryTree_PRE();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		// Function call
		System.out.println(
			"Preorder traversal of binary tree is ");
		tree.printPreorder();
	}
}
