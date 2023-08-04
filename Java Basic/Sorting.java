public class Sorting {
    public static void bubbleSort(int array[]) {
        int i, temp;
        int n = array.length;
        for (int j = 0; j < n - 1; j++) {
            for (i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (i = 0; i <= n - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }


    

    public static void main(String args[]) {
        int number[] = { 10, 2, 6, 7, 3, 9, 1, 8, 4, 5 };
        bubbleSort(number);
    }

}
