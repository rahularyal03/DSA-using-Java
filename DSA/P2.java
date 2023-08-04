public class P2{
    public static  int index = -1;
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
    
public Node binaryTrii(int arr[]){
    index++;
    if(arr[index]==-1){
        return null;
    }
    Node newNode = new Node(arr[index]);
    newNode.leftNode = binaryTrii(arr);
    newNode.rightNode = binaryTrii(arr);

    return newNode;

}
  
    public static void main(String[] args){
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        P2 list = new P2();
        Node root = list.binaryTrii(arr);
        System.out.println(root.data);
    }
}