class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            if(!Character.isLetterOrDigit(c)){
                continue;
            }
            sb.append(c);
        }
        String k = sb.toString().toLowerCase();
        int i = 0;
        int j = k.length()-1;
        while(i<j){
            if(k.charAt(i) != k.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
