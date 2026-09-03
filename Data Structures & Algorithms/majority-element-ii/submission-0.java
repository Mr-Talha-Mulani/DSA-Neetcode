class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i<n; i++){
            h.put(nums[i], h.getOrDefault(nums[i], 0)+1);
        }
        int threshold = n/3;
        for(int e : h.keySet()){
            int freq = h.get(e);
            if(freq>threshold){
                ans.add(e);
            }
        }
        return ans;
    }
}