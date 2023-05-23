//LeetCode Solution
//Problem : Remove Element (27)
//Author: Navneet Kishan Srinivasan
//Date: 23 May 2023
//Runtime: 151  ms
//Memory: 42.6  MB
public class Solution {
    public int RemoveElement(int[] nums, int val) {
        /*List<int> list = new List<int>();
        for(int i =0; i<nums.Length;i++){
            while(nums[i]!=val){
                list.Add(nums[i]);
            }
        }
        return list.Count;*/

        int k=0;
        foreach(int j in nums){
            if(j!=val){
                nums[k++] =j;
            }
        }
        return k;
    }
}
