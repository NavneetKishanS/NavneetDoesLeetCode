//LeetCode Solution
//Problem : Two Sum (1)
//Author: Navneet Kishan Srinivasan
//Date: 25 March 2023
//Runtime: 173 ms
//Memory: 44.2 MB
public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        for(int i =0;i<nums.Length;i++){
            for(int j =i+1;j<nums.Length;j++){
                if((nums[i]+nums[j])==target){
                    return new int[]{i,j};
                }
            }
        }return null;
    }
}
