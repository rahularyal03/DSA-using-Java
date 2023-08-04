public class Mergesort {

    // creating conquer recursive function 
    static void conquer(int arr[], int low, int mid, int high){
       
        // creating temporary array to store sorted result 
        int sortedArray[] = new int[high-low + 1];

        // low of left hand side array 
        int i = low;

        // low of right hand side array 
        int j = mid + 1;

        // creating variable k as index for newly created temp array. 
        int k = 0;

        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                sortedArray[k]=arr[i];
                i++;
                k++;
            }
            else{
                sortedArray[k]= arr[j];
                j++; k++;
            }
        }

        while(i <= mid){
            sortedArray[k] = arr[i];
            k++;i++;

        }

        while(j <= high){
            sortedArray[k] = arr[j];
            k++; j++;
        }

    //    transfering the data of temp array to original array. 

        for(i = 0, j = low; i<sortedArray.length; i++, j++){
            arr[j] = sortedArray[i];
        }
    }

    // creating divide recursive function 
    static void sort(int arr[], int low, int high){
        // base case 
        if(low>=high){
            return;
        }

        int mid = low + (high - low)/2;
        // applying recursive function on left hand side array 
        sort(arr, low, mid);

        // applying recursive function on right hand side array 
        sort(arr, mid+1, high);

        // applying conquere method 
        conquer(arr, low, mid, high);

        
    }
    public static void main(String[] args){
        int array[] = {4, 6, 9, 1, 2, 0, 5, 8, 7, 3};
        int low = 0;
        int high = array.length - 1;
        sort(array, low, high);

        // Printing all array 
        System.out.println("The sorted array is: ");
        for(int i = low; i<=high; i++){
            System.out.print(array[i] + " ");
        }

    }
}
