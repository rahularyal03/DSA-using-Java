package Problem;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class P2{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x =sc.nextInt();
                // Complete this line
               System.out.printf("%-15s",s1);
               DecimalFormat ft = new DecimalFormat("000");
               System.out.printf(ft.format(x));
                
               System.out.println();
                
            }
            System.out.println("================================");
            sc.close();

    }
}