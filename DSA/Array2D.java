import java.util.*;
public class Array2D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row: ");
        int row = sc.nextInt();

        System.out.print("Enter the column: ");
        int column = sc.nextInt();
        int[][] array = new int[row][column];

        System.out.print("Enter the numbers: ");

        for(int i =0; i<row;  i++){
            for(int j = 0; j<column; j++){
                int num = sc.nextInt();

                array[i][j] = num;
            
            }
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

    }
}