import java.util.LinkedList;
public class LinkedListColFrame{
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<> ();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(1);
        list.addFirst(7);
        System.out.println(list);

        System.out.println(list.get(2));

        // printing all the elements using iteration method 
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.addLast(8);
        list.add(2, 4);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.indexOf(3));
    }

}