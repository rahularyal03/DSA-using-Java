import java.util.*;
import java.util.LinkedList;
public class BinaryTreeTraversal {
    static int index = -1;
     class Node{
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;

        }
    }

        public Node BT(int array[]){
            index++;
            if(array[index] == -1){
                return null;
            }

            Node newNode = new Node(array[index]);
            newNode.leftNode = BT(array);
            newNode.rightNode = BT(array);

            return newNode;


        }
        // DFS
        public void preorderTraversal(Node root){
            if(root == null){
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");

            preorderTraversal(root.leftNode);
            preorderTraversal(root.rightNode);
        }

        public void inorderTraversal(Node root){
            if(root == null){
                System.out.print(-1 + " ");
                return;
            }

            inorderTraversal(root.leftNode);
            System.out.print(root.data + " ");

            inorderTraversal(root.rightNode);
        }

        public void postorderTraversal(Node root){
            if(root == null){
                System.out.print(-1 + " ");
                return;
            }

       

            postorderTraversal(root.leftNode);
            postorderTraversal(root.rightNode);
            System.out.print(root.data + " ");

        }
        

        // BFS
         public void levelOrderTraversal(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currentNode = q.remove();
                if(currentNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }

                    else{
                        q.add(null);
                    }
                }

                else{
                    System.out.print(currentNode.data+ " ");
                    if(currentNode.leftNode != null){
                        q.add(currentNode.leftNode);
                    }

                    if(currentNode.rightNode != null){
                        q.add(currentNode.rightNode);
                    }
                }
                

            }
        }

       

    public static void main(String[] args){
        int array[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        
        Node root = tree.BT(array);
        System.out.println(root.data);
        System.out.println();

        tree.preorderTraversal(root);
        System.out.println();

        tree.inorderTraversal(root);
        System.out.println();

        tree.postorderTraversal(root);
        System.out.println();
        System.out.println();



        tree.levelOrderTraversal(root);
    }

    
}
