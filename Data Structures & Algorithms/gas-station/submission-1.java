class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
       int total = 0;
       int resultIndex = 0;
       int gasSum = 0;
       int costSum = 0;
       for(int i = 0; i<n; i++){
            gasSum += gas[i];
            costSum += cost[i];
       }
       if(gasSum < costSum){
        return -1;
       }
       for(int i = 0; i<n; i++){
        total += gas[i]-cost[i];
        if(total < 0){
            total = 0;
            resultIndex = i+1;
        }
       } 
       return resultIndex;
    }
}
