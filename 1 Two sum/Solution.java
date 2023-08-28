import java.util.Arrays;
import java.util.Hashtable;

public class Solution {
    public int[] twoSum(int[] arr, int target) {
        // Create a Hashtable
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (ht.containsKey(complement) && ht.get(complement) != i) {
                return new int[] { i, ht.get(complement) };
            } else {
                ht.put(arr[i], i);
            }

        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(new Solution().twoSum(arr, target)));

    }
}