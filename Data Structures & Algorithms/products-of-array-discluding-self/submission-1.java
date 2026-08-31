class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int j = n-1;
        int pre = 1;
        int post = 1;
        for(int i = 0; i<n; i++){
            prefix[i] = pre*nums[i];
            pre = prefix[i];
            postfix[j] = post*nums[j];
            post = postfix[j];
            j--;
        }
         pre = 1;
         post = 1;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            if(i == 0){
                pre = 1;
            }
            else{
                pre = prefix[i-1];
            }
            if(i == n-1){
                post = 1;
            }
            else{
                post = postfix[i+1];
            }
            ans[i] = pre*post;
        }
        return ans;
    }
}  
