import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        // HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int[] cnts = new int[26];
        for( int i=0; i<s.length();i++){
            cnts[s.charAt(i)-'a']++;
            cnts[t.charAt(i)-'a']--;
        }
        for(int c : cnts){
            if(c != 0){return false;}
        }
        return true;
    }
}
