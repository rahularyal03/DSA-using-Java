import java.util.*;
public class Array{
    public static void main(String[] args){
        int[] num = new int[5];

// We can store the number in array using prompt like this 
        for(int i=0; i<num.length; i++){
            System.out.println("Enter number "+i+": ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            
            num[i]= number;
        }
        System.out.print("The numbers in array are: ");
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }

        // We can print whole array in this way 
        System.out.println();
        for(int element : num)
        System.out.print(element + " ");
        
        

    }
}