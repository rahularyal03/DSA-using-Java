package Problem;

public class SumOfNaturalNumber {

    static void sumNat(int i, int n, int sum){
        if(i == n){
            sum += n;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumNat(i+1, n , sum);
    }
    public static void main(String[] args){
        sumNat(1, 5, 0);
       
    }

    
}
