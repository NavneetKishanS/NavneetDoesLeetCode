//LeetCode Solution
//Problem : Remove Duplicates from Sorted Array (26)
//Author: Navneet Kishan Srinivasan
//Date: 23 May 2023
//Runtime: 148  ms
//Memory: 46.9  MB
using System.Linq;
public class Solution {
    public int RemoveDuplicates(int[] nums) {
        int[] Arr = nums.Distinct().ToArray();
        int k = Arr.Length;
        for(int i=0;i<k;i++){
            nums[i]=Arr[i];
        }
        return Arr.Length;
    }
}
