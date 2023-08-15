class Node {
    int data;
    Node left;
    Node right;
}

public class Tree 
{
    public static void main(String[] args) {
        Node root = new Node();
        root.data = 20;

        root.left = new Node();
        root.left.data = 10;

        root.right = new Node();
        root.right.data = 30;

        root.left.left = new Node();
        root.left.left.data = 5;

        root.left.right = new Node();
        root.left.right.data = 15;

        root.right.left = new Node();
        root.right.left.data = 25;

        root.right.right = new Node();
        root.right.right.data = 35;

       System.out.println("inorder");
       inOrder(root);
       System.out.println("preorder");
       preOrder(root);
        System.out.println("postorder");
       postOrder(root);
       
        root = insert(35, root); 
        System.out.println("inorder after insert");
        inOrder(root);
    }
    public static void inOrder(Node root)
    {
	if(root==null)
	{
	    return;
	}
	inOrder(root.left);
	System.out.println(root.data);
	inOrder(root.right);
    }
   public static void preOrder(Node root) 
   {
	if (root == null) {
	    return;
	}
	System.out.println(root.data);
	preOrder(root.left);
	preOrder(root.right);
   }
   public static void postOrder(Node root)
   {
   	if(root==null)
   	{
   		return;
   	}
   	postOrder(root.left);
   	postOrder(root.right);
   	System.out.println(root.data);
   }
   public static Node insert(int data,Node root)
   {
   	if(root==null)
   	{
   		root=new Node();
   		root.data=data;
   		return root;
   	}
   	if(data<root.data)
   	{
   		root.left=insert(data,root.left);
   	}
   	if(data>root.data)
   	{
   		root.right=insert(data,root.right);
   	}
   	return root;
   }



}

