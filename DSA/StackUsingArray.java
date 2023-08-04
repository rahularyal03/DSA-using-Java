class Stack{
    static final int MAX  = 1000;
    int top = -1;
    int st[] = new int[MAX];

    int isEmpty(){
        if(top == -1){
            return 1;
        }
        else{
            return 0;
        }
    }

    int isFull(){
        if(top == MAX){
            return 1;
        }

        else{
            return 0;
        }

    }

    void push(int element){
        int res;
        res = isFull();
        if(res == 1){
            System.out.println("The stack is already full.");
            }
        else{
            top++;
            st[top] = element;
        }
    }

        void pop(){
            int res = isEmpty();
            if(res ==1 ){
                System.out.println("The stack is already full.");

            }

            else{
                System.out.println("The element popped is "+ st[top]);
                top--;
            }
    }

    void peek(){
        System.out.println("The element on the top of the stack is: "+ st[top]);
    }

    void printst(){
        System.out.println("The element in the stack are: ");

        for(int i = 0; i<=top; i++){
            System.out.print(st[i] + " ");
        }
        System.out.println();
    }

}
public class StackUsingArray{
        public static void main(String[] args){
        Stack ref = new Stack();
        ref.push(5);
        ref.push(9);
        ref.push(1);
        ref.printst();
        ref.pop();
        ref.peek();
        ref.printst();

    }
}