package Problem;

public class FibonacciSequence {
    static void fibonacci(int n, int a, int b, int count){
        if(count == n){
            return;
        }
        count += 1;
        int c = a + b;
        
        System.out.print(c + ", ");
        fibonacci(n, b, c, count);
    }
    public static void main(String[] args){
        System.out.print(0 + ", " + 1 +", ");
        fibonacci(8, 0, 1, 0);

    }
}
