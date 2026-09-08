class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int max = 1;
        int[] hash = new int[26];
        int mostFreq = 0;
        char most = '0';
        while(r < n){
            hash[s.charAt(r)-'A']++;
            if(mostFreq < hash[s.charAt(r)-'A']){
                mostFreq = hash[s.charAt(r)-'A'];
                most = s.charAt(r);
            }
            if((r-l+1) - hash[most-'A'] <= k){
                max = Math.max(r-l+1, max);
            }
            else{
                hash[s.charAt(l)-'A']--;
                l++;
            }
            r++;
        }
        return max;
    }
}
