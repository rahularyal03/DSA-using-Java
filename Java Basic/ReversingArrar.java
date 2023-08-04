public class ReversingArrar {
    public static void reverse(int array[]){
        int low = 0, high = array.length-1, temp;

        while(low<high){
            temp=array[high];
            array[high]=array[low];
            array[low]=temp;

            low++;
            high--;
        }

    }
    public static void main(String args[]){
       int numbers[]= {1,2,3,4,5,6};
        reverse(numbers);
        for(int i = 0; i<numbers.length; i++){
            
        System.out.print(numbers[i]+"\t");
    }
    }

   
}
