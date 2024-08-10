package Sorting;

import utilities.Utility;

public class InsertionSort {
    public static void sort(int[] arr){
        for (int i=0 ; i<=arr.length-1 ; i++){
            int j=i;
            while (j>0 && arr[j-1] > arr[j]){
                Utility.swapInArray(arr,j,j-1);
                j--;
            }
        }
    }
}
