import java.util.*;
public class ArrayMethod{
    public static void main(String[] args){
        
        int arr[] = new int[] {6, 4, 8, 3, 9,2, 1};

        Arrays.sort(arr);
       for(int i =0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
       }
    }
}