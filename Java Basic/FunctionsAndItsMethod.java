public class FunctionsAndItsMethod {

    // these two are the example of function overloading too

    // Here is one example using void with parameters 
    public static void sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    // Here is the another example of fuction using int as returnType with parameters 
    public static int sum(int a, int b, int c){
        return (a+b+c);
    }

    // Calling of functions 
    public static void main(String args[]){
     sum(4, 5);

    System.out.print(sum(4, 5, 6));
     



    }
    
}
