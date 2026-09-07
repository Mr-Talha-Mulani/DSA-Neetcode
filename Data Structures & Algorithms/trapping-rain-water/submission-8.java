class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int lm = height[0];
        int rm = height[n-1];
        int total = 0;
        int i = 0;
        while(l<r){
           if(lm < rm){
            l++;
            lm = Math.max(lm, height[l]);
            total += lm-height[l];
           }
           else{
            r--;
            rm = Math.max(rm, height[r]);
            total += rm-height[r];
           }
        }
        return total;
    }
}
