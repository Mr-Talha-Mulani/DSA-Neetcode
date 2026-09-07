class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0) return n;
        int start = 0;
        int end = 0;
        int max = 1;
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        while(end < n){
            int idx = s.charAt(end);
            if(hash[idx] == -1){
                hash[idx] = end;
            }
            else{
                start =  Math.max(start, hash[idx] + 1);
                hash[idx] = end;
            }
            end++;
            max = Math.max(max, (end-start));
        }
        return max;
    }
}
