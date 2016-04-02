package Questions;

// Recursive Java program to find the diameter of a
// Binary Tree

/* Class containing left and right child of current
node and key value*/
class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Result{

    int ht =0;
    int diam=0;


}



/* Class to print the Diameter */
public class DiameterBinaryTree
{
    static Node root;




    public static Result diameter(Node root)
    {
        if(root == null){

            return new Result();

        }


        Result left = diameter(root.left);
        Result right = diameter(root.right);

        Result res = new Result();

        res.ht = 1+ Math.max(left.ht, right.ht);

        int diam = 1+left.ht + right.ht;

        res.diam = Math.max(diam,Math.max(left.diam,right.diam));


        return res;



    }



    public static void main(String args[])
    {
		/* creating a binary tree and entering the nodes */
        DiameterBinaryTree tree = new DiameterBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The diameter of given binary tree is : "
                + tree.diameter(root).diam);
    }
}
