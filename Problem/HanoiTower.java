package Problem;

public class HanoiTower {
    static void hanoi(int n, String s, String h, String d){
        if(n == 1){
            System.out.println("Transfer disk " + n +" from " + s +" to " + d);
            return;
        }
        hanoi(n-1, s, d, h);
        System.out.println("Transfer disk " + n + " from " + s +" to " + d);
        hanoi(n-1, h, s, d);


    }
    public static void main(String[] args){
        hanoi(3, "S", "H", "D");
    }
}
