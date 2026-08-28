class Solution {

    class pair{
        int val;
        int freq;
        pair(int val, int freq){
            this.val = val;
            this.freq = freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int[] ans = new int[k];
        for(int i : nums){
            h.put(i, h.getOrDefault(i, 0)+1);
        }
        pair[] set = new pair[h.size()];
        int idx = 0;
        for(int i : h.keySet()){
            pair p = new pair(i, h.get(i));
            set[idx] = p;
            idx++;
        }
        PriorityQueue<pair> maxHeap = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        for(pair e : set){
            maxHeap.offer(e);
        }
        idx = 0;
        while(k-- > 0){
            ans[idx] = maxHeap.poll().val;
            idx++;
        }
        return ans;
    }
}
