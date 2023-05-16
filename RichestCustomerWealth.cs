//LeetCode Solution
//Problem : Richest Customer Wealth (1672)
//Author: Navneet Kishan Srinivasan
//Date: 16 May 2023
//Runtime: 89 ms
//Memory: 39.3 MB
public class Solution {
    public int MaximumWealth(int[][] accounts) {
        int[] wealthSum = new int[accounts.Length];
        for(int i=0;i<accounts.Length;i++){
            int rowSum=0;
            for(int j=0;j<accounts[i].Length;j++){
                rowSum += accounts[i][j];
            }
            wealthSum[i] = rowSum;
        }
        int Max=wealthSum[0];
        for(int k=0;k<wealthSum.Length;k++){
            if(wealthSum[k]>Max){
                Max = wealthSum[k];
            }
        }
        return Max;
    }
}
