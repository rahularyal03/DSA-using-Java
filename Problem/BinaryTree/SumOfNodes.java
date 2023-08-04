// Binary Tree

package Problem.BinaryTree;

import java.util.*;
public class SumOfNodes {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        public static int ind = -1;


        public Node binarytree(int nodes[]){
            ind++;

            if(nodes[ind] ==-1){
                return null;
            }

            Node newNode = new Node(nodes[ind]);
            newNode.left = binarytree(nodes);
            newNode.right = binarytree(nodes);
            
            return newNode;
        }

        
        public int totalSum(Node root){
            if(root == null){
                return 0;  
            }

            int leftSum = totalSum(root.left);
            int rightSum = totalSum(root.right);

            return leftSum + rightSum + root.data;
        }

      
    
    public static void main(String[] args){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

       SumOfNodes tree = new SumOfNodes();
       Node root = tree.binarytree(nodes);
       System.out.println("Root node = " + root.data);
       System.out.println();

       int sumOfNodes = tree.totalSum(root);
       System.out.println("Total sum of all nodes = " + sumOfNodes);
    }
}
