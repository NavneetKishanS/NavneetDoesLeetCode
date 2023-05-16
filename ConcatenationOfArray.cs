//LeetCode Solution
//Problem : Concatenation of Array (1929)
//Author: Navneet Kishan Srinivasan
//Date: 16 May 2023
//Runtime: 154 ms
//Memory: 48.5 MB
public class Solution {
   public int[] GetConcatenation(int[] nums) {
    int newArrLength = 2 * nums.Length;
    int[] arr = new int[newArrLength];

    for (int i = 0; i < nums.Length; i++) {
        arr[i] = nums[i];  
    }

    for (int i = 0; i < nums.Length; i++) {
        arr[i + nums.Length] = nums[i];  
    }

    return arr;
}

}
