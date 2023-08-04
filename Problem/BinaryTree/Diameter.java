package Problem.BinaryTree;
import Problem.BinaryTree.HeightOfBinaryTree;
public class Diameter {
    
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

            if(nodes[ind] == -1){
                return null;
            }

            Node newNode = new Node(nodes[ind]);
            newNode.left = binarytree(nodes);
            newNode.right = binarytree(nodes);
            
            return newNode;
        }

        // Importing from the HeightOfBinaryTree
        HeightOfBinaryTree tree1 = new HeightOfBinaryTree();


        public int diameter(Node root){

            int diameter1 = diameter(root.left);
            int diameter2 = diameter(root.right);

            // using the code same as finding the height of tree
            int diameter3 = tree1.treeHeight(root) + tree1.treeHeight(root.right)



        }

      
    
    public static void main(String[] args){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

       Diameter tree = new Diameter();
       Node root = tree.binarytree(nodes);
       System.out.println("Root node = " + root.data);
       hiii
    }
}

