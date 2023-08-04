import java.util.Scanner;

public class FindingReverseOfANumber {
    public static void main(String args[]){
        System.out.print("Enter the Number whose reverse you want to find: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        

        while(number>0) {
        int lastdigit = number % 10;
        number /= 10;
         System.out.print(lastdigit);
    }
}
}


// import java.util.Scanner;

// public class FindingReverseOfANumber {
//     public static void main(String args[]){
//         System.out.print("Enter the Number whose reverse you want to find: ");
//         // Scanner num = new Scanner(System.in);
//         // int number = num.nextInt();
//         int number = 345, reverse = 0;

//         while(number != 0) {
//         int lastdigit = number % 10;
//         reverse = reverse *10 + lastdigit;

//         number /= 10;
//     }

//         System.out.print(reverse);
// }
// }
