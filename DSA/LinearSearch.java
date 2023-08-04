public class LinearSearch{
    static int linear_search(int arr[], int element){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] == element){
                return i;
            }          
        }
        return -1;

    }
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 4 , 5};
        int res = linear_search(arr, 6);

        if(res == -1){
        System.out.print("Element not found....");

        }

        else{
        System.out.print("Element found at index: "+ res);

        }
        
    }
}