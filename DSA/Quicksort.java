public class Quicksort{
    static int partition(int array[], int low, int high){
        int pivot = array[high];
        int i = low-1;

        int temp;

        for(int j = low; j<=high-1; j++){
            if(array[j]<pivot){
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }

        }
        temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return (i+1);
    }

    static void quickSort(int array[], int low, int high){
        if(low<high){
        int pivot = partition(array, low, high);
        quickSort(array, low, pivot-1);
        quickSort(array, pivot+1, high);
        }
    }
    public static void main(String[] args){
        int array[] = {5, 2, 8, 9, 4, 1, 7, 3, 6, 0};
        int low = 0;
        int high = array.length-1;
        quickSort(array, low, high);
        for(int i =0; i<=high; i++){
            System.out.print(array[i] + " ");
        }
    }
}