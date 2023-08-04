public class ConditionalStatement {
    public static void main(String args[]){
        int a = 19;
        int b = 9;
        int c = 69;
        
        if(a>b  && a>c){
            System.out.print("A is the largest number.");

        }

        else if (b>c){
            System.out.print("B is the largest number.");

        }

        else if(c>b){
            System.out.print("C is the largest number.");            
        }

        else {
            System.out.print("All numbers are equal.");
        }


    }

}
