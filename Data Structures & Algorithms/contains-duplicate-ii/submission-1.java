class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> h = new HashSet<>();

        for (int end = 0; end < nums.length; end++) {

            if (h.contains(nums[end])) {
                return true;
            }

            h.add(nums[end]);

            if (h.size() > k) {
                h.remove(nums[end - k]);
            }
        }

        return false;
    }
}