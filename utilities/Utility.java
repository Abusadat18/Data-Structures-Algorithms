package utilities;

public class Utility {
    public static void printArr(int[] arr){
        System.out.print("[ ");
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        System.out.print("]");
    }

    public static void swapInArray(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
