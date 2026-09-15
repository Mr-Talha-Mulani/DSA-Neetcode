class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int n = operations.length;
        for(int i = 0; i<n; i++){
            String op = operations[i];
                if(op.equals("+")){
                    int a = st.pop();
                    int b = st.peek();
                    st.push(a);
                    st.push(a+b);
                }
                else if(op.equals("D")){
                    int a = st.peek();
                    st.push(a*2);
                }
                else if(op.equals("C")){
                    st.pop();
                }
                else{
                    st.push(Integer.parseInt(op));
                }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}