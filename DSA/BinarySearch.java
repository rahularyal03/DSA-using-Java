public class BinarySearch {
    public static void main(String args[]){
        int num[]={2,4,5,6,7,8,9,10};
      int res = binarySearch(num, 6);
        if(res==-1){
            System.out.print("Element not found!!!.");
        }

        else{
            System.out.print("Element found at index: " + res);

        }
    }
    
    public static int binarySearch(int array[], int n){
        int low = 0, high = array.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(array[mid] == n){
                return mid;
            }

            if(array[mid]>n){
                high=mid-1;
            }

            else{
                low=mid+1;
            }
                }
        return -1;
    }
}
