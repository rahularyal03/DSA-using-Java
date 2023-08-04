import java.util.*;
public class newtojava{
    public static void main(String[] args){
        System.out.print("Enter number a: ");
        Scanner num1 = new Scanner(System.in);
        int a = num1.nextInt();


        System.out.print("Enter the number b: ");
        Scanner num2 = new Scanner(System.in);
        int b = num2.nextInt();


        int sum = a + b;

        System.out.print("Sum: " + sum);
        
    }
}