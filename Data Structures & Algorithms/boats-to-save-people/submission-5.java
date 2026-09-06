class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int l = 0;
        int r = n-1;
        int ans = 0;
        while(l<=r){
            int front = people[l];
            int back = people[r];
            if(back+front <= limit){
                r--;
                l++;
            }
            else{
                r--;
            }
                ans++;
        }
        return ans;
    }
}