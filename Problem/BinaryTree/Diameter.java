package Problem.BinaryTree;
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


        public static int treeHeight(Node root){
            if(root == null){
                return 0;
            }
            int left_Height = treeHeight(root.left);
            int right_Height = treeHeight(root.right);
            int max_height = Math.max(left_Height, right_Height);

            return max_height + 1;
        }

        // Importing from the HeightOfBinaryTree


        public int diameter(Node root){
            if (root == null){
                return 0;
            }
            int diameter1 = diameter(root.left);
            int diameter2 = diameter(root.right);

            // using the code same as finding the height of tree but we have to find diameter so adding both height

            int diameter3 = treeHeight(root.left) + treeHeight(root.right) +1 ;

            return Math.max(diameter3, Math.max(diameter1, diameter2));
        }


        static class TreeInfo{
            int height;
            int diamm;


            TreeInfo(int height, int diamm){
                this.height = height;
                this.diamm = diamm;
            }
        }



        public TreeInfo dia(Node root){
            if(root == null){
                return new TreeInfo(0, 0);
            }
            TreeInfo left = dia(root.left);
            TreeInfo right = dia(root.right);

            int myHeight = Math.max(left.height, right.height) +1;

            int dia1 = left.diamm;
            int dia2 = right.diamm;
            int dia3 = left.height + right.height +1;

            int myDiameter = Math.max(Math.max(dia1, dia2), dia3);

            TreeInfo myinfo = new TreeInfo(myHeight, myDiameter);
            return myinfo;

        
        }
      
    
    public static void main(String[] args){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

       Diameter tree = new Diameter();
       Node root = tree.binarytree(nodes);
       System.out.println("Root node = " + root.data);
        
       int diaa = tree.diameter(root);
       System.out.println("Diameter1: " + diaa);
       
        int diaa1 = tree.dia(root).diamm;
        System.out.println("Diameter2 = " + diaa1);
    }
}

