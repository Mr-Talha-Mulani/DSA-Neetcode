class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int curSum = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0, 1);
        for(int i = 0; i<n; i++){
            curSum += nums[i];
            int diff = curSum - k;
            res += h.getOrDefault(diff, 0);
            h.put(curSum, h.getOrDefault(curSum, 0)+1);
        }
        return res;
    }
}