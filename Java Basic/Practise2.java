// public class Practise2 {
//     public static void main(String args[]){
//         // for(int i=1; i<=5; i++){
//         //     for(int j=1; j<=i; j++){
//         //         System.out.print(j);
//         //     }
//         //     System.out.println();
//         // }


//          char a = 'a';

//         for(int i= 1; i<=5; i++){
//             for(char j=1; j<=i; j++){
//                 System.out.print(j);
//             }
            
//             System.out.println(); 
//         }
// }
// }



// finding factorial of a given number 

import java.util.*;

public class Practise2{

    public static int factorial(int a){
        int f = 1;
        for(int i=1; i<=a; i++){
            f = f*i;
            
        }
        return f;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        System.out.print(factorial(num));


    }
}