class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        int idx = 0;
        while(idx < n){
            if(s.isEmpty()){
                s.push(idx);
            }
            else if(temp[s.peek()] >= temp[idx]){
                s.push(idx);
            }
            else{
               while(!s.isEmpty() && temp[s.peek()] < temp[idx]){
                 int i = s.pop();
                ans[i] = Math.abs(idx-i);
               }
               s.push(idx);
            }
               idx++;
        }
        while(!s.isEmpty()){
            ans[s.pop()] = 0;
        }
        return ans;
    }
}
