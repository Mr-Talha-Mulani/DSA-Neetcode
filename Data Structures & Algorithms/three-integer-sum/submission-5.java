class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum > 0){
                    r--;
                }
                else if(sum < 0){
                    l++;
                }
                else{
                    List<Integer> a = List.of(nums[i], nums[l], nums[r]);
                    ans.add(a);
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]){l++;}
                    while(r>0 && nums[r] == nums[r+1]){r--;}
                }
            }
        }
        return ans;
    }
}
