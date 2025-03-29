// beats 99%

class Solution {
    public boolean isPalindrome(String s) {
        // String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //String cleaned2 = s.toLowerCase();
        int l = 0; int r = s.length() - 1;
        while(l<=r){
            char cl = s.charAt(l); char cr = s.charAt(r);
            if(!Character.isLetterOrDigit(cl)){l++;}
            else if(!Character.isLetterOrDigit(cr)){r--;}
            else{
                if(Character.toLowerCase(cl)!=Character.toLowerCase(cr)){
                    return false;
                }
                l++; r--;
            }
            
            // if(cleaned.charAt(l) != cleaned.charAt(r)){
            //     return false;
            // }
            // l++;
            // r--;
        }
        return true;
    }
}
