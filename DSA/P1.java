public class P1{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }


    Node head = null;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node tmp = head;
        while(tmp.next !=null){
            tmp = tmp.next;
        }

        tmp.next = newNode;
    }

    public void addAfter(int index, int data ){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node tmp = head;
        int count = 1;
        while(index != count){
            tmp = tmp.next;
            count++;
        }
        newNode.next = tmp.next;
        tmp.next = newNode;

    }

    public void display(){
        Node tmp = head;

        if(head == null){
            System.out.println("The list is already empty.");
            return;
        }
        while(tmp != null){
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }

        System.out.println();

    }

    public void listrev(){
        Node prevNode = head;
        Node currNode = head.next;

        if(head == null || head.next == null){
            return;
        }

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;

        
    }


    
    public static void main(String[] args){
        P1 list = new P1();
        list.display();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(6);
        list.addAfter(1, 5);
        list.addAfter(2, 4);
        list.addLast(0);
        list.display();
        list.listrev();
        list.display();

    }
}