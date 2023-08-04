
public class LinkedListDelNthFromLast{
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

    public int size(){
        return size;
    }

    public void delFromLast(int index){
        Node tmp = head;
        int size = 0;
        while(tmp != null){
            tmp = tmp.next;
            size++;
        }

        if(head.next == null){
            return;
        }

        if(size == index){
            head = head.next;
            return;
        }
        

        int ind = size - index;
        int count = 1;
        Node tmp1 = head;
       
        while(count != ind){
            count++;
            tmp1 = tmp1.next;
        }

        tmp1.next = tmp1.next.next;
    
    }        


    public static void main(String[] args){
        LinkedListDelNthFromLast list = new LinkedListDelNthFromLast();
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
        System.out.println(list.size());
        list.addafter(2, 7);
        list.display();
        System.out.println(list.size());
        list.delFromLast(8);
        list.display();

    }
}