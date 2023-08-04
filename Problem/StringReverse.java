package Problem;

public class StringReverse {
    // This is printing the string into reverse order using Iteration method 
    static void reverItr(){
        String name= "Hell";
        for( int i = 0; i<=name.length()-1; i++){
            System.out.print(name.charAt(name.length()-i-1));
        }
    }

    // This is printing the string into reverse order using recursion method 
    static void reverRec(String a , int ind){
       if(ind == 0) {
        System.out.print(a.charAt(0));
        return;
        }

        System.out.print(a.charAt(ind));
        reverRec(a, ind-1);
    }
public static void main(String[] args){
    // This commented one is for iterative method 
    // reverItr();

     String a = "Rahul Aryal";
     int ind = a.length()-1;
      reverRec(a, ind);
       
    }
}
