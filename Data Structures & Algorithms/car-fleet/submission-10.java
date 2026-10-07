class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] dual = new double[n][2];
        for(int i = 0; i<n; i++){
                dual[i][0] = position[i];
                double time = (double)(target-position[i])/speed[i];
                dual[i][1] = time;
        }
        Arrays.sort(dual, (a,b) -> Double.compare(b[0], a[0]));
        Stack<Double> s = new Stack<>();
        for(int i = 0; i<n; i++){
                if(s.isEmpty()){
                        s.push(dual[i][1]);
                }
                else{
                        if(s.peek() < dual[i][1]){
                                s.push(dual[i][1]);
                        }
                }
        }
        return s.size();
    }
}
