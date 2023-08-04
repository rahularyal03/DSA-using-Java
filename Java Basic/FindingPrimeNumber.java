// public class FindingPrimeNumber {

//     public static void main(String[] args) {
  
//       int num = 29;
//       boolean flag = false;
//       for (int i = 2; i <= num / 2; ++i) {
//         // condition for nonprime number
//         if (num % i == 0) {
//           flag = true;
//           break;
//         }
//       }
  
//       if (!flag)
//         System.out.println(num + " is a prime number.");
//       else
//         System.out.println(num + " is not a prime number.");
//     }
//   }

// here true means composite and false means prime 

// import java.util.*;
// public class FindingPrimeNumber {

//     public static boolean Prime(int number){

       
//                 boolean primeNum = true;
//                 if(number==2)
//                 primeNum = false;
//                 for(int i = 2; i<number; i++){
//                     if(number%i==0)
//                     primeNum = false;
//                     break;
//                 } 
                
//         return primeNum;
//     }
//     public static void main(String args[]){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int number = input.nextInt();

//        System.out.print(Prime(number));
// }
    
// }


// OPTIMIZED VERSION 

import java.util.*;
public class FindingPrimeNumber {

    public static boolean Prime(int number){

                if(number==2)
                   return true;

                for(int i = 2; i<=Math.sqrt(number); i++){
                    if(number%i==0)
                        return false;
                        break;
                } 
               
                
        return true ;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

       System.out.print(Prime(number));
}
    
}






