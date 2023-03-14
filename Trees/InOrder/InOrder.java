class Node{
        int key;
        Node left,right;
        public Node(int item)
        {key=item;
         left =right=null;
        }
    }
class BinaryTree {
    Node root;
    BinaryTree() {root=null;}
    void printInorder(Node node)
    {
        if (node==null)
            return;
        
        printInorder(node.left);
        
        System.out.println(node.key+" ");

        printInorder(node.right);
    }

    //Wrapper for recursive function- printInorder()
    void printInorder(){printInorder(root);}

    //Driver code
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);

        //Call Function
        tree.printInorder();
    }

}
