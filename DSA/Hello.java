public class Hello{
    static int addition(int a,int b, int c){
        int d = a + b + c;
        return d;
    }

    static void substraction(){
        int m = 6;
        int n = 2;
        int c = m-n;
        System.out.print(c);
    }
    
    public static void main(String[] args){
        int a = 6;
        int b = 3;
        int c = 3;
        
        int e =addition(a, b, c);
        System.out.println(e);

        substraction();
    }
}