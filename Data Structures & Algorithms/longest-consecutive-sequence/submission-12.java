class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n== 0){
            return 0;
        }
        HashSet<Integer> h = new HashSet<>();
        for(int e : nums){
            h.add(e);
        }
        int consec = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            int req = nums[i]-1;
            if(!h.contains(req)){
                while(h.contains(req+1)){
                    consec++;
                    req++;
                }
            }
            max = Math.max(max, consec);
            consec = 0;
        }
        return max;
    }
}
