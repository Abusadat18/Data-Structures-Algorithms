import Hashing.CountDigit;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,5,5};
        Map<Integer,Integer> Hashed = CountDigit.doMapping(arr);
        System.out.println(Hashed);
    }
}
