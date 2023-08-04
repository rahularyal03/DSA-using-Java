package Problem.BinaryTree;

public class HeightOfBinaryTree {
    
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

        public int treeHeight(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = treeHeight(root.left);
            int rightHeight = treeHeight(root.right);

            int max_height = Math.max(leftHeight, rightHeight);


            return max_height + 1;
        }

    
    public static void main(String[] args){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

       HeightOfBinaryTree tree = new HeightOfBinaryTree();
       Node root = tree.binarytree(nodes);
       System.out.println("Root node = " + root.data);
       System.out.println();

       int height = tree.treeHeight(root);
       System.out.println("The Height of tree = " + height);

    }
}

