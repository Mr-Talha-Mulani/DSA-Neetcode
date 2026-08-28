class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int i = 0; i<=nums.length; i++){
            bucket[i] = new ArrayList<>();
        }
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i : nums){
            h.put(i, h.getOrDefault(i, 0)+1);
        }
        for(int i : h.keySet()){
            int freq = h.get(i);
            bucket[freq].add(i);
        }
        int idx = 0;

for (int freq = nums.length; freq >= 1 && idx < k; freq--) {
    for (int num : bucket[freq]) {
        ans[idx++] = num;

        if (idx == k) {
            break;
        }
    }
}      
return ans;
    }
}
