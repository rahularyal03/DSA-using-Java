public class Subarrays {
   public static void subArray(int array[]){
        int i, j, k, ts=0;
        for(i=0; i<array.length; i++){
            for(j=i; j<array.length; j++){
                for(k=i; k<=j; k++){
                    System.out.print(array[k]+" ");
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub arrays are: " +ts);
   }
    public static void main(String args[]){
        int numbers[] = {2,3,4,5,6};
        subArray(numbers);
    }
    
}
