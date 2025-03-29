class Solution {
    public int maxArea(int[] height) {
        int l =0; int r = height.length - 1;
        int cap = 0;
        while(l<r){
            int h = Math.min(height[l],height[r]);
            int area = (r-l)*h;
            cap = Math.max(cap, area);

            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return cap;
    }
}
