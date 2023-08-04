import java.util.ArrayList;
import java.util.Collections;
public class ArrayListt {

    public static void main(String[] args){
        // Syntax for ArrayList 
        ArrayList<Integer> list = new ArrayList<>();

        // Adding element to ArrayList from last.
        list.add(0);
        list.add(5);
        list.add(2);
        list.add(1);


         // printing all the element in the ArrayList 
        System.out.println(list);

        // Accessing the element in ArrayList. 
        System.out.println(list.get(3));

        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        // Changing or updating the value in ArrayList. 
        list.set(2, 3);

        // printing all the element in the ArrayList 
        System.out.println(list);


        // Adding element in between the arrayList 
        list.add(1, 6);

        System.out.println(list);

        // removing the element 
        list.remove(2);
        System.out.println(list);

        // finding out the size of the ArrayList 
        int size = list.size();
        System.out.println(size);

        // sorting the arraylist using collections framework
        Collections.sort(list);
        System.out.println(list);
    }
}
