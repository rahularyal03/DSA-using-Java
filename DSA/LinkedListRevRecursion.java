public class LinkedListRevRecursion {
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

    public Node revRecursion(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newNode = revRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
    public static void main(String[] args){
        LinkedListRevRecursion list = new LinkedListRevRecursion();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
        head = list.revRecursion(head);
        list.display();
        
    }
}
