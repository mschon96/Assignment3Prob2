/*
Name : Mariah Schon
Class : 3320-001
Assignment 3
Due Date : September 22, 2016
Honor Pledge: On my honor as a student of the University
of Nebraska at Omaha, I have neither given nor received
unauthorized help on this homework assignment.

NAME: Mariah Schon
NUID: 581
EMAIL: mschon@unomaha.edu
Partners: CSLC
*/




public class MyBinarySearchTree{
    /*
       public class BinaryNode {
       public int key;
       BinaryNode left;
       BinaryNode right;

       BinaryNode(int x){
       key = x;
       left = right= null;
       }

       BinaryNode(int x, BinaryNode l, BinaryNode r){
       key= x; left = l; right = r;
       }

       }
       */
    private BinaryNode root;

    public BinaryNode getRoot() {return root;}




    public int findMin(){
        return findMin(root).key;
    }
private BinaryNode findMin(BinaryNode t){
        if ( t==null)
            return null;
        if (t.left == null)
            return t;

        return t.left;
    }

    public int findMax(){
        return findMax(root).key;
    }

    private BinaryNode findMax(BinaryNode t){
        if (t == null)
            return null;
        if (t.right == null)
            return t;
        return findMax(t.right);
    }

    public boolean find(int x ){
        return find (root,x);
    }

    private boolean find(BinaryNode t, int x){
        if (t == null)
            return false;
        if (x< t.key)
            return find(t.left, x);
        else if (x> t.key)
            return find(t.right, x);
        else
            return true;
    }

    public void insert(int x){
        root = insert(root, x);
    }

    private BinaryNode insert(BinaryNode t, int x){
        if ( t == null)
            return new BinaryNode(x, null, null);
        if (x< t.key)
            t.left = insert (t.left, x);
        else if (x> t.key)
            t.right = insert(t.right, x);
        else;

        return t;
    }
public void remove (int x){
        root = remove (root, x);
    }

    private BinaryNode remove (BinaryNode t, int x){
        if (t==null)
            return t;
        if (x< t.key)
            t.left = remove(t.left, x);
        else if (x> t.key)
            t.right = remove(t.right, x);
        else
            if((t.left!=null) && (t.right!= null)){
                t.key = findMin(t.right).key;
                t.right = remove(t.right, t.key);
            }
        if(t.left != null)
            t = t.left;
        else
            t = t.right;

        return t;
    }

    public void printTree(){
        printTree(root);
    }

    private BinaryNode printTree(BinaryNode t){
        if (t!= null){
            printTree (t.left);
            System.out.printf("%d ",t.key);
            printTree(t.right);
        }
        return t;
    }
/*
           Function Name : levelOrder()
Parameters :    root
Return value(s) : NA
Partners : CSLC
Description : This function prints out the level order traversal of this binary search tree; starting at root, then depth 1, and then 2, and so on.
*/

public void levelOrder(){
        // q= tree.insert(root);
    MyQueue q = new MyQueue();
        q.enque(root);

        while(q.isEmpty() ==false)
        {
            BinaryNode our_node = q.deque();
            System.out.printf("%d ", our_node.key);
            if( our_node.left != null)
                q.enque(our_node.left);
            if(our_node.right!= null)
                q.enque(our_node.right);

        }
    }
}
