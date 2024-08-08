package Hashing;
/*Find Frequency of digits in an array*/

import java.util.Map;
import java.util.HashMap;

public class CountDigit {
    public static Map<Integer,Integer> doMapping(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i<arr.length ; i++){
            int key = arr[i];
            if (map.containsKey(key)){
                map.put(key, map.get(key)+1);
            } else {
                map.put(key,1);
            }
        }
        return map;
    }
}