public class LinkedListRevIter{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    static Node head = null;
    static int size =0;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = newNode;
            return;

        }

        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }

        tmp.next = newNode;

    }

    public void addafter(int ind, int data){
        Node tmp = head;
        size++;
        int count = 1;
        Node newNode = new Node(data);
        while(count != ind){
            tmp = tmp.next;
            count++;
            }
        newNode.next = tmp.next;
        tmp.next = newNode;
    }

    public void delFirst(){
        if(head == null){
            System.out.println("The linked list is already empty.");
            return;
        }
        size--;

        Node tmp = head;
        head = tmp.next;
               
    }

    public void delLast(){
        if(head == null){
            System.out.println("The linked list is already empty.");
            return;
        }
        size--;

        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node last = head.next;

        while(last.next != null){
            secondlast = last;
            last = last.next;

        }

        secondlast.next = null;        
        }
    

    public void display(){
        Node tmp = head;
        if(head == null){
            System.out.println("The linked list is empty.");
            return;
        }
        while(tmp != null){
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
        
    }

    public void size(){
        System.out.println(size);
    }

    public void listRev(){
         if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;

       
        while(currNode !=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // updating the value of prevNode and currNode 
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;


    }

    public static void main(String[] args){
        LinkedListRevIter list = new LinkedListRevIter();
        list.display();
        list.addFirst(5);
        list.addFirst(8);
        list.addFirst(2);
        list.addFirst(6);
        list.addFirst(3);
        list.display();
        list.size();
        list.addLast(0);
        list.addLast(9);
        list.display();
        list.addafter(2, 7);
        list.display();
        list.delFirst();
        list.display();
        list.delLast();
        list.display();
        list.listRev();
        list.display();
    }
}