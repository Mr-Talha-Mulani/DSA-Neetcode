class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currSum1 = 0;
        int currSum2 = 0;
        int totalSum = 0;
        for(int e : nums){
            currSum1 += e;
            currSum2 += e;
            totalSum += e;
            maxSum = Math.max(maxSum, currSum1);
            minSum = Math.min(minSum, currSum2);
            if(currSum1 < 0){
                currSum1 = 0;
            }
            if(currSum2 > 0){
                currSum2 = 0;
            }
        }
        if(minSum == totalSum){
            return maxSum;
        }
        return Math.max(maxSum, (totalSum - minSum));
    }
}