class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int a = 0;
        int b = 0;
        int n = word1.length();
        int m = word2.length();
        while(a<n && b<m){
            ans.append(String.valueOf(word1.charAt(a)));
            ans.append(String.valueOf(word2.charAt(b)));
            a++;
            b++;
        }
        while(a<n){
            ans.append(String.valueOf(word1.charAt(a)));
            a++;
        }
        while(b<m){
            ans.append(String.valueOf(word2.charAt(b)));
            b++;
        }
        return ans.toString();
    }
}