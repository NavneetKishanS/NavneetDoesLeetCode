class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();

        List<Integer>[] freq= new List[nums.length + 1];

        for(int i = 0 ; i < freq.length;i++){
            freq[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(count.containsKey(nums[i])) count.put(nums[i] , count.get(nums[i]) + 1);
            else count.put(nums[i] , 1);
        }

        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int res[] = new int[k];
        for(int i = freq.length - 1 ; i > 0 && index < k; i--){
            for(int n : freq[i]){
                res[index++] = n;
                if(index == k) return res;
            }
        }

        return res;

    }
}
