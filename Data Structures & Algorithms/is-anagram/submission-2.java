class Solution {
    public boolean isAnagram(String s, String t) {
        char[] char1=s.toCharArray();
        Arrays.sort(char1);
        char[] char2=t.toCharArray();
        Arrays.sort(char2);
        if(new String(char1).equals(new String(char2))){
            return true;
        }
        return false;
    }
}
