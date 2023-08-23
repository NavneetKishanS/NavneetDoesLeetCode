class Solution {
    public int reverse(int x) {
        /*
        //when reversing only 3 digits: 
        int a = x/100;
        int b = (x / 10) % 10;
        int c = x%10;
            return (c * 100 + b * 10 + a);
        */
        int rev =0;

        while(x!=0)
        {
            int num = x%10;

            
            if (rev < (Integer.MIN_VALUE / 10) || rev > (Integer.MAX_VALUE / 10)) {
                return 0;
            }

            rev = (rev*10) + num;
            x =x/10;
        }
        
        return rev;

    }
}
