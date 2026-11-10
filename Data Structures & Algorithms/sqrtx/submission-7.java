class Solution {
    public int mySqrt(int x) {
       long l = 1;
       long r = x;
       long mid = 0;
       long res = 0;
       while(l<=r){
        mid = l+(r-l)/2;
        if(mid*mid == x){
            return (int)mid;
        }
        else if((long)mid*mid > x){
            r = mid-1;
        }
        else{
            l = mid+1;
            res = mid;
        }
       } 
       return (int)res;
    }
}