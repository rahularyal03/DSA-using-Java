public class Palindrome{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void display(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(tmp.data + " ");
            tmp = tmp.next;

        }
        System.out.println();


    }

    public Node middle(){
        Node turtle = head;
        Node hare = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;
    }

    public Node revSec(Node head){
       if(head == null || head.next == null){
        return head;
       }
        Node newhead = revSec(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }

    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        Node mid = middle();
        Node secHead = revSec(mid.next);

        Node firstHead = head;

        while(secHead != null){
            if(firstHead.data != secHead.data){
                return false;
            }

            firstHead = firstHead.next;
            secHead = secHead.next;


        }

        return true;

    }

    public static void main(String[]  args){
        Palindrome list = new Palindrome();
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(4);
        list.addFirst(3);
        list.display();

        boolean y = list.isPalindrome();
        System.out.println(y);

    }
}