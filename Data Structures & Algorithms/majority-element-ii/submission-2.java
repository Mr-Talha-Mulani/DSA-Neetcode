class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int num1 = 0, num2 = 0;
        int cnt1 = 0, cnt2 = 0;
        int n = nums.length;
        for(int num : nums){
            if(num == num1){
                cnt1++;
            }
            else if(num == num2){
                cnt2++;
            }
            else if(cnt1 == 0){
                cnt1++;
                num1 = num;
            }
            else if(cnt2 == 0){
                cnt2++;
                num2= num;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int num : nums){
            if(num == num1){
                cnt1++;
            }
            else if(num == num2){
                cnt2++;
            }
        }
        if(cnt1 > n/3){
            ans.add(num1);
        }
        if(cnt2 > n/3){
            ans.add(num2);
        }
        return ans;
    }
}