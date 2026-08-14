class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int comp = target - nums[i];
            if(h.containsKey(comp)){
                int k = h.get(comp);
                if(k<i){
                    return new int[]{k, i};
                }
                    return new int[]{i, k};
            }
            h.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
