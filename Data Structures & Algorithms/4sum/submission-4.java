class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int one = nums[i];
            for(int j = i+1; j<nums.length; j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                continue;
            }
                int b = nums[j];
                int l = j+1;
                int r = nums.length-1;
                while(l<r){
                    long sum = (long)one+b+nums[l]+nums[r];
                    if(sum < target){
                        l++;
                    }
                    else if(sum > target){
                        r--;
                    }
                    else{
                        List<Integer> a = new ArrayList<>();
                        a.add(one);
                        a.add(b);
                        a.add(nums[l]);
                        a.add(nums[r]);
                        ans.add(a);
                        l++;
                        r--;
                    while(l<r && nums[l-1] == nums[l]){l++;}
                    while(l<r && nums[r+1] == nums[r]){r--;}
                    }
                }
            }
        }
        return ans;
    }
}