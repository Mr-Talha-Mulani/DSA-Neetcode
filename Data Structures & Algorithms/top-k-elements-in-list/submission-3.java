class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int[] ans = new int[k];
        int idx = 0;
        for(int i : nums){
            h.put(i, h.getOrDefault(i, 0)+1);
        }
        int[][] res = new int[h.size()][2];
        for(int i : h.keySet()){
            res[idx][0] = i;
            res[idx][1] = h.get(i);
            idx++; 
        }
        Arrays.sort(res, (a,b) -> Integer.compare(b[1], a[1]));
        idx = 0;
        while(k-- > 0){
            ans[idx] = res[idx][0];
            idx++; 
        }
        return ans;
    }
}
