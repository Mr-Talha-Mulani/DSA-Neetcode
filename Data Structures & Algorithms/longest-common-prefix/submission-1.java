class Solution {
    public String longestCommonPrefix(String[] strs) {
        int[][] idx = new int[strs.length][2];
        for(int i = 0; i<strs.length; i++){
            idx[i][0] = strs[i].length();
            idx[i][1] = i;
        }
        Arrays.sort(idx, (a, b) -> Integer.compare(a[0], b[0]));
        String pivot = strs[idx[0][1]];
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<pivot.length(); i++){
            char ch = pivot.charAt(i);
            int cnt = 0;
            int id = 0;
            while(id < strs.length && strs[id].charAt(i) == ch){
                cnt++;
                id++;
            }
            if(cnt == strs.length){
                ans.append(ch);
            } else {
                break;
            }
        }
        return ans.toString();
    }
}