
// finding x power n for height of stack logn 
package Problem;
public class Xpower{
    static int xpower(int x, int n){
        if (n == 0){
            return 1;
        }

        if(x == 0){
            return 0;
        }
// x^n = x^(n/2) * x^(n/2) ----> for even 

        if(n % 2 == 0){
            return xpower(x, n/2) * xpower(x, n/2);
        }

// x^n = x^(n/2) * x^(n/2) * x ----> for odd

        else{
            return xpower(x, n/2) * xpower(x, n/2) * x ; 

        }
    }
    public static void main(String[] args){
        int ans = xpower(2, 5);
        System.out.println(ans);
    }
}