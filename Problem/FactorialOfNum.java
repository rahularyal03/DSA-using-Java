package Problem;

public class FactorialOfNum {
    static int factorial(int num){
        if(num==1 || num==0){
            return 1;
        }

        int x = factorial(num-1);
        int y = num * x;
        
        return y; 
    }
    public static void main(String[] args){
        factorial(0);
    }
}
