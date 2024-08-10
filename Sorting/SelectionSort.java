package Sorting;

import utilities.Utility;

public class SelectionSort {
    public static void sort (int[] arr){
        for (int i=0 ; i<=arr.length-2 ; i++){
            int minIndex = i;
            for (int j=i ; j<=arr.length-1 ; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
