import java.util.*;

public class StringsMethod{
    public static void main(String[] args){
        String str = new String("hey");
        System.out.println(str);


        // String str1 = "My name is Rahul Aryal.";
        // System.out.println(str1);

     
        // char a = str.charAt(0);
        // System.out.println(a);

        String str2 = "Heyy Boy";
        String str3 = "Heyy Boy";

        // if both string are equal, it will return 0
        // if first string is greater than the second one, then it will return +ve number.
        //if first string is smaller than the second one, then it will return -ve number.
        // Here a is smaller than b and it goes like this.

        
        // if(str2.compareTo(str3) == 0){
        //     System.out.println("both are equal.");
        // }


       

        // else if(str2.compareTo(str3) > 0){
        //     System.out.println("str2 is greater than the str3.");
        
        // }
        // else{
        //     System.out.println("Str2 is smaller than the str3.");
        // }

        //  if(str2 ==  str3){
        //     System.out.println("We cannot use this this method. It gives error in most of the result.");
        // }

        String str5 = "Rahul Aryal";
        System.out.println(str5.substring(6));
        System.out.println(str5.substring(6, 9));

        

    }
}