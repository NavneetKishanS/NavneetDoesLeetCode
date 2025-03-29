class Solution {
    public boolean isPalindrome(String s) {
        // String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String cleaned2 = s.toLowerCase();
        int l = 0; int r = cleaned2.length() - 1;
        while(l<=r){
            char cl = cleaned2.charAt(l); char cr = cleaned2.charAt(r);
            if(!Character.isLetterOrDigit(cl)){l++;}
            else if(!Character.isLetterOrDigit(cr)){r--;}
            else{
                if(cl!=cr){
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
