import java.io.*;
import java.util.*;

public class HasNext {
   


    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int i=1;

        // has.next returns the boolean value (true or false) 
        while (sc.hasNextInt()) {
        	String s=sc.nextLine();
        	System.out.println(i + " " + s);
        	i++;
        }
        
    }
}

