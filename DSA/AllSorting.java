
public class AllSorting{

    static void bubblesort(int array[]){
        int i, j, temp;

        for(i = 0; i < array.length-1; i++){
            for (j = 0; j < array.length-i-1; j++ ){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        
    }



    static void selectionsort(int array[]){
        int i, j, temp;

        for(i=0 ; i < array.length-1; i++){
            int min = i;

            for(j = i; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j; 
                }

               
               
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;

            }
        }


        static void insertionsort(int array[]){
            int i, j, temp;
            for(i = 1; i<array.length; i++){
                j = i-1;
                temp = array[i];
                while(j >= 0 && temp < array[j]){
                    array[j+1] = array[j];
                    j--;
                }

                array[j+1] = temp;
                }
            }
        

    

    static void printarray(int array[]){
        int i;
        System.out.print("The sorted array is: ");
        for(i = 0; i< array.length; i++ ){
            System.out.print(array[i]);
            System.out.print(" ");

        }
    }
    public static void main(String args[]){
        int array[] ={ 4, 2, 8, 5, 9, 1, 3, 0};

        bubblesort(array);
        printarray(array);

        System.out.println();
        int arr1[] = {3, 4, 2, 5, 1, 6, 9};
        selectionsort(arr1);
        printarray(arr1);
        System.out.println();



        int arr2[]= {5, 8, 9, 1, 4, 3};
        insertionsort(arr2);
        printarray(arr2);
        System.out.println();

    }

}
