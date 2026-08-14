class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer, Integer> h = new HashMap<>();
       for(int i = 0; i<nums.length; i++){
        int k = nums[i];
        h.put(k, h.getOrDefault(k, 0)+1);
        if(h.get(k) == 2){
            return true;
        }
       }
       return false;
    }
}