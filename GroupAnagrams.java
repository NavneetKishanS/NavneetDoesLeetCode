class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0||strs == null){return new ArrayList();}
        Map<String,List<String>> mp = new HashMap<>();
        for(String s: strs){
            String fs = getFreqStr(s);

            if(mp.containsKey(fs)){
                mp.get(fs).add(s);
            }else{
                List<String> strLs = new ArrayList<>();
                strLs.add(s);
                mp.put(fs, strLs);
            }
        }
        return new ArrayList<>(mp.values());
    }
    private String getFreqStr(String str){
        int[] freq = new int[26];
        for(int i =0; i< str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }
        StringBuilder freqStr = new StringBuilder("");
        char c = 'a';
        for(int i: freq){
            freqStr.append(c);
            freqStr.append(i);
            c++;
        }
        return freqStr.toString();
    }
}
