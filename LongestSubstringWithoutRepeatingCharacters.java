class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int l =0; int r =0;
        int maxLen = 0;
        while(r<s.length()){
            if(!hs.contains(s.charAt(r))){
                hs.add(s.charAt(r));
                maxLen=Math.max(maxLen, r-l+1);
                r++;
            }
            else{
                hs.remove(s.charAt(l));
                l++; 
            }
        }
        return maxLen;
    }
}
