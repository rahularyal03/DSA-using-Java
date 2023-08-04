public class LinearSearch{
    public static int linearSearch(int array[], int e){
        for(int i=0; i<array.length; i++){
            if(e==array[i]){
                return i;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int array[] = {2, 5, 3, 7, 1,0};
        int e = 0;
        int res = linearSearch(array, e);
        if(res == -1){
            System.out.print("Element not found.");
        }

        else{
            System.out.print("Element is found on idex :"+ res);
        }

    }
}