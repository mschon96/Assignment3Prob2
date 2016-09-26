import java.util.Scanner;
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


public class prob2{
    //public int numLeaves();
    //public int numOneChildNodes();
    //public int numTwoChildrenNodes();

    /*
       Function Name : levelOrder()
Parameters :    root
Return value(s) : NA
Partners : NA
Description : This function prints out the level order traversal of this binary search tree; starting at root, then depth 1, and then 2, and so on.
*/
    //    public void deque(){
    /*

       public void levelOrder(){
       q.enqueue(root);

       while(q!= isEmpty())
       {
       BinaryNode our_node = q.deque();
       System.out.printf("%d", our_node.key);
       if( our_node.left != null)
       q.enque(our_node.left);
       if(our_node.right!= null)
       q.enque(our_node.right);

       }
       }

*/
public static void main (String[] args){
        int choice = 0;

        MyBinarySearchTree tree = new MyBinarySearchTree();
        //        MyQueue q = new MyQueue();

        Scanner input = new Scanner(System.in);

        while( choice !=7){
            System.out.println("Enter your choice for menu below: ");
            System.out.println("1. Insert node");
            System.out.println("2. Print tree");
            System.out.println("3. Print number of leaves in tree");
            System.out.println("4. Print number of nodes in T that contain only one child");
            System.out.println("5. Print number of nodes in T that contain only two children");
            System.out.println("6. Print the level order traversal of the tree");
            System.out.println("7. Exit program:");

            choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.printf("Insert Node:");
                    int insNode = input.nextInt();
                    tree.insert(insNode);
                    //System.out.println("Insert");

                    break;
                case 2:
                    tree.printTree();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Print number of leaves");
                    break;
                case 4:
                    System.out.println("Print number of nodes with 1 child");
                    break;
                case 5:
                    System.out.println("Print number of nodes with 2 children");
                    break;
                case 6:
                    // System.out.println("Print level order");
                    tree.levelOrder();
                    System.out.println(" ");
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
            }
        }

    }
    }
