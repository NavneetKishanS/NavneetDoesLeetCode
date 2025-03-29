import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numb = new HashMap<Integer,Integer>();
        for(int i =0; i<nums.length; i++){
            int a = nums[i];
            int more = target - a;
            int[] res = new int[2];
            if(numb.containsKey(more)){
                res[0] = i;
                res[1] = numb.get(more);
                return res;
            }
            numb.put(a,i);
        }
        return null;
    }
}
