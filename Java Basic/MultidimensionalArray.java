import java.util.*;
public class MultidimensionalArray {
    public static void main(String[] args){
       int m = 3, n=3;
        int array[][] = new int [m][n];
        for(int i = 0; i<=m-1; i++){
            for(int j = 0; j<=n-1; j++){
                Scanner sc = new Scanner(System.in);
                array[i][j] = sc.nextInt();
                
            }
         
        }

        System.out.println();

        for(int i = 0; i<=m-1; i++){
            for(int j = 0; j<=n-1; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
            }
    }

}
