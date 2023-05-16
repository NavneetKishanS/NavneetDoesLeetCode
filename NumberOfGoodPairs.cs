//LeetCode Solution
//Problem : Number of Good Pairs (1512)
//Author: Navneet Kishan Srinivasan
//Date: 16 May 2023
//Runtime: 87 ms
//Memory: 38.4 MB
public class Solution {
    public int NumIdenticalPairs(int[] nums) {
        int pairCnt = 0;
        for(int i=0;i<nums.Length;i++){
            for(int j=0;j<nums.Length;j++){
                if(nums[i]==nums[j] && i<j){
                    pairCnt++;
                }
            }
        }
        return pairCnt;
    }
}
