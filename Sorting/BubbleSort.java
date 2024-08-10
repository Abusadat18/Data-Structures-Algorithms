package Sorting;

import utilities.Utility;

public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i=arr.length-1 ; i>=1 ; i--){
            boolean flag = false;
            for (int j=0 ; j<=i-1 ; j++){
                if (arr[j] > arr[j+1]){
                    Utility.swapInArray(arr,j,j+1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
