package Problem;

public class P3 {
    public static void main(String[] args){
        int n = 10;
        if(n == 1 || n==0){
            System.out.println(1);

        }

        else{
            int res = 1;
            for(int i = 1; i<= n; i++){
                 res *= i;
            }

            System.out.println(res);
        }
    }
}
